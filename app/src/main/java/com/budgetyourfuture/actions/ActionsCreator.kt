package com.budgetyourfuture.actions

import com.budgetyourfuture.dispatcher.Dispatcher
//import lgvalle.com.fluxtodo.model.Todo

class ActionsCreator internal constructor(internal val dispatcher: Dispatcher) {

    fun create(text: String) {
        dispatcher.dispatch(
                TodoActions.TODO_CREATE,
                TodoActions.KEY_TEXT, text
        )

    }

    fun destroy(id: Long) {
        dispatcher.dispatch(
                TodoActions.TODO_DESTROY,
                TodoActions.KEY_ID, id
        )
    }

    fun undoDestroy() {
        dispatcher.dispatch(
                TodoActions.TODO_UNDO_DESTROY
        )
    }

    /*fun toggleComplete(todo: Todo) {
        val id = todo.getId()
        val actionType = if (todo.isComplete()) TodoActions.TODO_UNDO_COMPLETE else TodoActions.TODO_COMPLETE

        dispatcher.dispatch(
                actionType,
                TodoActions.KEY_ID, id
        )
    }*/

    fun toggleCompleteAll() {
        dispatcher.dispatch(TodoActions.TODO_TOGGLE_COMPLETE_ALL)
    }

    fun destroyCompleted() {
        dispatcher.dispatch(TodoActions.TODO_DESTROY_COMPLETED)
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
