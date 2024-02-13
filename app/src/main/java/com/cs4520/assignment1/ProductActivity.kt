package com.cs4520.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ProductActivity : AppCompatActivity() {

    private fun buildProductsList(entries: List<List<Any?>>): ArrayList<Product> {
        val finalArray = arrayListOf<Product>()

        for (list in entries) {
            if (list[1] == "Equipment") {
                val product = Product.Equipment(name = list[0].toString(),
                    expDate = list[2].toString(),
                    price= list[3].toString())
                finalArray.add(product)
            }
            else {
                val product = Product.Food(name = list[0].toString(),
                    expDate = list[2].toString(),
                    price= list[3].toString())
                finalArray.add(product)
            }

        }
        return finalArray

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_activity_layout)
        val dataset = this.buildProductsList(productsDataset)

        val productsAdapter = ProductAdapter(dataset)

        val recyclerView: RecyclerView = findViewById(R.id.product_recycler_view)
        recyclerView.adapter = productsAdapter
    }



}