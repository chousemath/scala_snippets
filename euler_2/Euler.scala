object Euler {

  def fib(sum: Int, prev: Int, curr: Int, limit: Int): Int = {
    val next = prev + curr
    if (next < limit) {
      if (curr % 2 == 0) {
        fib(sum + curr, curr, next, limit)
      } else {
        fib(sum, curr, next, limit)
      }
    } else {
      sum + curr
    }
  }

  def main(args: Array[String]) {
    println(fib(0, 1, 1, 4000000))
  }
}
