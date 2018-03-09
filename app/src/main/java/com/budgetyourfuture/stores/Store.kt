package com.budgetyourfuture.stores

import com.budgetyourfuture.actions.Action
import com.budgetyourfuture.dispatcher.Dispatcher

abstract class Store protected constructor(internal val dispatcher: Dispatcher) {

    internal fun emitStoreChange() {
        dispatcher.emitChange(changeEvent())
    }

    internal abstract fun changeEvent(): StoreChangeEvent
    abstract fun onAction(action: Action)

    interface StoreChangeEvent
}
