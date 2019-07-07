package elamien.abdullah.players.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import elamien.abdullah.players.databinding.ListItemPlayerNameBinding
import elamien.abdullah.players.models.Player

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class TeamPlayersAdapter(private val context: Context, private val players: List<Player>) :
    RecyclerView.Adapter<TeamPlayersAdapter.TeamPlayerListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamPlayerListViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding =
            ListItemPlayerNameBinding.inflate(inflater)
        return TeamPlayerListViewHolder(binding)
    }

    override fun getItemCount(): Int = players.size

    override fun onBindViewHolder(holder: TeamPlayerListViewHolder, position: Int) {
        holder.bind(players[position])
    }

    inner class TeamPlayerListViewHolder(private val binding: ListItemPlayerNameBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(player: Player) {
            binding.player = player
        }
    }
}
