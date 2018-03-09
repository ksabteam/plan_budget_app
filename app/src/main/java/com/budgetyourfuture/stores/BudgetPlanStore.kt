package com.budgetyourfuture.stores

import com.budgetyourfuture.actions.Action
import com.budgetyourfuture.dispatcher.Dispatcher
import com.squareup.otto.Subscribe

import java.util.ArrayList
import java.util.Collections

class BudgetPlanStore protected constructor(dispatcher: Dispatcher) : Store(dispatcher) {
    private val todos: MutableList<Action>
    private var lastDeleted: Action? = null


    init {
        todos = ArrayList<Action>()
    }

    fun getTodos(): List<Any> {
        return todos
    }

    fun canUndo(): Boolean {
        return lastDeleted != null
    }


    @Subscribe
    override fun onAction(action: Action) {
        val id: Long
        when (Action.getType(action)) {
            /*TodoActions.TODO_CREATE -> {
                val text = action.getData().get(TodoActions.KEY_TEXT) as String
                create(text)
                emitStoreChange()
            }

            TodoActions.TODO_DESTROY -> {
                id = action.getData().get(TodoActions.KEY_ID)
                destroy(id)
                emitStoreChange()
            }

            TodoActions.TODO_UNDO_DESTROY -> {
                undoDestroy()
                emitStoreChange()
            }

            TodoActions.TODO_COMPLETE -> {
                id = action.getData().get(TodoActions.KEY_ID)
                updateComplete(id, true)
                emitStoreChange()
            }

            TodoActions.TODO_UNDO_COMPLETE -> {
                id = action.getData().get(TodoActions.KEY_ID)
                updateComplete(id, false)
                emitStoreChange()
            }

            TodoActions.TODO_DESTROY_COMPLETED -> {
                destroyCompleted()
                emitStoreChange()
            }

            TodoActions.TODO_TOGGLE_COMPLETE_ALL -> {
                updateCompleteAll()
                emitStoreChange()
            }*/
        }

    }

    private fun destroyCompleted() {
        /*val iter = todos.iterator()
        while (iter.hasNext()) {
            val todo = iter.next()
            if (todo.isComplete()) {
                iter.remove()
            }
        }*/
    }

    private fun updateCompleteAll() {
        if (areAllComplete()) {
            updateAllComplete(false)
        } else {
            updateAllComplete(true)
        }
    }

    private fun areAllComplete(): Boolean {
        /*for (todo in todos) {
            if (!todo.isComplete()) {
                return false
            }
        }*/
        return true
    }

    private fun updateAllComplete(complete: Boolean) {
        /*for (todo in todos) {
            todo.setComplete(complete)
        }*/
    }

    private fun updateComplete(id: Long, complete: Boolean) {
        /*val todo = getById(id)
        if (todo != null) {
            todo!!.setComplete(complete)
        }*/
    }

    private fun undoDestroy() {
        /*if (lastDeleted != null) {
            addElement(lastDeleted!!.clone())
            lastDeleted = null
        }*/
    }

    private fun create(text: String) {
        /*val id = System.currentTimeMillis()
        val todo = Todo(id, text)
        addElement(todo)
        Collections.sort(todos)*/
    }

    private fun destroy(id: Long) {
        /*val iter = todos.iterator()
        while (iter.hasNext()) {
            val todo = iter.next()
            if (todo.getId() === id) {
                lastDeleted = todo.clone()
                iter.remove()
                break
            }
        }*/
    }

    private fun getById(id: Long): Action? {
        /*val iter = todos.iterator()
        while (iter.hasNext()) {
            val todo = iter.next()
            if (todo.getId() === id) {
                return todo
            }
        }*/
        return null
    }


    private fun addElement(clone: Action) {
        /*todos.add(clone)
        Collections.sort(todos)*/
    }

    internal override fun changeEvent(): StoreChangeEvent {
        return TodoStoreChangeEvent()
    }

    inner class TodoStoreChangeEvent : StoreChangeEvent

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
