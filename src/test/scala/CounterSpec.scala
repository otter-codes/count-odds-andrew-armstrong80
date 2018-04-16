import org.scalatest._

class CounterSpec extends WordSpec with MustMatchers {

  "Count" must {

    "return 0 when given 0" in {
      Counter.count(0) mustEqual 0
    }

    "return 4 when given 9" in {
      Counter.count(9) mustEqual 4
    }

    "return 2 when given 5" in {
      Counter.count(5) mustEqual 2
    }
  }
}
