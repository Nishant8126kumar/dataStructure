package MongoDbQueryPractise

import com.mongodb.MongoClient
import com.mongodb.client.model.Filters
import org.bson.conversions.Bson

class Vehicles {

    val mongoClient = MongoClient("localhost", 27017)
    val mongoDatabase = mongoClient.getDatabase("registry")
    val mongoCollection = mongoDatabase.getCollection("vehicle")
    fun getVehicle() {

        val andQuery = mutableListOf(Filters.eq("orgId", "1fa09fcf-01a5-48b1-bc9b-1893e7353f25"))
        val orQuery = mutableListOf<Bson>()
        orQuery.add(Filters.eq("uuid", "3b3231a2-943e-41a3-b000-073d87ab3016ss"))
        orQuery.add(Filters.eq("vehicleRegistrationNumber", "5224"))
        andQuery.addAll(listOf(Filters.or(orQuery)))


        val cursor = mongoCollection.find(Filters.and(andQuery)).iterator()
        while (cursor.hasNext()) {
            println(cursor.next())
        }

    }
}

fun main() {
    val obj = Vehicles()
    obj.getVehicle()

}