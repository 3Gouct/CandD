package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    MoviesItem first = new MoviesItem ("first");
    MoviesItem second = new MoviesItem ("second");
    MoviesItem third = new MoviesItem ("third");
    MoviesItem fourth = new MoviesItem ("fourth");
    MoviesItem fifth = new MoviesItem ("fifth");
    MoviesItem sixth = new MoviesItem ("sixth");
    MoviesItem seventh = new MoviesItem ("seventh");
    MoviesItem eighth = new MoviesItem ("eighth");
    MoviesItem ninth = new MoviesItem ("ninth");
    MoviesItem tenth = new MoviesItem ("tenth");
    MoviesItem eleventh = new MoviesItem ("eleventh");

    @Test
    void addMovie() {
        Manager manager = new Manager ();
        manager.add (first);
        manager.add (second);
        manager.add (third);
        manager.add (fourth);
        manager.add (fifth);
        manager.add (sixth);


        MoviesItem[] actual = manager.findAll ();
        MoviesItem[] expected = {first, second, third, fourth, fifth, sixth};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    void lessLimitFindLast() {
        Manager manager = new Manager (4);
        manager.add (first);
        manager.add (second);
        manager.add (third);
        manager.add (fourth);
        manager.add (fifth);
        manager.add (sixth);

        MoviesItem[] actual = manager.findLast ();
        MoviesItem[] expected = {sixth, fifth, fourth, third};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    void limitFindLast() {
        Manager manager = new Manager (10);
        manager.add (first);
        manager.add (second);
        manager.add (third);
        manager.add (fourth);
        manager.add (fifth);
        manager.add (sixth);
        manager.add (seventh);
        manager.add (eighth);
        manager.add (ninth);
        manager.add (tenth);

        MoviesItem[] actual = manager.findLast ();
        MoviesItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    void moreLimitFindLast() {
        Manager manager = new Manager (11);
        manager.add (first);
        manager.add (second);
        manager.add (third);
        manager.add (fourth);
        manager.add (fifth);
        manager.add (sixth);
        manager.add (seventh);
        manager.add (eighth);
        manager.add (ninth);
        manager.add (tenth);
        manager.add (eleventh);

        MoviesItem[] actual = manager.findLast ();
        MoviesItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals (expected, actual);
    }
}