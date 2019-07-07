package elamien.abdullah.players.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import elamien.abdullah.players.models.TeamPlayers
import elamien.abdullah.players.rest.Client
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class TeamRepository {
    val TAG = "TeamRepository"
    private var teamPlayers = MutableLiveData<TeamPlayers>()

    fun getTeamPlayer(team: String): MutableLiveData<TeamPlayers> {

        val call = Client.createClient()
            .getTeamPlayer(team)
        call.enqueue(object : Callback<TeamPlayers> {
            override fun onFailure(call: Call<TeamPlayers>, t: Throwable) {
                logger(t.message)
            }

            override fun onResponse(call: Call<TeamPlayers>, response: Response<TeamPlayers>) {
                if (response.isSuccessful) {
                    teamPlayers.value = response.body()
                } else {
                    logger(response.code())
                }
            }

        })
        return teamPlayers
    }

    fun logger(message: Any?) {
        Log.d(TAG, message.toString())
    }
}