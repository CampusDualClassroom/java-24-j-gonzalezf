package com.campusdual.classroom;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    private static final String[] ELEMENTS = {
            "Smith", "Montessori", "Peralta", "House"
    };

    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        Collections.addAll(queue, ELEMENTS);

        return queue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            // peek obtiene el primer elemento sin quitarlo
            System.out.println(queue.peek());
            // poll elimina el primer elemento de la cola
            queue.poll();
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        printAndEmptyQueue(queue);
    }

}
