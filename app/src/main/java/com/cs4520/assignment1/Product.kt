package com.cs4520.assignment1

sealed class Product {

    abstract val name: String
    abstract val expDate: String?
    abstract  val price : String

    data class Equipment(override val name: String, override val expDate: String, override val price: String) : Product()

    data class Food(override val name: String, override val expDate: String, override val price: String) : Product()

    fun buildProductsList(entries: List<List<Any?>>): ArrayList<Product> {
        var finalArray = arrayListOf<Product>()

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

}

