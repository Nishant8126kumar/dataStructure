package MongoDbQueryPractise

import com.mongodb.MongoClient
import com.mongodb.client.model.Filters
import org.bson.conversions.Bson

class Vehicles {

    val mongoClient = MongoClient("localhost", 27017)
    val mongoDatabase = mongoClient.getDatabase("registry")
    val mongoCollection = mongoDatabase.getCollection("vehicle")
    fun getVehicle() {

        val andQury = mutableListOf(Filters.eq("orgId", "1fa09fcf-01a5-48b1-bc9b-1893e7353f25"))
        val orQuery = mutableListOf<Bson>()
        orQuery.add(Filters.eq("createTime", "1612286894358"))
        orQuery.add(Filters.eq("createTime", "1612278662503"))
        orQuery.add(Filters.eq("createTime", "1612328905538"))
//        andQuery.addAll(orQuery)


        val cursor = mongoCollection.find(Filters.and(andQury)).iterator()
        while (cursor.hasNext()) {
            println(cursor.next())
        }

    }
}

fun main() {
    val obj = Vehicles()
    obj.getVehicle()

}