package com.iluwatar.memento;

import java.util.Stack;

public class StarCaretaker {
    Stack<StarMemento> states = new Stack<>();

    public void add(StarMemento memento) {
        states.add(memento);
    }

    public boolean isNotEmpty() {
        return this.states.size() > 0;
    }

    public StarMemento getLast() {
        return this.states.pop();
    }
}
