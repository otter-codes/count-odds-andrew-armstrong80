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

  "onlyOdds" must {

    "return List(1, 3) when given List(0, 1, 2, 3, 4)" in {
      Counter.onlyOdds(List(0, 1, 2, 3, 4))  mustEqual List(1, 3)
    }
  }

  "oddAdder" must {

    "return 2 when given List(1, 3)" in {
      Counter.oddAdder(List(1, 3)) mustEqual 2
    }
  }


}
