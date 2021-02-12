package dataStructure

import java.util.*
import javax.ws.rs.NotAllowedException

class StackImplementation {

    private var top = -1;
    private val maxSize = 10
    private var item = 0;
    private val scan = Scanner(System.`in`)
    private val stack = IntArray(maxSize)
    fun push() {
        if (top == maxSize - 1) {
            throw NotAllowedException("Stack is overFlow")
        } else {
            println("Enter item for insert in stack")
            item = scan.nextInt()
            top += 1;
            stack[top] = item;
            println("item inserted successfully")
        }
    }

    fun pop() {
        if (top == -1) {
            println("Stack is Empty")
        } else {
            item = stack[top]
            println("item =:$item")
        }
    }
}

fun main() {
    val stack = StackImplementation()
    while (true) {
        stack.pop()
    }
}