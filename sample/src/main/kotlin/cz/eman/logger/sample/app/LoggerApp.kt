package cz.eman.logger.sample.app

import android.app.Application
import timber.log.Timber

/**
 * @author vsouhrada (vaclav.souhrada@eman.cz)
 */
class LoggerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() {
        // For sample purposes
        Timber.plant(Timber.DebugTree())
    }

}