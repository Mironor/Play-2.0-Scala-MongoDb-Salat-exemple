package models

import play.api.Play.current
import play.api.PlayException

import com.novus.salat._
import com.novus.salat.dao._

import com.mongodb.casbah.commons.Imports._
import com.mongodb.casbah.MongoConnection

import com.novus.salat.Context

import mongoContext._



case class Task(_id: ObjectId = new ObjectId, label: String)

object TaskDAO extends SalatDAO[Task, ObjectId](
  collection = MongoConnection()(
    current.configuration.getString("mongodb.default.db")
      .getOrElse(throw new PlayException("Configuration error",
      "Could not find mongodb.default.db in settings"))
  )("tasks"))


object Task {
    def all(): List[Task] = TaskDAO.find(MongoDBObject.empty).toList

    def create(label: String): Option[ObjectId] = {
        TaskDAO.insert(Task(label = label))
    }

    def delete(id: String) {
        TaskDAO.remove(MongoDBObject("_id" -> new ObjectId(id)))
    }
}
