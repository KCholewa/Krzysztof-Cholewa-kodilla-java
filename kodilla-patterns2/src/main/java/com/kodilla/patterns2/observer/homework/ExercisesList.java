package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ExercisesList implements Observable {
    private final Student student;
    private final List<Observer> observers;
    private final Deque<String> exercises;

    public ExercisesList(Student student) {
        this.student = student;
        exercises = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.exerciseUpdate(this);
           }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void removeExercise(String exercise) {
        exercises.remove(exercise);
    }

    public Deque<String> getExercises() {
        return exercises;
    }

    public Student getStudent() {
        return student;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
