/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class Patient {

    private Person person;
    private EncounterHistory encounterHistory;
    private int patientId;

    public Patient(int id, Person person) {
        this.patientId = id;
        this.person = person;
        encounterHistory = new EncounterHistory();
    }

    public int getPatientId() {
        return patientId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

}
