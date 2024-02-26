package com.example.rclientes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductoAdapter (var context: Context,
    var ListaProductos: MutableList<dtProductos>) :
    RecyclerView.Adapter<ProductoAdapter.vHolder>()
{
    inner class vHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
         lateinit var txtid: TextView
         init {
             txtid=itemView.findViewById(R.id.txtID)
            }
         lateinit var txtdescripcion: TextView
         init {
             txtdescripcion=itemView.findViewById(R.id.txtDescripcion)
            }
            lateinit var txtprecio_menudeo: TextView
         init {
         txtprecio_menudeo=itemView.findViewById(R.id.txtPrecio_menudeo)
            }
           lateinit var txtprecio_mayoreo: TextView
        init {
            txtprecio_mayoreo = itemView.findViewById(R.id.txtPrecio_mayoreo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.vHolder {
        var itemView=LayoutInflater.from(context).inflate(
            R.layout.vista_productos,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaProductos.size
    }

    override fun onBindViewHolder(holder: ProductoAdapter.vHolder, position: Int) {
        var productos = ListaProductos[position]
        holder.txtid.text=productos.ID
        holder.txtdescripcion.text=productos.Descripcion
        holder.txtprecio_menudeo.text=productos.Precio_menudeo
        holder.txtprecio_mayoreo.text=productos.Precio_mayoreo

    }
}
