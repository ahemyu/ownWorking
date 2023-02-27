package com.split.splitter.domain.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    private final String name;

    private final int id;

    private final Set<Gruppe> gruppen = new HashSet<>();


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Set<Gruppe> getGruppen() {
        return gruppen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}