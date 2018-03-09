package com.budgetyourfuture.actions

interface TodoActions {
    companion object {
        val TODO_CREATE = "todo-create"
        val TODO_COMPLETE = "todo-complete"
        val TODO_DESTROY = "todo-destroy"
        val TODO_DESTROY_COMPLETED = "todo-destroy-completed"
        val TODO_TOGGLE_COMPLETE_ALL = "todo-toggle-complete-all"
        val TODO_UNDO_COMPLETE = "todo-undo-complete"
        val TODO_UNDO_DESTROY = "todo-undo-destroy"

        val KEY_TEXT = "key-text"
        val KEY_ID = "key-id"
    }
}
