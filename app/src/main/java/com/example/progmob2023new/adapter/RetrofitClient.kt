package com.example.progmob2023new.adapter

import androidx.media3.exoplayer.dash.manifest.BaseUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
private const val BASE_URL = "https://kpsi.fti.ukdw.ac.id/#"

    val instance: API by lazy {
        val retrofit = Retrofit.Builder()
            .BaseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(API::class.java)
    }

}