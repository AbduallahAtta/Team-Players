package elamien.abdullah.players.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import elamien.abdullah.players.models.TeamPlayers
import elamien.abdullah.players.rest.Client
import io.reactivex.schedulers.Schedulers

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class TeamRepository {
    val TAG = "TeamRepository"
    fun getTeamPlayer(team: String): LiveData<TeamPlayers> {
        return LiveDataReactiveStreams
            .fromPublisher(
                Client.createClient().getTeamPlayer(team)
                    .subscribeOn(Schedulers.io())
            )
    }

    fun logger(message: Any?) {
        Log.d(TAG, message.toString())
    }
}