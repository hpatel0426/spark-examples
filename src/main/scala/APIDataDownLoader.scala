import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import traits.DataFactory

import scalaj.http.Http

class APIDataDownLoader(apiEndPoint: String) extends DataFactory {

  override def getPhysicianData(sparkSession: SparkSession): RDD[String] = {
    val inputIds = sparkSession.sparkContext.parallelize(1000 until 2000)
    val dataRdd = inputIds.mapPartitions(_.map(x => {
      val response = Http(apiEndPoint).param("physician_profile_id", x.toString).asString
      if (response.code == 200) {
        response.body
      }
      else ""
    }))
    dataRdd
  }
}
