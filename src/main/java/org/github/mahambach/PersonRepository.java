package org.github.mahambach;

import java.util.*;

public class PersonRepository {
    private Map<Integer, Person> personMap = new HashMap<>();

    public PersonRepository(Map<Integer, Person> personMap) {
        this.personMap = personMap;
    }

    public Optional<Person> getPersonByID(int id){
        return Optional.ofNullable(personMap.get(id));
    }
    public Map<Integer, Person> getPersonMap() {
        return personMap;
    }
    public int countByGender(Gender gender){
        int count = 0;
        for(Person person : personMap.values()){
            if(person.gender().equals(gender)) count++;
        }
        return count;
    }

    public Optional<Person> getPersonByName(String name){
        for(Person person : personMap.values()){
            if(person.name().equals(name)) return Optional.of(person);
        }
        return Optional.empty();
    }

    public List<Person> getAllPersonByFavoriteDay(DaysOfWeek favoriteDay){
        List<Person> result = new ArrayList<>();
        for(Person person : personMap.values()){
            if(person.favoriteDay().equals(favoriteDay)) result.add(person);
        }
        return result;
    }
    public void setPersonMap(Map<Integer, Person> personMap) {
        this.personMap = personMap;
    }
}
