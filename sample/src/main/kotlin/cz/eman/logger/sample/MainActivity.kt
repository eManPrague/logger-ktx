package cz.eman.logger.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cz.eman.logger.logDebug
import cz.eman.logger.logError

/**
 * @author vsouhrada (vaclav.souhrada@eman.cz)
 * @see[AppCompatActivity]
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logDebug("Hello! I'm debug logger")
        logDebug { "Hello! I'm debug logger as lambda function" }

        logError { "Boo! Error log is here!!!" }
    }

}