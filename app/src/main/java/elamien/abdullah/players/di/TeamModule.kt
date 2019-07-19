package elamien.abdullah.players.di

import elamien.abdullah.players.repository.TeamRepository
import elamien.abdullah.players.viewmodel.TeamViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by AbdullahAtta on 7/7/2019.
 */

val teamModule = module {
    factory { TeamRepository() }
    viewModel { TeamViewModel() }
}