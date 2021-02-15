package dataStructure

fun main() {
    val arr = arrayOf(6,3,5,4,9)
    val s = 8
    var sum = 0
    var j=0
    for (i in arr.indices) {
        if (sum < s) {
            sum += arr[i]
            println("sum$sum")
        } else {
            if (sum > s) {
                println("Second term came here")
                sum -= arr[j++]
            }
        }
        if (sum==s)
        {
            println("Second some=:$sum")
            println("${j},$i")
            break
        }
    }
//    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val s = 15
//    val n = 10
//    var flg = 0
//    var j = 0
//    var i = 0
//    var sum = 0;
//    while (i <= n) {
//        if (sum < s) //remove >
//            sum += arr[i++];
//        else if (sum > s)
//            sum -= arr[j++];
//        if (sum == s) {
//            flg = 1;
//            break;
//        }
//    }
//    if (flg == 1)
//        println("${j + 1} ,$i")
//    else
//        println("-1");

}