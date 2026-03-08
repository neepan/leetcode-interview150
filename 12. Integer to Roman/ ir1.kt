
class Solution(){

fun intToRoman(num: Int): String {

var number = num

val map=linkedMapOf(
1000 to "M",
900 to "CM",
500 to "D",
400 to "CD",
100 to "C",
90 to "XC",
50 to "L",
40 to "XL",
10 to "X",
9 to "IX",
5 to "V",
4 to"IV",
1 to "I"
)

val result = StringBuilder()

for((value,symbol) in map){
while(number>=value){
result.append(symbol)
number-=value
}
}

return result.toString()
}
}

fun main(){


val n= readln().toInt()

val obj=Solution()
val ans=obj.intToRoman(n)
println(ans)
}
