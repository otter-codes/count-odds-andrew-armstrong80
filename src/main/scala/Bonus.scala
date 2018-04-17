object Bonus {

  def bonusAdder(salary : Int, bonus : Boolean) : String = {

    if (bonus) {
      val bonusAdded = (salary * 1.2).toInt
      s"£$bonusAdded"
    } else {
      s"£$salary"
    }
  }
}
