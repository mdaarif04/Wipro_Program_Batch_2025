package com.queue;

//Create a patient class (name, condition, priority) and add priorityqueue using 1,2 or 3


class Patient implements Comparable<Patient> {
    String name;
    String condition;
    int priority; // 1 = High, 2 = Medium, 3 = Low

    public Patient(String name, String condition, int priority) {
        this.name = name;
        this.condition = condition;
        this.priority = priority;
    }

    // Sort based on priority (lower number = higher priority)
    @Override
    public int compareTo(Patient o) {
        return Integer.compare(this.priority, o.priority);
    }

    @Override
    public String toString() {
        return name + " (" + condition + ") - Priority: " + priority;
    }
}