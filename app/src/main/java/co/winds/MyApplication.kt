package co.winds

import android.app.Application
import co.lokalise.android.sdk.LokaliseSDK

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Initialise Lokalise SDK with projects SDK token and project id
        // It is important to call this right after the "super.onCreate()"
        // If you are using AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        // make sure it is called before LokaliseSDK.init()
        LokaliseSDK.init("8cea8c7e265e98fcd9b0ae684e009b2555b2aa7b", "860935415c90862695a602.01041583", this)

        // Add this only if you want to use pre-release bundles
        LokaliseSDK.setPreRelease(true)

        // Fetch the latest translations from Lokalise (can be called anywhere)
        LokaliseSDK.updateTranslations()
    }
}