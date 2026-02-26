
import kotlin.math.*



class Solution{
	fun maxProfit(prices: IntArray): Int{

	val n= prices.size
	var mini= prices[0]
	var profit =0

	for(i in 0 until n){
	var cost = prices[i]-mini
	profit= max(profit,cost)
	mini=min(mini,prices[i])
	}

	return profit

	}
}

fun main(){
	val nStr= readlnOrNull() ?: return

	val n =nStr.trim().toInt()

	 if(n<1 || n>100000){
	 println("Invalid n")
	 return
	 }

	 val prices = readln().trim().split("\\s+".toRegex()).map { it.toInt()}.toIntArray()

	 for(prices in prices){
	 if(prices <0 || prices > 10000){
	 print("Invalid Price")
	 return
	 }
	 }

	 val obj = Solution()
	 val ans = obj.maxProfit(prices)

	 print(ans)

}