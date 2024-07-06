package com.example.helloworld;
import java.util.Scanner;

class HelloWorld
{
    public static void main(String[] args) {
        CustomLinkedLis list = new CustomLinkedLis();
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String description = input.next();
        int priority = input.nextInt();

        //checking conditions + adding to the linked list
        System.out.println("Enter in your input for the name, description, and priority number of your task: ");

        if (!(priority.hasNextInt()) {
            System.out.println("You did not enter an integer value for priority. Please try again.");

            if (name.isEmpty() || !(name.matches("[a-zA-Z ]+") || description.isEmpty() || !(description.matches("[a-zA-Z ]+")) {
                System.out.println("You did not enter a valid name or description. Please try again.");

                else if (while(!(name = input.next()).equalsIgnoreCase("done") && (description = input.next()) != null && (priority = input.nextInt()) >= 0 {
                list.add(new Task(name, description, priority));
                input.nextLine();
        }
    }

        //delete from the linkedlist
        System.out.println("Enter the name of the task you wish to delete: ");
        name = input.next();
        for (int i = 0; i < list.size(); i++) {
            Task task = list.get(i);
            if (task.getName().equalsIgnoreCase(name)) {
                list.delete(task.getName(i));
                i--;
            }

            //search the linkedlist
            System.out.println("Enter the name of the task you want to search for: ");
            name = input.next();
            Task searchTask = list.search(name);

            if (searchTask != null) {
                System.out.println("Task found: " + searchTask.getName() + ", " +
                        searchTask.getDescription() + ", Priority: " + searchTask.getPriority());
            } else {
                System.out.println("Task not found.");
            }

        //sort the linkedlist by priority number
        for (int y = 0; y < list.size() - 1; y++) {
            for (int z = 0; z < list.size() - y - 1; z++) {
                if (list.get(z).getPriority() > list.get(z + 1).getPriority()) {
                    Task temp = list.get(z);
                    list.set(z, list.get(z + 1));
                    list.set(z + 1, temp);
                }
            }
        }
    }
}
