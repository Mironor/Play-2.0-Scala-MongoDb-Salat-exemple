package models

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import com.mongodb.casbah.commons.MongoDBObject
import play.api.PlayException
import org.specs2.specification.BeforeExample

import helpers._


@RunWith(classOf[JUnitRunner])
class TaskSpec extends Specification with BeforeExample {

  def before = new WithFakeApplication {
    TaskDAO.remove(MongoDBObject.empty)
  }

  "Task Model" should {

    "be addable to the database" in new WithFakeApplication {
      Task.create("Test Label")
      Task.all().size must equalTo(1)
    }

    "be deletable" in new WithFakeApplication {
      val taskIdOption = Task.create("Test Label")
      val taskId = taskIdOption.getOrElse(throw new PlayException(
        "Database error",
        "Could not get the ID of the created task, check your database configuration"
      )).toString

      Task.delete(taskId)

      Task.all().size must equalTo(0)
    }

  }
}
