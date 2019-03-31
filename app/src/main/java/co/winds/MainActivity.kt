package co.winds

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.lokalise.android.sdk.core.LokaliseContextWrapper
import co.lokalise.android.sdk.LokaliseDefines
import android.content.Intent
import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.view.View
import co.lokalise.android.sdk.LokaliseResources
import co.lokalise.android.sdk.LokaliseSDK
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //https://lokalise.co

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LokaliseSDK.updateTranslations()

        tv.setText(R.string.app_test)


        hi.setOnClickListener {
            LokaliseSDK.setLocale("hi","IN")
            finish()
            startActivity(intent)
        }


        en.setOnClickListener {
            LokaliseSDK.setLocale("en","GB")
            finish()
            startActivity(intent)
        }


    }

}
