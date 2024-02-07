package org.github.mahambach;

public record Person(
        int id,
        String name,
        DaysOfWeek favoriteDay,
        Gender gender
) {
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteDay=" + favoriteDay +
                ", gender=" + gender +
                '}';
    }
}

