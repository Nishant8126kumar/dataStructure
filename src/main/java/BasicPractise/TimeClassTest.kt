package BasicPractise

import java.util.*

class TimeClassTest : TimerTask() {
    override fun run() {
        println("Welcome")
    }
}
fun main() {
    val task=TimeClassTest()
    val timer=Timer()
    timer.schedule(task,2000,2000)
}