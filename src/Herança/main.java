package Herança;

import Herança.packege.Employer;
import Herança.packege.Manager;
import Herança.packege.Salesman;

public class main {
    public static void main(String[] args) {

        printEmployer(new Manager());
        printEmployer(new Salesman());
        
    }

    public static void printEmployer(Employer employer){

        if (employer instanceof  Manager manager){
            employer.setName("Fernando");
            manager.setLogin("FARAUJO");
            manager.setPassword("123456");

            System.out.println(employer.getName());
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
        }

    }

}
