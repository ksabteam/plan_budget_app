package com.budgetyourfuture.model

import java.util.*

class Transaction{
    private var id: Int = 0
    private var name: String = ""
    private var category: BudgetCategory? = null
    private var amount: Double = 0.0
    private var date: Date? = null

    fun Transaction(id: Int = 0, name: String = "", category: BudgetCategory? = null,
                    amount: Double = 0.0, date: Date? = null){
        this.id = id
        this.name = name
        this.category = category
        this.amount = amount
        this.date = date
    }
}