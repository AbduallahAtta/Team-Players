package elamien.abdullah.players.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class TeamPlayers {
    @SerializedName("player")
    @Expose
    var player: List<Player>? = null
}
