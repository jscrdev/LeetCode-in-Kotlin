package g0801_0900.s0891_sum_of_subsequence_widths

// #Hard #Array #Math #Sorting #2023_04_10_Time_481_ms_(100.00%)_Space_48.5_MB_(100.00%)

class Solution {
    // 1-6 (number of elements in between 1 and 6) = (6-1-1) = 4
    // length of sub seq 2 -> 4C0 3 -> 4C1 ; 4 -> 4c2 ; 5 -> 4C3  6 -> 4C4  4c0 + 4c1 + 4c2 + 4c3 +
    // 4c4 1+4+6+4+1=16
    // 1-5 3c0 + 3c1 + 3c2 + 3c3  = 8
    // 1-4 2c0 + 2c1 2c2 = 4
    // 1-3 1c0 + 1c1  = 2
    // 1-2 1c0 = 1
    /*
        16+8+4+2+1(for 1 as min) 8+4+2+1(for 2 as min)  4+2+1(for 3 as min)  2+1(for 4 as min)  1(for 5 as min)
        -1*nums[0]*31 + nums[1]*1 + nums[2]*2 + nums[3]*4 + nums[4]*8 + nums[5]*16
            -1*nums[1]*15 + nums[2]*1 +nums[3]*2 + nums[4]*4 + nums[5]*8
            -1*nums[2]*7 + nums[3]*1 + nums[4]*2 + nums[5]*4
            -1*nums[3]*3 + nums[4]*1 + nums[5]*2
            -1*nums[4]*1 + nums[5]*1

            -nums[0]*31 + -nums[1]*15 - nums[2]*7 - nums[3]*3 - nums[4]*1
            nums[1]*1 + nums[2]*3 + nums[3]*7 + nums[4]*15 + nums[5]*31

        (-1)*nums[0]*(pow[6-1-0]-1) + (-1)*nums[1]*(pow[6-1-1]-1) + (-1)*nums[2]*(pow[6-1-2]-1)
        ... (-1)* nums[5]*(pow[6-1-5]-1)
        + nums[1]*(pow[1]-1) + nums[2]*(pow[2]-1) + .... + nums[5]*(pow[5]-1)

        (-1)*A[i]*(pow[l-1-i]-1) + A[i]*(pow[i]-1)
     */
    fun sumSubseqWidths(nums: IntArray): Int {
        val mod = 1000000007
        nums.sort()
        val l = nums.size
        val pow = LongArray(l)
        pow[0] = 1
        for (i in 1 until l) {
            pow[i] = pow[i - 1] * 2 % mod
        }
        var res: Long = 0
        for (i in 0 until l) {
            res = (res + -1 * nums[i] * (pow[l - 1 - i] - 1) + nums[i] * (pow[i] - 1)) % mod
        }
        return res.toInt()
    }
}
