package elamien.abdullah.players.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import elamien.abdullah.players.models.TeamPlayers
import elamien.abdullah.players.repository.TeamRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class TeamViewModel : ViewModel(), KoinComponent {
    val repository: TeamRepository by inject()
    fun getTeamPlayers(team: String): LiveData<TeamPlayers> {
        return repository.getTeamPlayer(team)
    }
}