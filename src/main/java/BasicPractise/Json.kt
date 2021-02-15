package BasicPractise

import com.mongodb.BasicDBList
import com.mongodb.BasicDBObject
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
    val strData = """{
	"partnerUUID": "07c0a98a-c88c-4512-92b6-ca306815f27d",
	"actions": [{
		"actionName": "driver",
		"payload": {
			"driver": {
				"name": "SUMIT1",
				"mobileNumber": "9800000000",
				"dlExpiryTime": null,
				"dlNumber": null
			}
		}
	}]
}"""
    val wmi = """{
        |"wmi":["10","20","30","40","50"]
        |}""".trimMargin()
    val qData=buildQuery(wmi)
    println("query=:$qData")
//    val mapStr = ObjectMapper().readValue(strData, BulkUpdate::class.java)
//    println(mapStr)
//    val actions = mapStr.actions
//    for (action in actions)
//    {
//        val json=JSONObject(action.payload)
//        if (json.isNull("driver").not())
//        {
//            println("ok${json.get("driver")}")
//        }else{
//            println("not found")
//        }
//    }
//    val name = mutableMapOf<String, String>("name" to "adman", "age" to "21", "address" to "Aligarh")
//    val map = mutableMapOf<String, Map<String, String>>()
//    map["name"] = name
//    println("data=:${JSONObject(map)}")
//    if (jsonPayLoad.isNull("driver").not()) {
//        println("Driver found ${jsonPayLoad.getJSONObject("driver")}")
//    } else {
//        println("Driver not found update")
//    }
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


data class BulkActions(var actionName: String?, var payload: HashMap<String, Any>?) {
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

fun buildQuery(request: String):BasicDBObject {
    val query = BasicDBList()
    query.add(BasicDBObject("orgId", "156230"))
    val json = JSONObject()
    val jsonData = JSONObject(request)
    jsonData.keySet().forEach { key ->
        if (jsonData.isNull(key).not() && jsonData.getJSONArray(key).length() > 0) {
            json.put(key, jsonData.getJSONArray(key))
            query.add(BasicDBObject(key, BasicDBObject("\$in", jsonData.getJSONArray(key))))
        }
    }
    return BasicDBObject("\$and",query)
}
