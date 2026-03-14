class Solution{

    fun convert(s: String, numRows: Int): String{

        if(numrows == 1 || s.length<=numRows)return s

        val rows=Array(numRows) { StringBuilder() }

        var direction=1
        var currentRow=0

        for(c in s){

            rows[currentRow].append(c)

            if(curentRow == 0)direction=1
            else if(currentRow==numRows -1) direction =-1

            currentRow+=direction
        }

        val result = StringBuilder()

        for(row in rows){
            result.append(row)
        }

        return result.toString()

    }
}

fun main(){


    val s=readln()

    val numRows=readln().toInt()

    val obj = Solution()

    println(obj.convert(s,numRows))
}
