package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.adapter.CardViewAdapter
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding :ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val listContract = arrayListOf(
            Data("Ahmad Dahlan", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg"),
            Data("Ahmad Yani", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"),
            Data("Sutomo", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/e/ed/Bung_Tomo.jpg"),
            Data("Gatot Soebroto", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/3/3a/Ki_Hadjar_Dewantara_Mimbar_Umum_18_October_1949_p2.jpg"),
            Data("Ki Hadjar Dewantara", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/VP_Hatta.jpg/330px-VP_Hatta.jpg"),
            Data("Soedirman", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Sudirman.jpg/486px-Sudirman.jpg"),
            Data("Soekarno", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/330px-Presiden_Sukarno.jpg"),
            Data("Soepomo", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Supomo_%28Photographs_by_Daan_Noske%29.jpg/220px-Supomo_%28Photographs_by_Daan_Noske%29.jpg"),
            Data("Tan Malaka", "Jakarta","https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/TanMalaka_DariPendjara_ed3.jpg/330px-TanMalaka_DariPendjara_ed3.jpg"),
            Data("Soedirman", "Bandung","https://upload.wikimedia.org/wikipedia/commons/b/be/Col_Gatot_Subroto%2C_Kenang-Kenangan_Pada_Panglima_Besar_Letnan_Djenderal_Soedirman%2C_p27.jpg"),
        )

        val adapter = CardViewAdapter(listContract)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rcvList.layoutManager = layoutManager
        binding.rcvList.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}