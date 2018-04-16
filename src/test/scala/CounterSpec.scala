import org.scalatest._

class CounterSpec extends WordSpec with MustMatchers {

  "Count" must {

    "return List() when given 0" in {
      Counter.count(0) mustEqual List()
    }


    "return List(0, 1, 2, 3, 4) when given 5" in {
      Counter.count(5)  mustEqual List(0, 1, 2, 3, 4)
    }

  }

}
