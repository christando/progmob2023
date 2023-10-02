package com.example.progmob2023new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob2023new.Network.NetworkConfig
import com.example.progmob2023new.adapter.UsersAdapter
import com.example.progmob2023new.model.ResponseUsersItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class GetAPIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_apiactivity)

        val rvUserAPI: RecyclerView = findViewById(R.id.rvUserAPI);

        NetworkConfig().getService().getUsers().enqueue(object : Callback<List<ResponseUsersItem>> {
                override fun onFailure(
                    call: Call<List<ResponseUsersItem>>, t:
                Throwable
                ) {
                    Toast.makeText(this@GetAPIActivity, t.localizedMessage,
                        Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(
                    call: Call<List<ResponseUsersItem>>,
                    response: Response<List<ResponseUsersItem>>
                ) {
                    rvUserAPI.apply{
                        layoutManager = LinearLayoutManager(this@GetAPIActivity)
                        adapter = UsersAdapter.UsersAdapter(response.body())
                    }
                }
            })

    }
}