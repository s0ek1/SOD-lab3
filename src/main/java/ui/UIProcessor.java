package ui;

import priorityQueue.array.ArrayQueue;
import priorityQueue.linkList.LinkListQueue;

import java.util.Random;
import java.util.Scanner;

public class UIProcessor implements UI {
    @Override
    public void showSortedPriorityQueue(ArrayQueue arrQueue) {
        System.out.println(arrQueue);
    }
    @Override
    public void createQueue(ArrayQueue arrQueue) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            arrQueue.add(random.nextInt(-1234, 1234));
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Времени затрачено: " + time + " миллисекунд");
    }

    @Override
    public void addElement(Scanner scanner, ArrayQueue arrQueue) {
        System.out.print("Введите елемент для добавления: ");
        int element = scanner.nextInt();
        arrQueue.add(element);
    }
    @Override
    public int removeElement(ArrayQueue arrQueue) {
       return arrQueue.remove();
    }
    @Override
    public void showSortedPriorityQueue(LinkListQueue linkListQueue) {
        System.out.println(linkListQueue);
    }
    @Override
    public void createQueue(LinkListQueue linkListQueue) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <= 1000; i++) {
            linkListQueue.add(random.nextInt(-1234, 1234));
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Времени затрачено: " + time + " миллисекунд");
    }
    @Override
    public void addElement(Scanner scanner, LinkListQueue linkListQueue) {
        System.out.print("Введите елемент для добавления: ");
        int element = scanner.nextInt();
        linkListQueue.add(element);
    }
    @Override
    public int removeElement(LinkListQueue linkListQueue) {
        return linkListQueue.remove();
    }
}