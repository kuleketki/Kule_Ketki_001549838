/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.time.Instant;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class Encounter {

    private VitalSigns vitalSigns;
    private Timestamp timeStamp;

    public Encounter(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
        this.timeStamp = Timestamp.from(Instant.now());
    }

    public Encounter(VitalSigns vitalSigns, Timestamp timestamp) {
        this.vitalSigns = vitalSigns;
        this.timeStamp = timestamp;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

}
