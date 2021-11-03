/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.Timestamp;
import java.util.ArrayList;
import model.City;
import model.Community;
import model.Encounter;
import model.House;
import model.Patient;
import model.Person;
import model.System;
import model.VitalSigns;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class UtilityClass {

    System system;

    public UtilityClass(System system) {
        this.system = system;
        loadData();
    }

    private void loadData() {

        City city = new City(0, "Abington", "Massachusetts");
        system.getCityDirectory().getCityList().add(city);
        //COmmunity 0
        Community community = new Community(0, "Paraside Hub");
        city.getCommunityList().add(community);
        House house = new House(32, 3, "Apt 32, Paraside Lane A , Abington", "02351", 0, 0);
        community.getHouseList().add(house);
        Person person = new Person(1, "Sharon", "Dsouza", 28, 9757286049L, "CXNPK9025P", "A+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        Patient patient = new Patient(1, person);
        VitalSigns vitalSigns = new VitalSigns(100, 80, 14, 122, 82, 78F, 170.5F);
        Encounter encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-06-13 14:00:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 123, 88, 78F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-01-9 16:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);

        person = new Person(2, "Merlit", "Dsouza", 35, 9857286049L, "CUNPK9025P", "A+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(2, person);
        vitalSigns = new VitalSigns(100, 80, 14, 130, 85, 78F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2019-06-10 14:00:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 132, 89, 78F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-01-5 16:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        
        house = new House(33, 4, "Apt 33, Paraside Hub Lane A , Abington", "02351", 0, 0);
        community.getHouseList().add(house);
        person = new Person(3, "Jason", "Smith", 29, 8857286049L, "OLNPK9025P", "B+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(3, person);
        vitalSigns = new VitalSigns(100, 80, 14, 135, 90, 80F, 185.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2018-06-10 14:00:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 132, 89, 80F, 180.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2019-01-5 16:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        
        house = new House(31, 3, "Apt 31, Paraside Hub Lane A , Abington", "02351", 0, 0);
        community.getHouseList().add(house);
        person = new Person(4, "Ketki", "Kule", 26, 8097924714L, "CXNPK9185Q", "A+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(4, person);
        vitalSigns = new VitalSigns(100, 80, 14, 115, 75, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-09-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 115, 75, 72F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-02-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);

        person = new Person(5, "Shubhankar", "Dandekar", 26, 9920809348L, "KCKSD1605K", "B-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(5, person);
        vitalSigns = new VitalSigns(100, 80, 14, 115, 75, 75F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-01-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 115, 75, 75F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-05-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        house = new House(1, 6, "Apt 1, Paraside Hub Lane A , Abington", "02350", 0, 0);
        community.getHouseList().add(house);
        person = new Person(6, "Jack", "WHite", 55, 5220809348L, "OLKSD1605K", "O-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(6, person);
        vitalSigns = new VitalSigns(101, 70, 15, 140, 75, 60F, 165.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-05-8 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(101, 75, 13, 135, 75, 62F, 165.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-05-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        
        person = new Person(7, "Cameron", "White", 60, 3920809358L, "PCKSD2541K", "AB-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(7, person);
        vitalSigns = new VitalSigns(100, 80, 14, 115, 75, 75F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-01-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 115, 75, 75F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-05-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        
        house = new House(6, 7, "Apt 6, Paraside Hub Lane B , Abington", "02350", 0, 0);
        community.getHouseList().add(house);
        person = new Person(8, "Linghao", "Du", 75, 8540809358L, "MKSTF8501K", "A-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(8, person);
        vitalSigns = new VitalSigns(98, 82, 17, 135, 90, 74F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-03-3 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 85, 17, 140, 92, 75F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-04-28 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        person = new Person(9, "Lui", "Du", 85, 9630809358L, "UDXSD1462Y", "B+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(9, person);
        vitalSigns = new VitalSigns(98, 90, 20, 135, 82, 68F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-01-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 102, 18, 130, 82, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-05-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        house = new House(8, 4, "Apt 8, Paraside Hub Lane B , Abington", "02350", 0, 0);
        community.getHouseList().add(house);

        //Community 1
        community = new Community(1, "Rockers Tale");
        city.getCommunityList().add(community);
        house = new House(32, 3, "Apt 32, Rockers Tale , Abington", "02355", 1, 0);
        community.getHouseList().add(house);
        person = new Person(10, "John", "Keller", 24, 6147858921L, "ABVPK1825L", "B+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(10, person);
        vitalSigns = new VitalSigns(100, 80, 14, 115, 75, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-09-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 115, 75, 72F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-02-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        person = new Person(11, "Jared", "Keller", 60, 6147858921L, "JARPK1825L", "O+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(11, person);
        vitalSigns = new VitalSigns(100, 80, 14, 115, 75, 90F, 185.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2017-09-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 130, 85, 105F, 185.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-02-23 11:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        
        house = new House(33, 4, "Apt 33, Rockers Tale , Abington", "02355", 1, 0);
        community.getHouseList().add(house);
        house = new House(31, 3, "Apt 31, Rockers Tale , Abington", "02355", 1, 0);
        community.getHouseList().add(house);
        person = new Person(12, "Helen", "Harrington", 75, 7825058931L, "CBVKK1029L", "AB+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(12, person);
        vitalSigns = new VitalSigns(100, 80, 14, 121, 75, 65F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-02-06 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 122, 79, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-06-12 8:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        
        house = new House(1, 6, "Apt 1, Rockers Tale , Abington", "02355", 1, 0);
        community.getHouseList().add(house);
        house = new House(6, 7, "Apt 6, Rockers Tale , Abington", "02355", 1, 0);
        community.getHouseList().add(house);
        person = new Person(13, "Josephine", "House", 49, 5236924714L, "UJYTF9185Q", "O+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(13, person);
        vitalSigns = new VitalSigns(98, 85, 16, 125, 85, 71F, 160.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-08-21 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 86, 16, 126, 90, 69F, 160.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-01-21 13:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        house = new House(8, 4, "Apt 8, Rockers Tale , Abington", "02355", 1, 0);
        community.getHouseList().add(house);

        community = new Community(2, "Fishers Bay");
        city.getCommunityList().add(community);
        house = new House(10, 6, "Apt 10, Fishers Bay Area , Abington", "02352", 2, 0);
        community.getHouseList().add(house);
        house = new House(11, 4, "Apt 11, Fishers Bay Area, Abington", "02352", 2, 0);
        community.getHouseList().add(house);
        house = new House(12, 3, "Apt 12, Fishers Bay Area, Abington", "02352", 2, 0);
        community.getHouseList().add(house);
        house = new House(13, 6, "Apt 13, Fishers Bay Area , Abington", "02352", 2, 0);
        community.getHouseList().add(house);
        house = new House(14, 7, "Apt 14, Fishers Bay Area , Abington", "02352", 2, 0);
        community.getHouseList().add(house);
        house = new House(15, 4, "Apt 15, Fishers Bay Area , Abington", "02352", 2, 0);
        community.getHouseList().add(house);

        //City1
        city = new City(1, "Brighton", "Massachusetts");
        system.getCityDirectory().getCityList().add(city);
        community = new Community(0, "Towny Estate");
        city.getCommunityList().add(community);
        house = new House(34, 4, "Apt 34, lakeshore Terr , Brighton", "02135", 0, 1);
        community.getHouseList().add(house);
        person = new Person(14, "Jessy", "Foreman", 35, 5012487932L, "YTFRJ0235I", "O-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(14, person);
        vitalSigns = new VitalSigns(99, 80, 14, 130, 82, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-10-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(102, 82, 15, 135, 82, 72F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-08-23 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        house = new House(32, 4, "Apt 32, lakeshore Terr , Brighton", "02135", 0, 1);
        community.getHouseList().add(house);
        house = new House(31, 3, "Apt 31, lakeshore Terr , Brighton", "02135", 0, 1);
        community.getHouseList().add(house);
        house = new House(25, 6, "Apt 25, lakeshore Rd , Brighton", "02135", 0, 1);
        community.getHouseList().add(house);
        house = new House(24, 4, "Apt 24, lakeshore Rd , Brighton", "02135", 0, 1);
        community.getHouseList().add(house);
        house = new House(23, 2, "Apt 23, lakeshore Rd , Brighton", "02135", 0, 1);
        community.getHouseList().add(house);

        community = new Community(1, "Treasure Vile");
        city.getCommunityList().add(community);
        house = new House(34, 4, "Apt 34, Treasure Vile , Brighton", "02134", 1, 1);
        community.getHouseList().add(house);
        person = new Person(15, "Keval", "Tanna", 45, 9004298809L, "KLTRD0235I", "AB-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        person = new Person(16, "Massie", "Wilson", 50, 8523649752L, "GFTRD5432J", "AB+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(16, person);
        vitalSigns = new VitalSigns(100, 80, 14, 130, 82, 85F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-10-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 135, 82, 90F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-08-23 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        house = new House(32, 4, "Apt 32, Treasure Vile , Brighton", "02134", 1, 1);
        community.getHouseList().add(house);
        house = new House(31, 3, "Apt 31, Treasure Vile , Brighton", "02134", 1, 1);
        community.getHouseList().add(house);
        person = new Person(17, "Prakash", "Bhatt", 52, 8544298809L, "YRTRD0235I", "B-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(17, person);
        vitalSigns = new VitalSigns(100, 80, 14, 130, 82, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-10-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 135, 82, 72F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-08-23 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        person = new Person(18, "Tracy", "Todd", 25, 7458298809L, "TYRDQ8547R", "A-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(18, person);
        vitalSigns = new VitalSigns(100, 80, 14, 130, 82, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-10-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 135, 82, 72F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-08-23 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        person = new Person(19, "Joil", "Todd", 85, 8021298809L, "TTGVB2031T", "A-", house);
        system.getPersonDirectory().getPersonsList().add(person);
        patient = new Patient(19, person);
        vitalSigns = new VitalSigns(100, 80, 14, 130, 82, 70F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2020-10-23 10:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        vitalSigns = new VitalSigns(99, 82, 15, 135, 82, 72F, 170.5F);
        encounter = new Encounter(vitalSigns, Timestamp.valueOf("2021-08-23 9:10:10.0"));
        patient.getEncounterHistory().getEncounters().add(encounter);
        system.getPatientDirectory().getPatientsList().add(patient);
        house = new House(25, 6, "Apt 25, Treasure Vile , Brighton", "02134", 1, 1);
        community.getHouseList().add(house);
        person = new Person(20, "Janet", "Bing", 85, 8000298809L, "UNGVB2031T", "A+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        house = new House(24, 4, "Apt 24, Treasure Vile , Brighton", "02134", 1, 1);
        community.getHouseList().add(house);
        person = new Person(21, "Harry", "Juggles", 52, 8070298809L, "UNIVB2031T", "AB+", house);
        system.getPersonDirectory().getPersonsList().add(person);
        house = new House(23, 2, "Apt 23, Treasure Vile , Brighton", "02134", 1, 1);
        community.getHouseList().add(house);
        person = new Person(22, "George", "Tribbiani", 70, 2500298809L, "ONGVB2031T", "A+", house);
        system.getPersonDirectory().getPersonsList().add(person);

    }

}
