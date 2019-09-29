package traits

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

trait DataFactory {

  def getPhysicianData(sparkSession:SparkSession):RDD[String]

}
