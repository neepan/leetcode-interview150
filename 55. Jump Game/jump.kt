import java.util.Scanner
import kotlin.math.*


class Solution {
    fun canJump(nums: IntArray): Boolean {

        val n = nums.size
        var maxReach = 0

        for (i in 0 until n) {
            if (i > maxReach) return false

            maxReach = max(maxReach, i + nums[i])

            if (maxReach >= n - 1) return true
        }
        return true


    }
}

fun main() {

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    /*
    val nstr= readlnOrNull() ?: return
    val n = nstr.trim().toInt()
    */

    val nums = IntArray(n)
    for (i in 0 until n) {
        nums[i] = scanner.nextInt()
    }

    // val nums = readln().trim().split("\\s+".toRegex()).map{it.toInt()}.toIntArray()


    val obj = Solution()
    val ans = obj.canJump(nums)

    println(ans)
}
