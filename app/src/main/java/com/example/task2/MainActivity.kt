package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task2.data.model.Doctor

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val doctorsRecyclerView = findViewById<RecyclerView>(R.id.doctorsRecyclerView)
        doctorsRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = DoctorsAdapter(this)
        doctorsRecyclerView.adapter = adapter


        viewModel.getData()
        viewModel.response.observe(this){
            adapter.submitList(it.doctors as ArrayList<Doctor> )
        }
    }
}