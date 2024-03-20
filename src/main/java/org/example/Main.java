package org.example;

public class Main {
    public static void main(String[] args) {

/*        Person person1 = new Person("John", "Doe", 17);

        System.out.println("Person 1:");
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Teen: " + person1.isTeen());*/

        Person person1 = new Person("Aleyna", "Yıldızlı", 12);
        if (person1.isTeen()) {
            System.out.println(person1.getFirstName() + " " + person1.getLastName() + " is " + person1.getAge() + " year(s) old. So it is a teen.");
        } else {
            System.out.println(person1.getFirstName() + " " + person1.getLastName() + " is " + person1.getAge() + " year(s) old. So it is not a teen.");
        }


        System.out.println("***************************");

/*        Person person2 = new Person("Jane", "Smith", 25, 170, 65, true);

        System.out.println("Person 2:");
        System.out.println("First Name: " + person2.getFirstName());
        System.out.println("Last Name: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Height: " + person2.getHeight());
        System.out.println("Weight: " + person2.getWeight());
        System.out.println("Married: " + person2.isMarried());
        System.out.println("Teen: " + person2.isTeen());*/

        Person person2 = new Person("Jane", "Smith", 32, 172, 52, true);

        System.out.println("Hi I'm "+person2.getFirstName()+" " + person2.getLastName()+",");
        System.out.println("I'm "+ person2.getAge() +" years old. My height is "+ person2.getHeight()+ " and my weight is "+ person2.getWeight() + " and I'm " + (person2.isMarried() ? "married." : "not married."));


        System.out.println("**************************");

        Wall wall = new Wall(10, 20);
        wall.setHeight(3.0);

        if (wall.getHeight() > 0) {
            System.out.println("Area of the wall: " + wall.getArea() + " square units.");
        } else {
            System.out.println("Invalid height. Area cannot be calculated.");
        }


/*        System.out.println("area= " + wall.getArea());

        wall.setHeight(3.0);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());*/
    }

}
