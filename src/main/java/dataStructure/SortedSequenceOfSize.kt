package dataStructure


fun main() {
    val arr = arrayOf(4, 7, 5, 7, 9, 6)
    var count = 0
    var min = arr[0]
    val result = mutableListOf<Int>()
    min = arr.min()!!
    result.add(min)
    for (i in arr.indices) {
        if (min + 1 == arr[i]) {
            result.add(arr[i])
            min = arr[i]
        }
    }
    println("result data=:$result")


}