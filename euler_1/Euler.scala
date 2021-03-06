object Euler {

  def divisible(x: Int): Boolean = {
    x % 3 == 0 || x % 5 == 0
  }

  def sumOrOriginal(target: Int, addition: Int): Int = {
    if (divisible(target)) {
      return target + addition
    } else {
      return addition
    }
  }

  def recursiveSum(start: Int, limit: Int, sum: Int): Int = {
    if (start < limit) {
      return recursiveSum(start + 1, limit, sumOrOriginal(start, sum))
    } else {
      return sum
    }
  }

  def main(args: Array[String]) {
    println(recursiveSum(1, 1000, 0))
  }
}
