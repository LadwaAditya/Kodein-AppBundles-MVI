package com.aditya.kodeinmvi.base

import android.support.v7.app.AppCompatActivity
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein

abstract class BaseActivity : AppCompatActivity(), KodeinAware {

  private val parentKodein by closestKodein()
  override val kodein = Kodein.lazy {
    extend(parentKodein)
    provideModule().invoke(this)
  }

  abstract fun provideModule(): (Kodein.MainBuilder) -> Unit
}