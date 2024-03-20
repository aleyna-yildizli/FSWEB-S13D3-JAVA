package org.example;

public class Person {
    String firstName;
    String lastName;
    int height;
    int weight;
    int age;
    boolean isMarried;


    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String firstName, String lastName, int age, int height, int weight, boolean isMarried) {
        this(firstName,lastName,age);
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
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


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age < 19;
    }

}



