package com.company.schmidt;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> task = new ArrayList<>();

        while (true) {

            menu();
            int choices = input.nextInt();

            switch (choices) {
                case 1://add a task
                    System.out.println("Please enter a description of the task");
                    String a = input.next();
                    addTask(task, a);
                    break;
                case 2://delete a task
                    System.out.println("Enter the number of the task you would like to delete in the list");
                    listTask(task);
                    int i = input.nextInt();
                    deleteTask(task,i);
                    break;
                case 3://update
                    listTask(task);
                    System.out.println("Please enter the number of the task you would want to update");
                    i = input.nextInt();
                    System.out.println("Enter what you want the task to say");
                    a = input.next();
                    updateTask(task,i,a);
                    break;
                case 4://list out tasks
                    listTask(task);
                    break;
                case 0://end
                    System.exit(0);
            }
        }

    }



    static void menu() {
        System.out.println("Please chose an option 0-4");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all the tasks.");
        System.out.println("(0) Exit");
    }
    public static void addTask(ArrayList<String> task, String add) {
        task.add(add);
    }

    public static void deleteTask(ArrayList<String> task, int del) {
        task.remove(del -1);
    }

    public static void listTask(ArrayList<String> task) {
        for (int i = 0; i < task.size(); i++){
            System.out.println(i + "| " + task.get(i));
        }

    }
    public static void updateTask(ArrayList<String> task, int i, String a) {
        task.set(i,a);
    }


}

