//better solution , using space,



class solution{
 fun trap(height: IntArray): Int{

    val n=height.size
    var leftMax=IntArray(n)
    var rightMax=IntArray(n)

    leftMax[0]= height[0]
    for(i in 1 until n){
    leftMax[i]= maxOf(leftMax[i-1],height[i])
    }

    rightMax[n-1]=height[n-1]
    for(i in n-2 downTo 0){
    rightMax[i]= maxOf(rightMax[i+1],height[i])
    }

     var water =0
     for(i in 0 until ){
     water +=minOf(leftMax[i],rightMax[i])-height[i]
     }

     return water

 }
}


fum main(){
val n=readln().toInt()

val height= readln().trim().split("\\s+".toRegex).mapNotNull{it.toIntOrNull()}.toIntArray

val trapwater=solution()
val ans=trapwater.trap(height)

println(ans)
}
