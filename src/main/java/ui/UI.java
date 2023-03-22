package ui;

import priorityQueue.array.ArrayQueue;
import priorityQueue.linkList.LinkListQueue;

import java.util.Scanner;

public interface UI {
    void showSortedPriorityQueue(ArrayQueue arrQueue);

    void createQueue(ArrayQueue arrQueue);

    void addElement(Scanner scanner, ArrayQueue arrQueue);

    int removeElement(ArrayQueue arrQueue);

    void showSortedPriorityQueue(LinkListQueue linkListQueue);

    void createQueue(LinkListQueue linkListQueue);

    void addElement(Scanner scanner, LinkListQueue linkListQueue);

    int removeElement(LinkListQueue linkListQueue);
}
