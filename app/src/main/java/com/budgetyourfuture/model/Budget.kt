package com.budgetyourfuture.model

class Budget{
    private var id: Int = 0
    private var name: String = ""
    private var items: ArrayList<Transaction>? = null

    fun Budget(id: Int = 0, name: String = ""){
        this.id = id
        this.name = name
    }
}