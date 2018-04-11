package com.budgetyourfuture.actions

import com.budgetyourfuture.dispatcher.Dispatcher

class ActionsCreator internal constructor(internal val dispatcher: Dispatcher) {

    fun create(text: String) {
        dispatcher.dispatch(
                BudgetPlanActions.WELCOME_HELLO_WORLD, text
        )

    }

    companion object {

        private var instance: ActionsCreator? = null

        operator fun get(dispatcher: Dispatcher): ActionsCreator {
            if (instance == null) {
                instance = ActionsCreator(dispatcher)
            }
            return instance as ActionsCreator
        }
    }
}
