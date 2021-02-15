package dataStructure

fun main() {
    val arr = arrayOf(1, 2, 4, 5, 8, 10)
    val x = 9
    var count = 0
    for (i in arr.indices) {
        if (arr[i] < x) {
            count++
        }
    }
    println("Small Element iside array is =:$count")
}