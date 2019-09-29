import fixture.SparkExamplesTestFixture

class APIDataDownLoaderTest extends SparkExamplesTestFixture{

  Scenario("Testing the APIDataDownLoader function"){
    Given("An API end point and Range of Provider Ids")
    val urlEndPoint = "https://openpaymentsdata.cms.gov/resource/7wx7-ns7v.json"
    val aPIDataDownLoader = new APIDataDownLoader(urlEndPoint,1000 to 2000)
    When("The APIDataDownloader method is invoked")
    val outputRdd = aPIDataDownLoader.getPhysicianData(spark)
    Then("It should return the API with Json data")
    outputRdd.first() must equal (1)
  }
}
