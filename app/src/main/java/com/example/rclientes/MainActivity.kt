package com.example.rclientes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaProductos: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProductos("13579","Radio","$300","$100"))
        listaProductos.add(
            dtProductos("12345","Television","$15,000","$5,000"))
        listaProductos.add(
            dtProductos("23456","Laptop","$20,000","$6,000"))
        listaProductos.add(
            dtProductos("34567","Arduino nano","$300","$50"))
        listaProductos.add(
            dtProductos("45678","Proyector","$2,000","$500"))
        listaProductos.add(
            dtProductos("56789","Clima","$5,800","$4,500"))
        listaProductos.add(
            dtProductos("67890","Lavadora","$6,000","$4,000"))
        listaProductos.add(
            dtProductos("09876","Refrigerador","$11,500","$9,000"))
        listaProductos.add(
            dtProductos("98765","Telefono","$5000","$3,500"))
        listaProductos.add(
            dtProductos("87654","Microondas","$4,000","$2,500"))
        listaProductos.add(
            dtProductos("76543","PIR","$300","$100"))
        listaProductos.add(
            dtProductos("65432","Audifonos","$300","$150"))
        listaProductos.add(
            dtProductos("54321","monitor","$4,200","$1,500"))
        listaProductos.add(
            dtProductos("19283","CUP","$10,700","$10,000"))
        listaProductos.add(
            dtProductos("28374","Reloj","$500","$350"))
        listaProductos.add(
            dtProductos("37465","Consola","$12,000","$9,000"))
        listaProductos.add(
            dtProductos("10101","Teclado","$800","$600"))
        listaProductos.add(
            dtProductos("20303","Mouse","$300","$170"))
        listaProductos.add(
            dtProductos("11111","Cargador","$200","$160"))
        listaProductos.add(
            dtProductos("22222","Bocina","$500","$370"))

        val tabla = findViewById<RecyclerView>(R.id.tablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductoAdapter(this,listaProductos)

    }
}