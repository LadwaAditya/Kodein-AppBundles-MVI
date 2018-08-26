package com.aditya.main

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

class MainApp : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(baseModule(applicationContext))
    }
}