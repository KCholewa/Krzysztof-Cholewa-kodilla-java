package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int counter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void exerciseUpdate(ExercisesList exercisesList) {
        System.out.println("Information for mentor "+name);
        System.out.println("Student "+exercisesList.getStudent().getStudentName()+" solved exercise: "+exercisesList.getExercises());
        counter++;
    }

    public int getCounter() {
        return counter;
    }

}
