package g1701_1800.s1727_largest_submatrix_with_rearrangements

// #Medium #Array #Sorting #Greedy #Matrix
class Solution {
    fun largestSubmatrix(matrix: Array<IntArray>): Int {
        val m: Int = matrix.size
        val n: Int = matrix.get(0).size
        for (i in 1 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] = matrix[i - 1][j] + 1
                }
            }
        }
        var count = 0
        for (ints: IntArray in matrix) {
            ints.sort()
            for (j in 1..n) {
                count = Math.max(count, j * ints[n - j])
            }
        }
        return count
    }
}