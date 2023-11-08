package com.neosoft;

import java.time.LocalDate;

public class Tache {
    private String name;
    private final LocalDate dateCreation;
    private String description;
    private Integer priorite;
    private String status;
    private Integer temps;

    public Tache(String name, LocalDate dateCreation, String description, Integer priorite, String status) {
        this.name = name;
        this.dateCreation = dateCreation;
        this.description = description;
        this.priorite = priorite;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriorite() {
        return priorite;
    }

    public void setPriorite(Integer priorite) {
        this.priorite = priorite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTemps() {
        return temps;
    }

    public void setTemps(Integer temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "name='" + name + '\'' +
                ", dateCreation=" + dateCreation +
                ", description='" + description + '\'' +
                '}';
    }

    public void displayTache() {
        System.out.println("Tache : "+ name);
        System.out.println("    Date de création : " + dateCreation + "Description : " + description);
    }
}
