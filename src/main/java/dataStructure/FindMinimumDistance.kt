package dataStructure

fun main() {
    val arr = arrayOf(8,7,5,9,2,4)
    val x = 7
    val y = 4
    var start = 0
    var end = 0
    for (i in arr.indices) {
        if (arr[i] == x) {
            start = i
            for (j in i+1 until arr.size) {
                if (arr[j] == y) {
                    end = j
                    break
                }
            }
            println("ok")
            break
        }
        println("n")
    }
    println("Minimum pass to jump $x to $y is${end-start}")


}