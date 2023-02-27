package com.split.splitter.domain.model;

import org.javamoney.moneta.Money;

import java.util.Set;

public class Ausgabe {

    private final Person person;

    private final Set<Person> teilnehmende;

    private final Money betrag;

    private final String beschreibung;

    public Ausgabe(Person person, Set<Person> teilnehmende, Money betrag, String beschreibung) {
        this.person = person;
        this.teilnehmende = teilnehmende;
        this.betrag = betrag;
        this.beschreibung = beschreibung;
    }

    public Person getPerson() {
        return person;
    }

    public Set<Person> getTeilnehmende() {
        return teilnehmende;
    }

    public Money getBetrag() {
        return betrag;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}