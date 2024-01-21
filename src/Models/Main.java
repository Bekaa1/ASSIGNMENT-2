package Models;

import Models.Uni;
import Models.Uni;
import Models.Person;
import Models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person e1 = new Uni("Ernur", "Akhmetsadykov", "Manager", 5420);
        Person e2 = new Uni("Alexander", "Gultyaev", "Designer", 4200);
        Person e3 = new Uni("Askar", "Haimuldin", "Teacher", 1150000);
        Person e4 = new Uni("Tomas", "Shelby", "Gangster", 163450);
        Person e5 = new Uni("Cristiano", "Ronaldo", "Football player", 360500);

        Person s1 = new Student("Arsen", "Moldybai", 2.81);
        Person s2 = new Student("Zakir", "Aripzhanov", 2.17);
        Person s3 = new Student("Temirlan", "Baibossyn", 2.02);
        Person s4 = new Student("Nurlan", "Akhmetsadykov", 3.14);
        Person s5 = new Student("Bekzhan", "Nurallin", 3.83);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}