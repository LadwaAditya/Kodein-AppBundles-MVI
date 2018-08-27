package com.aditya.kodeinmvi

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

class MainApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(baseModule(applicationContext))
    }
}