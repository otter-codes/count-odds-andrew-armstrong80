import org.scalatest._


class BonusSpec extends WordSpec with MustMatchers {

  "bonusAdder" must {

    "return '£120' when given 100 and true" in {
      Bonus.bonusAdder(100, bonus = true) mustEqual "£120"

    }

    "return '£100' when given 100 and false" in {
      Bonus.bonusAdder(100, bonus = false) mustEqual "£100"
    }

    "return '£118' when given 99 and true" in {
      Bonus.bonusAdder(99, bonus = true) mustEqual "£118"
    }
  }
}
