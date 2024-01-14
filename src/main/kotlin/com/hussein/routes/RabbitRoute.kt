package com.hussein.routes

import com.hussein.data.Rabbit
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

//private const val BASE_URL = "http://localhost:8100"//Your server base URL
//private const val BASE_URL = "http://127.0.0.1:8100" //MyIPAddress:port
private const val BASE_URL = "http://10.0.2.2:8100" //For testing Emulator


private val rabbits = listOf(
    Rabbit("Rabbit 1","A cute small rabbit","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Rabbit 2","Asser love this small rabbit","$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Rabbit 3","A cute small rabbit","$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Rabbit 4","Asser love this small rabbit","$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Rabbit 5","A cute small rabbit","$BASE_URL/rabbits/rabbit5.jpg"),

    )
fun Route.randomRabbit(){
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}