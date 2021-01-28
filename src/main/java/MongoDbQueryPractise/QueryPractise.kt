package MongoDbQueryPractise

import com.mongodb.MongoClient

fun main() {
    val mongoClient = MongoClient("localhost", 27017)
    val mongoDatabase = mongoClient.getDatabase("EmployeeDetails")
    val mongoCollection = mongoDatabase.getCollection("Fretron")
    val cursor = mongoCollection.find().iterator()
    while (cursor.hasNext()) {
        println(cursor.next())
    }
}
