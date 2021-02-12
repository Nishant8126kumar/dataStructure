package dataStructure

import java.util.*

class BubbleSort {
    val scan = Scanner(System.`in`)
    fun bubbleSort() {
        val arrayData = arrayListOf<Int>()
        println("Enter the Size Of Array")
        val size = scan.nextInt()
        println("Enter $size Element")
        for (i in 1..size) {
            arrayData.add(scan.nextInt())
        }
        println("data ${arrayData[0]}")
        var swap = true
        while (swap) {
            swap = false
            for (j in 0 until size-1) {
                if (arrayData[j] > arrayData[j+1]) {
                    val temp = arrayData[j+1]
                    arrayData[j+1] = arrayData[j]
                    arrayData[j] = temp
                    swap=true
                }
            }
        }
        println("Sorted Data is =:$arrayData")

    }
}

fun main() {
//    val bubble = BubbleSort()
//    bubble.bubbleSort()
    println(listOf(1, 2, 3).reduce { sum, element -> sum + element })


}