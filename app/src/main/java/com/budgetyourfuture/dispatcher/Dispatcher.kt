package com.budgetyourfuture.dispatcher

import com.squareup.otto.Bus

import com.budgetyourfuture.actions.Action
import com.budgetyourfuture.stores.Store

class Dispatcher internal constructor(private val bus: Bus) {

    fun register(cls: Any) {
        bus.register(cls)

    }

    fun unregister(cls: Any) {
        bus.unregister(cls)
    }

    fun emitChange(o: Store.StoreChangeEvent) {
        post(o)
    }

    fun dispatch(type: String, vararg data: Any) {
        if (isEmpty(type)) {
            throw IllegalArgumentException("Type must not be empty")
        }

        if (data.size % 2 != 0) {
            throw IllegalArgumentException("Data must be a valid list of key,value pairs")
        }

        val actionBuilder = Action.type(type)
        var i = 0
        while (i < data.size) {
            val key = data[i++] as String
            val value = data[i++]
            actionBuilder.bundle(key, value)
        }
        post(actionBuilder.build())
    }

    private fun isEmpty(type: String?): Boolean {
        return type == null || type.isEmpty()
    }

    private fun post(event: Any) {
        bus.post(event)
    }

    companion object {
        private var instance: Dispatcher? = null

        operator fun get(bus: Bus): Dispatcher {
            if (instance == null) {
                instance = Dispatcher(bus)
            }
            return instance as Dispatcher
        }
    }
}
