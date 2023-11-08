package com.neosoft;

import com.neosoft.utils.Input;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main
{
    private static TodoList todoList = new TodoList();

    public static void main(String[] args)
    {
        while (true) {
            try {
                System.out.println("==== Choisir l'action : ====");
                System.out.println("0 : Ajouter taches pour test");
                System.out.println("1 : Ajouter une tache");
                System.out.println("2 : Supprimer une tache");
                System.out.println("3 : Lister les taches");
                Scanner scan = new Scanner(System.in);
                Integer action = null;
                action = scan.nextInt();
                if (action < 4) {
                    switch (action) {
                        case 0 :
                            addItem(); break;
                        case 1 :
                            addTask(); break;
                        case 2 :
                            deleteTask(); break;
                        case 3 :
                            System.out.println("==== Lister les taches ====");
                            listTask(); break;
                        default:
                            System.out.println("Errreur de traitement");
                    }
                } else {
                    System.err.println("Saisie non valide !");
                }
                System.out.println("");
            } catch (Exception e) {
                System.err.println("Choix action non valide !");
            }
        }
    }

    private static void addTask()
    {
        System.out.println("===== Saisie d'une Tache ====");
        System.out.println("Name :");
        Input inputString = new Input();
        String name = inputString.inputString();

        System.out.println("Description :");
        String desc = inputString.inputString();

        Scanner scan = new Scanner(System.in);
        System.out.println("Priorité : ");
        Input inputInteger = new Input();
        Integer prio = inputInteger.inputInteger();

        Tache task = new Tache(name, LocalDate.now(), desc, prio, "todo");
        try {
            todoList.addTask(task);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Tache enregistrée !");
    }

    private static void deleteTask()
    {
        System.out.println("==== Supprimer une tache ====");
        listTask();
        boolean poursuivre = true;
        while (poursuivre) {
            System.out.println("Saisir le nom de la tache a supprimer :");
            Input inputStr = new Input();
            String fieldSearch = inputStr.inputString();

            Tache tacheFind = todoList.findTache(fieldSearch);
            if (tacheFind == null) {
                System.err.println("Le nom de tache saisie n'existe pas.");
            }

            if (tacheFind != null) {
                poursuivre = false;
                tacheFind.displayTache();
                todoList.removeTask(tacheFind);
            }
        }
        System.out.println("Tache supprimée !");
    }

    private static void listTask()
    {
        for (Tache currentTask : todoList.getListTache()) {
            currentTask.displayTache();
        }
    }

    private static void addItem()
    {
        Tache task = new Tache("first", LocalDate.now(), "descrip first", 1, "todo");
        Tache task1 = new Tache("test", LocalDate.now(), "test", 2, "todo");
        Tache task2 = new Tache("teAZst", LocalDate.now(), "tesAZt", 3, "todo");
        todoList.addTask(task);
        todoList.addTask(task1);
        todoList.addTask(task2);
    }
}