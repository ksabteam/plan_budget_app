package com.budgetyourfuture.stores

import com.budgetyourfuture.actions.Action
import com.budgetyourfuture.actions.BudgetPlanActions
import com.budgetyourfuture.dispatcher.Dispatcher
import com.squareup.otto.Subscribe

import java.util.ArrayList

class BudgetPlanStore protected constructor(dispatcher: Dispatcher) : Store(dispatcher) {
    private val actions: MutableList<Action>

    init {
        actions = ArrayList<Action>()
    }

    @Subscribe
    override fun onAction(action: Action) {
        val id: Long
        when (Action.getType(action)) {
            BudgetPlanActions.WELCOME_HELLO_WORLD ->{
                val text = action.getData()?.get(BudgetPlanActions.KEY_TEXT) as String
                changeText(text)
                emitStoreChange()
            }
        }

    }

    private fun changeText(text: String) {
        //actions.get(id)
    }

    internal override fun changeEvent(): StoreChangeEvent {
        return BudgetPlanStoreChangeEvent ()
    }

    inner class BudgetPlanStoreChangeEvent : StoreChangeEvent

    companion object {

        private var instance: BudgetPlanStore? = null

        operator fun get(dispatcher: Dispatcher): BudgetPlanStore {
            if (instance == null) {
                instance = BudgetPlanStore(dispatcher)
            }
            return instance as BudgetPlanStore
        }
    }
}
