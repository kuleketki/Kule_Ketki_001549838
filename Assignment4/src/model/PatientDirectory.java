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
public class PatientDirectory {

    private ArrayList<Patient> patientsList;

    public PatientDirectory() {
        patientsList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientsList() {
        return patientsList;
    }

}
