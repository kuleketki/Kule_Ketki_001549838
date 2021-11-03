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
public class System {

    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private CityDirectory cityDirectory;

    public System() {
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        cityDirectory = new CityDirectory();
    }

    public CityDirectory getCityDirectory() {
        return cityDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

}
