package com.budgetyourfuture.model

import android.content.Context
import com.budgetyourfuture.R

abstract class BudgetCategory{
    val context: Context? = null
    var transactionCategories: Any? = null

    fun BudgetCategory(context: Context){
        this.context
        transactionCategories = context.resources.getStringArray(R.array.transaction_categories)
    }
}