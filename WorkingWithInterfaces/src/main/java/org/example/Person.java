package org.example;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.lastName.compareTo(o.lastName);
        if (result == 0){
            result = this.firstName.compareTo(o.firstName);
        }
        if (result == 0){
            result = Integer.compare(this.age, o.age);
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
