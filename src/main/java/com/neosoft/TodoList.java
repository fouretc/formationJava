package com.neosoft;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Function;

public class TodoList {

    private Integer budget;

    //private ArrayList<Tache> listLevelTache = new ArrayList<Tache>();

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    private ArrayList<Tache> listTache = new ArrayList<Tache>();

    public void addTask(Tache task)
    {
        listTache.add(task);
    }

    public void removeTask(Tache task)
    {
        listTache.remove(task);
    }

    public ArrayList<Tache> getListTache() {
        return listTache;
    }

    public Tache findTache(String name)
    {
        return this.listTache.stream()
                .filter(item -> name.equals(item.getName()))
                .findFirst()
                .orElse(null);
    }
}
