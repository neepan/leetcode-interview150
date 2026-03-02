
import kotlin.random.Random

class RandomizedSet(){

private val list = ArrayList<Int>()
private val map=HashMap<Int,Int>()

fun insert(`val`: Int): Boolean{
    if(map.containsKey(`val`))return false

    list.add(`val`)
    map[`val`]=list.size-1
    return true
}

fun remove(`val`: Int): Boolean{
    if(!map.containsKey(`val`)) return false

    val index=map[`val`]!!
    val lastElement = list.last()

    //swap with last
    list[index]= lastElement
    map[lastElement] = index

    //remove last
    list.removeAt(list.size-1)
    map.remove(`val`)
    return true

}

fun getRandom(): Int{
    return list.random()
}
}


fun main() {

    val rs = RandomizedSet()
    val n = readln().trim().toInt()

    repeat(n) {
        val parts = readln().trim().split(" ")

        when (parts[0]) {

            "insert" -> {
                val value = parts[1].toInt()
                println(rs.insert(value))
            }

            "remove" -> {
                val value = parts[1].toInt()
                println(rs.remove(value))
            }

            "getRandom" -> {
                println(rs.getRandom())
            }
        }
    }
}
