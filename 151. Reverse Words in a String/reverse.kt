class Solution{

fun reverseStr(arr: CharArray, l: Int, r: Int){
    var left=l
    var right=r

    while(left<right){
        val temp=arr[left]
        arr[left]=arr[right]
        arr[right]=arr[left
        left++
        right--
    }
 }

fun reverseWords(s: String): String {
        val arr=s.toCharrArray()
        val n=arr.size

        reverseStr(arr,0,n-1)

        var start =0


        while(start<n){
            while(start< n && arr[start]==' ')start++

            if(start>n)break

            var end=start
            while(end<n && arr[end]!=' ')end++

            reverseStr(arr,start,end-1)

            start=end
        }

        var i=0
        var j=0

        while(j<n){
            while(j<n && arr[j]==' ')j++

            while(j<n && arr[j]!=' ')arr[i++]=arr[j++]

            while(j<n && arr[j] == ' ')j++

            if(j<n)arr[i++]= ' '

        }


        return String(arr,0,i)
    }

}

fun main(){

val s=readln()

val obj=Solution()

println(obj.reverseWords(s))

}
