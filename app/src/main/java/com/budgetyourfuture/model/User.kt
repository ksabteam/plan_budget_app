package com.budgetyourfuture.model

class User{
    private var username: String = ""
    private var password: String = ""
    private var firstName: String = ""
    private var middleName: String = ""
    private var monthlyIncome: Double = 0.0
    private var budgets: ArrayList<Budget>? = null

    fun User(username: String, password: String, firstName: String = "", middleName: String = "",
             monthlyIncome: Double = 0.0){
        this.username = username
        this.password = password
        this.firstName = firstName
        this.middleName = middleName
        this.monthlyIncome = monthlyIncome
    }

    fun addBudget(budget: Budget){
        this.budgets?.add(budget)
    }
}