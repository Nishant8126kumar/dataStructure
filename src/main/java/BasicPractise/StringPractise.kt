package BasicPractise

import org.json.JSONObject


class StringPractise {
}
fun main()
{
    val j= JSONObject().put("name","Nishant sharma")
    val a=j.toString()
    if (a.contains("name"))
    {
        println(JSONObject(a).get("name"))
    }else{
        println(false)
    }
//    json.keys().forEach { key->
//        if (key != null) {
//            if (key == "name") {
//                println(true)
//                if (key == "adrress")
//                {
//                    println(true)
//                }
//            }
//        }
//    }
//    val name="aman"
//    val c="name is jay error${name}"
////    println(c.contains("error"))
//    println(c.rangeTo("error"))


}
data class Student(val name:String?)
{
    constructor():this(name = null)
}