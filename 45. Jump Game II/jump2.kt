import java.util.Scanner
import kotlin.math.*

class Solution {
    fun jump(nums: IntArray): Int {
        val n = nums.size
        var jumps = 0
        var end = 0
        var farthest = 0

        for (i in 0 until n - 1) {
            farthest = max(farthest, i + nums[i])

            if (i == end) {        // finished current jump range
                jumps++
                end = farthest
            }
        }
        return jumps
    }
}

fun main() {
    // val scanner=Scanner(System.`in`)
    // val n=scanner.nextInt()

    val nstr = readlnOrNull() ?: return

    val n = nstr.trim().toInt()

    // val nums =IntArray(n)
    // for(i in 0 until n){
    //     nums[i]=scanner.nextInt()
    // }
    val nums = readln().trim().split("\\s+".toRegex()).map { it.toInt() }.toIntArray()

    val obj = Solution()
    val ans = obj.jump(nums)

    println(ans)
}
