package elamien.abdullah.players.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class Client {
    companion object {
        fun createClient(): TeamAPI {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://www.thesportsdb.com/")
                .build()
            return retrofit.create(TeamAPI::class.java)
        }
    }

}