package dataStructure

import java.util.*
import kotlin.collections.ArrayList

class SelectionSort {
    fun selectionSort(data:ArrayList<Int>):ArrayList<Int>
    {
        for (i in 0..data.size-2)
        {
            val temp=i
            for (j in i+1 until data.size)
            {
                if (data[temp]>data[j])
                {
                    val c=data[temp]
                    data[temp]=data[j]
                    data[j]=c
                }

            }
        }
        println("data=:$data")
        return arrayListOf()
    }
}

fun main() {

    val obj=SelectionSort()
    val arrayData = arrayListOf<Int>()
    val scan = Scanner(System.`in`)
    println("enter the size of array Data")
    val size = scan.nextInt()
    println("Enter Elemet $size")
    for (i in 0 until size) {
        arrayData.add(scan.nextInt())
    }
    val data=obj.selectionSort(arrayData)
}