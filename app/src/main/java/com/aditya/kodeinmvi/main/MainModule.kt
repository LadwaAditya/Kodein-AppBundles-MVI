package com.aditya.kodeinmvi.main

import android.content.Context
import org.kodein.di.Kodein

object MainModule {

  fun mainModule(context: Context) = Kodein.Module(name = "mainModule") {
    // All main module specific dependencies
  }
}