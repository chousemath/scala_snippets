object Euler {

  def fib(sum: Int, prev: Int, curr: Int, limit: Int): Int = {
    val next = prev + curr
    println("prev: " + prev + ", curr: " + curr + ", next: " + next)
    var newSum = sum
    if (curr % 2 == 0) {
      newSum += curr
    }
    if (next < limit) {
      fib(newSum, curr, next, limit)
    } else {
      newSum
    }
  }

  def main(args: Array[String]) {
    println(fib(0, 1, 1, 4000000))
  }
}
