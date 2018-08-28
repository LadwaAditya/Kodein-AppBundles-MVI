package com.aditya.kodeinmvi.main

import android.content.SharedPreferences
import android.os.Bundle
import com.aditya.kodeinmvi.R
import com.aditya.kodeinmvi.base.BaseActivity
import okhttp3.OkHttpClient
import org.kodein.di.Kodein
import org.kodein.di.generic.instance

class MainActivity : BaseActivity() {

  private val preferences: SharedPreferences by instance()
  private val okHttpClient: OkHttpClient by instance()

  override fun provideModule(): (Kodein.MainBuilder) -> Unit = {
    it.import(MainModule.mainModule(this))
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
