import scala.collection.JavaConverters

fun main() {
    val arr = arrayOf(2, 3, 5, 9,5,6,10,11,21,22,8)
    val newArray = mutableListOf<Any>()
    for (i in arr.indices) {
        if (arr[i] % 2 == 0) {
            newArray.add(arr[i])
        }
    }
    for (i in arr.indices) {
        if (arr[i] % 2 != 0) {
            newArray.add(arr[i])
        }
    }
    println(newArray)
}