package elamien.abdullah.players.rest

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class Client {
    companion object {
        fun createClient(): TeamAPI {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(TeamAPI::class.java)
        }
    }

}