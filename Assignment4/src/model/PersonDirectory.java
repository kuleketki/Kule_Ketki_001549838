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
public class PersonDirectory {

    private ArrayList<Person> alPersons;

    public PersonDirectory() {
        alPersons = new ArrayList<>();
    }

    public ArrayList<Person> getPersonsList() {
        return alPersons;
    }

    public void setAlPersons(ArrayList<Person> alPersons) {
        this.alPersons = alPersons;
    }

}
