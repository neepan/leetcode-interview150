
class Solution{

fun productExceptSelf(nums: IntArray):IntArray{

    val n=nums.size

    var answer = IntArray(n)
    answer[0]=1
    for(i in 1 until n){
    answer[i]=answer[i-1]*nums[i-1]
    }

    var rightProduct=1
    for(i in n-1 downTo 0){
    answer[i]*=rightProduct
    rightProduct*=nums[i]
    }
    return answer
}
}

fun main(){

val n=readln().toInt()
val nums = readln().split(" ").map { it.toInt() }.toIntArray()

val obj=Solution()
val answer = obj.productExceptSelf(nums)

for(i in 0 until n){
println("$answer[i] ")
}
}
