package leetcode.problem.p0

import kotlin.math.sqrt

fun main() {
    println(countPrimes(2))
}

fun countPrimes(input: Int): Int {
    val n = input - 1
    if (n < 2) return 0
    if (n == 2) return 1
    var count = 1
    for (i in 3..n step 2) {
        if (isPrime(i)) {
            count++
        }
    }
    return count
}

fun isPrime(n: Int): Boolean {
    for (i in 2..sqrt(n.toFloat()).toInt()) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
