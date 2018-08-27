package com.aditya.kodeinmvi

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.readystatesoftware.chuck.ChuckInterceptor
import okhttp3.Cache
import okhttp3.OkHttpClient
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import java.io.File
import java.util.concurrent.TimeUnit

private const val CACHE_SIZE: Long = 10 * 1024 * 1024


fun baseModule(context: Context) = Kodein.Module(name = "baseModule") {

  bind<SharedPreferences>() with singleton { context.getSharedPreferences("test", Context.MODE_PRIVATE) }

  bind<OkHttpClient>() with singleton { provideOkhttp(instance(), instance()) }

  bind<Cache>() with singleton { provideCache(context) }
  bind<ChuckInterceptor>() with singleton { provideChuckInterceptor(context) }
  bind<Gson>() with singleton { provideGson() }
}

fun provideOkhttp(
  cache: Cache,
  chuckInterceptor: ChuckInterceptor
): OkHttpClient {
  val httpClientBuilder = OkHttpClient.Builder()
  httpClientBuilder
    .writeTimeout(30, TimeUnit.SECONDS)
    .connectTimeout(30, TimeUnit.SECONDS)
    .readTimeout(30, TimeUnit.SECONDS)
  httpClientBuilder.cache(cache)

  //Only for Debug Builds
  if (BuildConfig.DEBUG) {
    httpClientBuilder.addInterceptor(chuckInterceptor)
  }
  return httpClientBuilder.build()
}


private fun provideCache(
  context: Context
): Cache {
  return Cache(File(context.cacheDir, "okhttpCache"), CACHE_SIZE)
}

private fun provideGson(): Gson {
  return GsonBuilder()
    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    .create()
}

private fun provideChuckInterceptor(
  context: Context
): ChuckInterceptor {
  return ChuckInterceptor(context)
}