object Counter extends App {

  def count(input: Int): Int = {
    val counter = (0 until input).toList
    val filtered = counter filter (_ %2 != 0)
    filtered.length
  }
}