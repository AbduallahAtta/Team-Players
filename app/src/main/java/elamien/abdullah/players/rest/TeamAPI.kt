package elamien.abdullah.players.rest

import elamien.abdullah.players.models.TeamPlayers
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
interface TeamAPI {

    @GET("api/v1/json/1/searchplayers.php")
    fun getTeamPlayer(@Query("t") team: String): Flowable<TeamPlayers>
}