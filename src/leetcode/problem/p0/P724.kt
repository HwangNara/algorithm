package leetcode.problem.p0

fun main() {
    println(pivotIndex(intArrayOf(0, 0)))
    println(pivotIndex(intArrayOf(1, 7, 1)))
    println(pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
    println(pivotIndex(intArrayOf(1, 7, 4)))
}

fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var leftSum = 0
    var rightSum = 0

    nums.forEachIndexed{i, element ->
        rightSum = sum - leftSum - element
        if (leftSum == rightSum) {
            return i;
        }
        leftSum += element
    }

//    for ((i) in nums.withIndex()) {
//        rightSum = sum - leftSum - nums[i]
//        if (leftSum == rightSum) {
//            return i;
//        }
//        leftSum += nums[i]
//    }
    return -1
}
