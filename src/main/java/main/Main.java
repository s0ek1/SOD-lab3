package main;

import priorityQueue.array.ArrayQueue;
import priorityQueue.array.ArrayQueueProcessor;
import priorityQueue.linkList.LinkListQueue;
import priorityQueue.linkList.LinkListQueueProcessor;
import ui.UI;
import ui.UIProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        UI ui = new UIProcessor();
        ArrayQueue arrQueue = new ArrayQueueProcessor();
        LinkListQueue linkListQueue = new LinkListQueueProcessor();
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        menu();
        while (status) {
            int option = scanner.nextInt();
            switch (option) {
                case -1 -> menu();
                case 0 -> status = false;
                case 1 -> ui.createQueue(arrQueue);
                case 2 -> ui.showSortedPriorityQueue(arrQueue);
                case 3 -> ui.addElement(scanner, arrQueue);
                case 4 -> System.out.println(ui.removeElement(arrQueue));

                case 5 -> ui.createQueue(linkListQueue);
                case 6 -> ui.showSortedPriorityQueue(linkListQueue);
                case 7 -> ui.addElement(scanner, linkListQueue);
                case 8 -> System.out.println(ui.removeElement(linkListQueue));

            }
            System.out.print(":");
        }
    }
    private void menu() {
        System.out.print("""
                            =================     ================= 
                            [0] - Завершити програму.
                                     [------ Массив ------]
                            [1] - Создать.    
                            [2] - Вывести отсортировку по убыванию.
                            [3] - Добавить елемент.
                            [4] - Удалить елемент.
                                     [------ Список ------]
                            [5] - Создать.    
                            [6] - Вывести отсортировку по убыванию.
                            [7] - Добавить елемент.
                            [8] - Удалить елемент.
                        :""");
    }
}