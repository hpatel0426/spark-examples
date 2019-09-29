import org.scalamock.scalatest.MockFactory
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.must.Matchers

class APIDataDownLoaderTest extends org.scalatest.FeatureSpec with Matchers with GivenWhenThen with MockFactory{

  Scenario("Testing the APIDataDownLoader function"){
    Given("An API end point and Range of Provider Ids")
    val urlEndPoint = ""
    val aPIDataDownLoader =
    When("The APIDataDownloader method is invoked")

    Then("It should return the API with Json data")
  }
}
