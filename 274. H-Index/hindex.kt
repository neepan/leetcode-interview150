import java.util.Scanner


class Solution {
    fun hIndex(citations: IntArray): Int {

    }
}

fun main() {
    // val scanner = Scanner(System.`in`)
    // val n=scanner.nextInt()
    //
    // val nstr=readlnOrNull()?: return

    val n = readln().toInt()

    // val citations = IntArray(n)
    // for (i in 0 until n) {
    //     citations[i] = readln().toInt()
    // ciations[i]=scanner.nextInt()
    // }
    //
    val citations: IntArray = readln().split(" ").mapNotNull{it. toIntOrNull()}.toIntArray()

    // val citations = readln().trim().split("\\s+".toRegex).map{it.toInt()}.toIntArray()

    val obj=Solution()
    val h=obj.hIndex(citations)
    println(h)


}
