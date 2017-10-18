// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?
object Euler {
  def isPrime(x: Int): Boolean = {
    if (x <= 1)
      false
    else if (x == 2)
      true
    else
      !(2 to (x - 1)).exists(i => x % i == 0)
  }

  def isDivisor(target: Int, divisor: Int): Boolean = target % divisor == 0

  def primeList(limit: Int): Int = {
    (2 to limit).filter((i: Int) => isPrime(i) && isDivisor(limit, i)).last
  }

  def main(args: Array[String]) {
    println("Hello from Euler 3")
    println(primeList(20000000))
  }
}
