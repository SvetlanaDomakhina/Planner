package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void shouldSimpleTaskMatches() {
        SimpleTask task = new SimpleTask(5,"Позвонить родителям");
        boolean expected = true;
        boolean actual = task.matches("Позвонить родителям");
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSimpleTaskNotMatches() {
        SimpleTask task = new SimpleTask(5,"Позвонить родителям");
        boolean expected = false;
        boolean actual = task.matches("Написать родителям");
        assertEquals(expected, actual);

    }
    @Test
    public void shouldMeetingMatchesInTopic() {
        Meeting task = new Meeting(55, "ДЗ", "Нетология", "сегодня");
        boolean expected = true;
        boolean actual = task.matches("ДЗ");
        assertEquals(expected, actual);
    }
    @Test
    public void shouldMeetingMatchesInProject() {
        Meeting task = new Meeting(55, "ДЗ", "Нетология", "сегодня");
        boolean expected = true;
        boolean actual = task.matches("Нетология");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingNotMatches() {
        Meeting task = new Meeting(55, "ДЗ", "Нетология", "сегодня");
        boolean expected = false;
        boolean actual = task.matches("Лето");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic task = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = task.matches("Молоко");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEpicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic task = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = task.matches("Кофе");
        assertEquals(expected, actual);
    }

}