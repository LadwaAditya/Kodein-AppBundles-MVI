package com.aditya.kodeinmvi

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import okhttp3.OkHttpClient
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity(), KodeinAware {
  override val kodein by closestKodein()

  private val preferences: SharedPreferences by instance()
  private val okHttpClient: OkHttpClient by instance()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
