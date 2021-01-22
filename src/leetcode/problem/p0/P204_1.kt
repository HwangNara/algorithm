package leetcode.problem.p0

import kotlin.math.sqrt

fun main() {
    println(countPrimes(11))
    println(countPrimes(2))
    println(countPrimes(5))
    println(countPrimes(10))
}

fun countPrimes(input: Int): Int {
    val n = input - 1
    if (n < 2) return 0
    if (n == 2) return 1

    return (3..n step 2)
            .asSequence()
            .filter { isPrime(it) }
            .count() + 1
}

fun isPrime(n: Int): Boolean {
    for (i in 2..sqrt(n.toFloat()).toInt()) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
