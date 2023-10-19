package com.example.progmob2023new.adapter


import com.example.progmob2023new.model.Mahasiswa
import retrofit2.http.GET
import retrofit2.Call
import java.util.ArrayList

interface API {
    @GET()
    fun getPost():Call<ArrayList<Mahasiswa>>


}