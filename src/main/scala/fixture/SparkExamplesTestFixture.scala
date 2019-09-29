package fixture

import org.apache.spark.sql.SparkSession
import org.scalamock.scalatest.MockFactory
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.must.Matchers

abstract class SparkExamplesTestFixture extends org.scalatest.FeatureSpec with Matchers with GivenWhenThen with MockFactory {

  val spark = SparkSession.builder().master("local[*]").getOrCreate()
}
