package org.learning.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student james = new Student("James",21,"London");
        System.out.println(james.getName());
        System.out.println(james.getAge());
        System.out.println(james.getAddress());
        //update new name, age and address
        james.setName("Mr James");
        james.setAge(22);
        james.setAddress("London Euston");
        System.out.println(james.getName());
        System.out.println(james.getAge());
        System.out.println(james.getAddress());
    }
}
