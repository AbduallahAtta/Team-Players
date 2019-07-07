package elamien.abdullah.players

import android.app.Application
import elamien.abdullah.players.di.teamModule
import org.koin.core.context.startKoin

/**
 * Created by AbdullahAtta on 7/7/2019.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { modules(teamModule) }
    }


}