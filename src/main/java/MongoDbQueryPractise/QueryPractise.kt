package MongoDbQueryPractise

import com.mongodb.BasicDBObject
import com.mongodb.MongoClient
import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import org.bson.BSON
import org.bson.conversions.Bson
import java.util.logging.Filter

class MongoPractice {

}

fun main() {
    val mongoClient = MongoClient("localhost", 27017)
    val mongoDatabase = mongoClient.getDatabase("EmployeeDetails")
    val mongoCollection = mongoDatabase.getCollection("Emp")
    try {
        val filter = Filters.eq("_id", "156230")

//        val cursor = mongoCollection.updateOne(filter, setData, UpdateOptions().upsert(true))
        val list = mutableListOf<String>("20", "21", "22", "23")
//        val c = "156230"
        val c = mutableListOf<Bson>()
        c.add(Filters.eq("_id", "156230"))
        c.add(Filters.eq("name", "Shivam Ram"))

        val x = BasicDBObject()
        x.put("\$and",c)
        x.put("\$put","ss")
        val cursor = mongoCollection.find(x).iterator()
        while (cursor.hasNext()) {
            println(cursor.next())
        }
    } catch (e: Exception) {
        println(e.message)

    }
}
