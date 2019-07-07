package elamien.abdullah.players.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import elamien.abdullah.players.R
import elamien.abdullah.players.adapters.TeamPlayersAdapter
import elamien.abdullah.players.databinding.ActivityMainBinding
import elamien.abdullah.players.models.Player
import elamien.abdullah.players.models.TeamPlayers
import elamien.abdullah.players.viewmodel.TeamViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val viewModel: TeamViewModel by inject()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        searchForTeam()
    }

    private fun searchForTeam() {
        viewModel.getTeamPlayers("arsenal").observe(this,
            Observer<TeamPlayers> { t ->
                setPlayersToRecyclerView(t.player)
            })
    }

    private fun setPlayersToRecyclerView(players: List<Player>?) {
        val adapter = players?.let { TeamPlayersAdapter(this, it) }
        binding.recyclerView.adapter = adapter
    }
}
