package com.split.splitter.domain.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Gruppe {
    private final String name;
    private final Set<Person> personen;
    private final int id;

    private boolean istGeschlossen;

    private final Set<Ausgabe> ausgaben = new HashSet<>();

    public Gruppe(String name, Set<Person> personen, int id) {
        this.name = name;
        this.personen = personen;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public Set<Person> getPersonen() {
        return personen;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gruppe gruppe = (Gruppe) o;
        return id == gruppe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}