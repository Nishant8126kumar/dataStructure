package dataStructure

class FindMissingNumberInArray {
}

fun main() {
    val arr = arrayOf(4, 3, 2,1, 6)
    var max = arr[0]
    var sum = 0
    for (i in 1..arr.max()!!)
    {
        sum+=i
    }
    println("Max=.${arr.max()}")
    println("sum=:.${arr.sum()}")
    println("missing Element.${sum-arr.sum()}")
}