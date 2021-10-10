/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import model.Car;
import model.Driver;
import model.Uber;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class UtilityClass {

    Uber uber;

    public UtilityClass(Uber uber) {
        this.uber = uber;
        loadData();
    }

    private void loadData() {

        LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 8);
        Car car = new Car("ZZZ-9999", "K5", "Kia", 2019, 5, localDate);
        Driver driver = new Driver(car, "Brighton", false, "ZZZ-9999");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.DECEMBER, 18);
        car = new Car("ABC-9349", "Sonata", "Hyundai", 2018, 5, localDate);
        driver = new Driver(car, "Boston", false, "ABC-9349");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2021, Month.FEBRUARY, 8);
        car = new Car("QBC-1548", "CX5", "Mazda", 2018, 5, localDate);
        driver = new Driver(car, "Allston", false, "QBC-1548");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.MARCH, 28);
        car = new Car("YUR-7845", "Santa fe", "Hyundai", 2018, 5, localDate);
        driver = new Driver(car, "Newton", false, "YUR-7845");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2019, Month.NOVEMBER, 11);
        car = new Car("JWT-1248", "GLA", "Mercedes", 2018, 5, localDate);
        driver = new Driver(car, "Roxbury", false, "JWT-1248");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2018, Month.MAY, 11);
        car = new Car("YER-9349", "GLB", "Mercedes", 2018, 5, localDate);
        driver = new Driver(car, "Boston", true, "YER-9349");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2025, Month.JULY, 9);
        car = new Car("ROR-1248", "Palisade", "Hyundai", 2018, 8, localDate);
        driver = new Driver(car, "Waltham", true, "ROR-1248");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2020, Month.MAY, 4);
        car = new Car("CRD-8457", "Accord", "Honda", 2012, 6, localDate);
        driver = new Driver(car, "Cambridge", false, "CRD-8457");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.NOVEMBER, 22);
        car = new Car("KUT-6253", "TLX", "Accura", 2018, 4, localDate);
        driver = new Driver(car, "Lowell", false, "KUT-6253");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.OCTOBER, 16);
        car = new Car("TYR-8470", "GL80", "Mercedes", 2018, 5, localDate);
        driver = new Driver(car, "Woburn", false, "TYR-8470");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2023, Month.DECEMBER, 27);
        car = new Car("IUT-0152", "GV70", "Genesis", 2018, 5, localDate);
        driver = new Driver(car, "Beverly", false, "IUT-0152");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2023, Month.MARCH, 19);
        car = new Car("MJN-2589", "G70", "Genesis", 2020, 5, localDate);
        driver = new Driver(car, "Province Town", false, "MJN-2589");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.FEBRUARY, 9);
        car = new Car("RTF-9349", "Tucson", "Hyundai", 2016, 5, localDate);
        driver = new Driver(car, "Brookline", true, "RTF-9349");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2019, Month.JANUARY, 4);
        car = new Car("UHY-1485", "Civic", "Honda", 2018, 5, localDate);
        driver = new Driver(car, "WaterTown", true, "UHY-1485");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2024, Month.AUGUST, 2);
        car = new Car("IJY-0214", "CRV", "Honda", 2018, 5, localDate);
        driver = new Driver(car, "Malden", false, "IJY-0214");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2023, Month.JULY, 29);
        car = new Car("TRE-1248", "CX5", "Mazda", 2018, 5, localDate);
        driver = new Driver(car, "WestFord", false, "TRE-1248");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.SEPTEMBER, 15);
        car = new Car("KKK-2709", "Mazda3", "Mazda", 2018, 5, localDate);
        driver = new Driver(car, "Boston", false, "KKK-2709");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2019, Month.JULY, 11);
        car = new Car("SLD-1609", "Mazda6", "Mazda", 2018, 5, localDate);
        driver = new Driver(car, "Boston", true, "SLD-1609");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2019, Month.MAY, 11);
        car = new Car("SCK-1235", "Mazda6", "Mazda", 2020, 6, localDate);
        driver = new Driver(car, "Boston", true, "SCK-1235");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2022, Month.SEPTEMBER, 11);
        car = new Car("JDT-4525", "Mazda6", "Mazda", 2019, 6, localDate);
        driver = new Driver(car, "Boston", true, "JDT-4525");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2021, Month.JULY, 11);
        car = new Car("JHY-8547", "MazdaMX5", "Mazda", 2019, 2, localDate);
        driver = new Driver(car, "Boston", true, "JHY-8547");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        localDate = LocalDate.of(2023, Month.JULY, 11);
        car = new Car("YHB-0258", "BMW320i", "BMW", 2020, 2, localDate);
        driver = new Driver(car, "Boston", false, "YHB-0258");
        
        uber.getCarDirectory().addCar(car);
        uber.getDriverDirectory().addDriver(driver);
        
        uber.getDriverDirectory().setDate(new Date());
    }

}
