package com.cs4520.assignment4

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView


class ProductAdapter(private val dataSet: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView
        val holder : View
        val productName: TextView
        val date : TextView
        val price : TextView

        init {
            imageView = view.findViewById(R.id.image)
            productName = view.findViewById(R.id.productName)
            date = view.findViewById(R.id.expDate)
            price = view.findViewById(R.id.price)
            holder = view.findViewById(R.id.holder)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.product_activity_row_layout, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val product = dataSet[position]
        viewHolder.productName.text = product.name
        viewHolder.date.isVisible = false
        product.expDate?.let {
            viewHolder.date.text = product.expDate
            viewHolder.date.isVisible = true
        }
        viewHolder.price.text = dataSet[position].price.toString()
        when(product) {
            is Product.Equipment -> {
                viewHolder.holder.setBackgroundColor(Color.parseColor("#E06666"))
                viewHolder.imageView.setImageResource(R.drawable.equipment)

            }
            is Product.Food -> {
                viewHolder.holder.setBackgroundColor(Color.parseColor("#FFD965"))
                viewHolder.imageView.setImageResource(R.drawable.food)
            }
        }

    }

    override fun getItemCount() = dataSet.size

}