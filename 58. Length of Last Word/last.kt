class Solution{

fun lengthOfLastWord(s: String): Int{

var i=s.length-1
var length=0

 // skip trailing spaces
        while (i >= 0 && s[i] == ' ') {
            i--
        }

        // count last word
        while (i >= 0 && s[i] != ' ') {
            length++
            i--
        }

        return length
}
}

fun main(){

val s=readln().toString()
val obj=Solution()
println(obj.lengthOfLastWord(s))
}
