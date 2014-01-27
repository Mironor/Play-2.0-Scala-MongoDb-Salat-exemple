package helpers
import play.api.test.{FakeApplication, WithApplication}

abstract class WithFakeApplication extends WithApplication(FakeApplication(additionalConfiguration = Map(
// I would be glad to know how to get this value from the config file instead of inlining it
  "mongodb.default.db" -> "tododb_test"
)))
