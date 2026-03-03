import kotlin.math.*

class Solution {
    fun candy(ratings: IntArray): Int {

    val n=ratings.size()

    // each student should atleast one candy, that's why initializing with one
    val candies = IntArray(n) {1}

    // Left Slope -> left pass
    for(i in 1 until n){
    if(ratings[i]>ratings[i-1]){
    candies[i]=candies[i-1]+1
    }
    }

    //Right Slope -> Right pass
    for(i in n-2 downTo 0){
    if(ratings[i] > ratings[i+1]){
    candies[i]=max(candies[i],candies[i+1]+1)
    }
    }

    return candies.sum()


    }
}


fun main(){
val n=readln().toInt()

val ratings = readln().trim().split("\\s+".toRegex).mapNotNull{it.toIntOrNull()}.toIntArray()

val obj=solution()

val ans=obj.candy(ratings)
println(ans)

}
