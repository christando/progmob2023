package com.example.progmob2023new.Network

import com.example.progmob2023new.model.ResponseAddPetani
import com.example.progmob2023new.model.ResponsePetani
import com.example.progmob2023new.model.ResponseUsersItem
import com.google.android.gms.wearable.DataItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

class NetworkConfig {
        fun getInterceptor() : OkHttpClient {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
            return okHttpClient
        }

        fun getRetrofit() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .client(getInterceptor())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun getService() = getRetrofit().create(Users::class.java)
    }
    interface Users {
        @GET("users")
        fun getUsers(): Call<List<ResponseUsersItem>>

        @GET("petani/")
        fun getPetaniAll(): Call<ResponsePetani>

        @POST("petani/")
        fun addPetani(@Body req : DataItem): Call<ResponseAddPetani>

        @PUT("petani/{id}")
        fun updatePetani(@Path("id") id : Int, @Body req : DataItem): Call<ResponseAddPetani>

        @DELETE("petani/{id}")
        fun deletePetani(@Path("id") id : Int): Call<ResponseAddPetani>

    }