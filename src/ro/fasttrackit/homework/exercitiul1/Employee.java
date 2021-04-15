package ro.fasttrackit.homework.exercitiul1;

import java.util.Date;

public class Employee implements Person {
    int dateOfEmployment(int dataAngajarii){
        return dataAngajarii;
    }
    String position(String pozitie){
        return pozitie;
    }
    @Override
    public String firstName(String numeFam) {
        return numeFam;
    }

    @Override
    public String secondName(String numePrim) {
        return numePrim;
    }

    @Override
    public Date birthDay(Date ziiDeNastere) {
        return ziiDeNastere;
    }

    @Override
    public String address(String locatia) {
        return locatia;
    }
}
