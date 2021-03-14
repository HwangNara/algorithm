package leetcode.problem.p0

fun main() {
    val grid: Array<IntArray> = arrayOf(
            intArrayOf(1, 3, 1),
            intArrayOf(1, 5, 1),
            intArrayOf(4, 2, 1))
    println(minPathSum(grid))
}

fun minPathSum(grid: Array<IntArray>): Int {
    val m = grid.size;
    val n = grid[0].size;
    for (i in 0 until m) {
        for (j in 0 until n) {
            grid[i][j] += when {
                i == 0 && j == 0 -> 0
                i == 0 -> grid[0][j - 1]
                j == 0 -> grid[i - 1][0]
                else -> minOf(grid[i - 1][j], grid[i][j - 1])
            }
        }
    }
    return grid[m - 1][n - 1]
}
