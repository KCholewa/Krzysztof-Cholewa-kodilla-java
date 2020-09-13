package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ObserverTestSuite {

    @Test
    public void testAddObserverAndExercises() {
        //given
        ExercisesList janKowalskiExercises = new ExercisesList(new Student("Jan Kowalski"));
        ExercisesList wieslawNowakExercises = new ExercisesList(new Student("Wieslaw Nowak"));
        ExercisesList jozefMalinowskiExercises = new ExercisesList(new Student("Jozef Malinowski"));
        ExercisesList jozefWisniewskiExercises = new ExercisesList(new Student("Jozef Wisniewski"));

        Mentor firstMentor = new Mentor("First mentor");
        Mentor secondMentor = new Mentor("Second mentor");

        janKowalskiExercises.registerObserver(firstMentor);
        wieslawNowakExercises.registerObserver(firstMentor);
        jozefMalinowskiExercises.registerObserver(secondMentor);
        jozefWisniewskiExercises.registerObserver(secondMentor);

        //when
        janKowalskiExercises.addExercise("Ex.1");
        janKowalskiExercises.addExercise("Ex.2");
        janKowalskiExercises.addExercise("Ex.3");
        janKowalskiExercises.addExercise("Ex.4");
        wieslawNowakExercises.addExercise("Ex. 5");
        wieslawNowakExercises.addExercise("Ex. 6");
        wieslawNowakExercises.addExercise("Ex. 7");
        jozefMalinowskiExercises.addExercise("Ex. 8");
        jozefMalinowskiExercises.addExercise("Ex. 9");
        jozefWisniewskiExercises.addExercise("Ex 10");

        //then
        assertEquals(4, janKowalskiExercises.getExercises().size());
        assertEquals(3, wieslawNowakExercises.getExercises().size());
        assertEquals(2, jozefMalinowskiExercises.getExercises().size());
        assertEquals(1, jozefWisniewskiExercises.getExercises().size());
        assertEquals(7, firstMentor.getCounter());
        assertEquals(3,secondMentor.getCounter());
    }

    @Test
    public void testRemoveObserverAndExercises() {
        //given
        ExercisesList janKowalskiExercises = new ExercisesList(new Student("Jan Kowalski"));
        ExercisesList jozefWisniewskiExercises = new ExercisesList(new Student("Jozef Wisniewski"));

        Mentor firstMentor = new Mentor("First mentor");
        Mentor secondMentor = new Mentor("Second mentor");

        List<Mentor> mentors = new ArrayList<>();
        mentors.add(firstMentor);
        mentors.add(secondMentor);

        janKowalskiExercises.registerObserver(firstMentor);
        jozefWisniewskiExercises.registerObserver(secondMentor);

        janKowalskiExercises.addExercise("Ex.1");
        janKowalskiExercises.addExercise("Ex.2");
        janKowalskiExercises.addExercise("Ex.3");
        janKowalskiExercises.addExercise("Ex.4");
        jozefWisniewskiExercises.addExercise("Ex 5");

        //when
        janKowalskiExercises.removeExercise("Ex.1");
        jozefWisniewskiExercises.removeObserver(secondMentor);

        //then
        assertEquals(3, janKowalskiExercises.getExercises().size());
        assertEquals(0, jozefWisniewskiExercises.getObservers().size());
        assertEquals(1, janKowalskiExercises.getObservers().size());
    }
}
