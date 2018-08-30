package com.adityaladwa.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

  companion object {
    fun start(context: Context) {
      Intent(context, DetailActivity::class).run { context.startActivity(this) }
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail)
  }
}
