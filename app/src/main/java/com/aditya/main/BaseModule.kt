package com.aditya.main

import android.content.Context
import android.content.SharedPreferences
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

fun baseModule(context: Context) = Kodein.Module(name = "baseModule") {

    bind<SharedPreferences>() with singleton { context.getSharedPreferences("test", Context.MODE_PRIVATE) }
}