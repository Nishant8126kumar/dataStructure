package BasicPractise

import org.codehaus.jackson.map.ObjectMapper
import org.json.JSONObject


fun getData() {
    for (i in 0..10) {
        for (j in 0..10) {
            if (i == 4) {
                throw Exception("not Allowed")
            }
        }
        println("ok.$i")
    }

}

fun main() {
    val mapper = """{
       |"partnerUUID":"236dg",
       |"actions":["actionName":"vehicle",
       |"payload":{"vehicleName":"qt3db"}]"
       |}""".trimMargin()
//    val data = ObjectMapper().readValue(mapper, BulkUpdate::class.java)
    println("data${JSONObject(mapper)}")
    val list = mutableListOf("a", "b", "c", "s")
    val list2 = mutableListOf("a", "x", "y", "s", "b")
    list.forEach {
        list2.remove(it)
    }
    println(list2)
}

//data class Model(var name: String?, val address: String?, var age: String?, var colony: String?) {
//    constructor() : this(null, null, null, null)
//
//    override fun toString(): String {
//        val toStringObj =
//            JSONObject().put("name", this.name ?: JSONObject.NULL)
//                .put("address", this.address ?: JSONObject.NULL)
//                .put("age", this.age ?: JSONObject.NULL)
//                .put("colony", this.colony ?: JSONObject.NULL)
//        return toStringObj.toString()
//    }
//}


data class BulkActions(var actionName: String?, var payload: JSONObject?) {
    constructor() : this(null, null)

    override fun toString(): String {
        val toStringObj = JSONObject().put("actionName", this.actionName ?: JSONObject.NULL)
            .put("payLoad", this.payload ?: JSONObject.NULL)
        return toStringObj.toString()
    }

}

data class BulkUpdate(var partnerUUID: String?, var actions: List<BulkActions>) {
    constructor() : this(null, emptyList())

    override fun toString(): String {
        val toStringObj = JSONObject().put("vehicleId", this.partnerUUID ?: JSONObject.NULL)
            .put("actions", this.actions)
        return toStringObj.toString()
    }
}
