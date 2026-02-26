
import java.util.Scanner

class Solution{

fun maxProfit(prices: IntArray): Int{
	var profit=0

	for(i in 1 until prices.size){
	if(prices[i]>prices[i-1]){
	profit+=prices[i]-prices[i-1]
	}
	}
	return profit
}
}

fun main(){
	 val scanner = Scanner(System.`in`)
	
	val n = readln().toInt()

	//val prices = IntArray(n)

	//for(i in 0 until n){
	//prices[i]=scanner.nextInt()
	//}

	val prices = readln().trim().split("\\s+".toRegex()).map{it.toInt()}.toIntArray()

	val obj = Solution()
	val ans= obj.maxProfit(prices)

	println(ans)
}