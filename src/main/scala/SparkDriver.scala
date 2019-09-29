import org.apache.spark.sql.SparkSession

object SparkDriver extends App {

  val spark = SparkSession.builder.master("local[*]").getOrCreate()





}
