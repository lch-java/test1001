package com.map;

import java.util.Comparator;

public class Person  {
    int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person[" +
                "id=" + id +
                ']';
    }


}

class PersonCompartor implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.id - o2.id;
    }
}
