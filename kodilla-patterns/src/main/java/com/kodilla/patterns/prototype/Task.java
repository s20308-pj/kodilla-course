package com.kodilla.patterns.prototype;

import java.util.Objects;

public final class Task {
    private String name;

    public String getName() {
        return name;
    }

    public Task(String task) {
        name = task;
    }

    @Override
    public String toString() {
        return "      Task [" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}