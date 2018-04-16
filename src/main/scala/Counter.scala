object Counter extends App {

  def count(input: Int): List[Int] = {
    val counter = {
      (0 until input).toList
    }
    counter
  }

  def onlyOdds(numList : List[Int]) : List[Int] = {

    val filtered = numList filter (_ %2 != 0)


    filtered
  }

  def oddAdder(odds : List[Int]) : Int = {

    val adder = odds.length

    adder
  }


}