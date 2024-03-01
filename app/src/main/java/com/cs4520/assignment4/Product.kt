package com.cs4520.assignment4

sealed class Product {

    abstract val name: String
    abstract val expDate: String?
    abstract  val price : String

    data class Equipment(override val name: String, override val expDate: String?, override val price: String) : Product()

    data class Food(override val name: String, override val expDate: String?, override val price: String) : Product()


}

