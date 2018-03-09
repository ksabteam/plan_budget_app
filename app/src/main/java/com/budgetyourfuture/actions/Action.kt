package com.budgetyourfuture.actions

import java.util.HashMap

class Action internal constructor(val type: String, private val data: HashMap<String, Any>?) {

    fun getData(): HashMap<*, *>? {
        return data
    }

    class Builder {

        private var type: String? = null
        private var data: HashMap<String, Any>? = null

        internal fun with(type: String?): Builder {
            if (type == null) {
                throw IllegalArgumentException("Type may not be null.")
            }
            this.type = type
            this.data = HashMap()
            return this
        }

        fun bundle(key: String?, value: Any?): Builder {
            if (key == null) {
                throw IllegalArgumentException("Key may not be null.")
            }

            if (value == null) {
                throw IllegalArgumentException("Value may not be null.")
            }
            data!!.put(key, value)
            return this
        }

        fun build(): Action {
            if (type == null || type!!.isEmpty()) {
                throw IllegalArgumentException("At least one key is required.")
            }
            return Action(type as String, data)
        }
    }

    companion object {

        fun type(type: String): Builder {
            return Builder().with(type)
        }

        fun getType(action: Action): String {
            return action.type
        }
    }
}
