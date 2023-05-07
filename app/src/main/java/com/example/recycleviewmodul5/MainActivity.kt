package com.example.recycleviewmodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Surya",
            Nimmhs = "0001",
            Telpmhs = "08212121"
        ),
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Asep",
            Nimmhs = "0002",
            Telpmhs = "08212121"
        ),
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Agus",
            Nimmhs = "0003",
            Telpmhs = "08212121"
        ),
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Anto",
            Nimmhs = "0004",
            Telpmhs = "08212121"
        ),
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Anto",
            Nimmhs = "0005",
            Telpmhs = "08212121"
        ),
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Wulan",
            Nimmhs = "0006",
            Telpmhs = "08212121"
        ),
        Inis_Variable(
            R.drawable. foto,
            Namamhs = "Fulan",
            Nimmhs = "0007",
            Telpmhs = "08212121"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)
        ShowListMahasiswa()
    }private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdapter(this,
            Datamahasiswa){
        }
    }
}