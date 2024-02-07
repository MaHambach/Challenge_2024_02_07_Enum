package org.github.mahambach;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Alice", DaysOfWeek.MONDAY, Gender.FEMALE);
        Person person2 = new Person(2, "Bob", DaysOfWeek.TUESDAY, Gender.MALE);
        Person person3 = new Person(3, "Charlie", DaysOfWeek.WEDNESDAY, Gender.DIVERS);
        Person person4 = new Person(4, "David", DaysOfWeek.THURSDAY, Gender.MALE);
        Person person5 = new Person(5, "Emma", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person person6 = new Person(6, "Jack", DaysOfWeek.SATURDAY, Gender.MALE);
        Person person7 = new Person(7, "Grace", DaysOfWeek.SUNDAY, Gender.DIVERS);
        Person person8 = new Person(8, "Henry", DaysOfWeek.MONDAY, Gender.MALE);
        Person person9 = new Person(9, "Ivy", DaysOfWeek.TUESDAY, Gender.FEMALE);
        Person person0 = new Person(0, "Jack", DaysOfWeek.WEDNESDAY, Gender.MALE);


        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(person1.id(),person1);
        personMap.put(person2.id(),person2);
        personMap.put(person3.id(),person3);
        personMap.put(person4.id(),person4);
        personMap.put(person5.id(),person5);
        personMap.put(person6.id(),person6);
        personMap.put(person7.id(),person7);
        personMap.put(person8.id(),person8);
        personMap.put(person9.id(),person9);
        personMap.put(person0.id(),person0);

        PersonRepository personRepository = new PersonRepository(personMap);

        for (int i = 0; i < 50; i++) {
            System.out.println(personRepository.getPersonByName("Jack"));
        }
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
            System.out.println(personRepository.getAllPersonByFavoriteDay(day));
        }

//        Optional<Person> test1 = personRepository.getPersonByID(9);
//        Person test2 = personRepository.getPersonByID(1241231123).orElse(new Person(1241231123,"No.",DaysOfWeek.MONDAY, Gender.DIVERS));
        // Quantity++
        //
//        System.out.println(test1.get().name() + " " + test1.get().favoriteDay());
//        System.out.println(test2.name() + " " + test2.favoriteDay());
//
//        System.out.println(personRepository.getPersonByName("Jack").orElse(new Person(-1,"No such Person found.",DaysOfWeek.MONDAY, Gender.DIVERS)));
//        System.out.println(personRepository.getPersonByName("Kevin").orElse(new Person(-1,"No such Person found.",DaysOfWeek.MONDAY, Gender.DIVERS)));
//        System.out.println(personRepository.getPersonByName("Rachel").orElse(new Person(-1,"No such Person found.",DaysOfWeek.MONDAY, Gender.DIVERS)));
//        System.out.println(personRepository.countByGender(Gender.FEMALE));
//        System.out.println(personRepository.countByGender(Gender.MALE));
//        System.out.println(personRepository.countByGender(Gender.DIVERS));

//        System.out.println();
//        int id = 1241231123;
//        System.out.println(personRepository.getPersonByID(1241231123));
//        System.out.println(personRepository.getPersonByID(1));
    }
}