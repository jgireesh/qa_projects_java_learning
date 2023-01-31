package org.learning.encapsulation;

public class Student {

    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return this.address;
    }

    public static void main(String[] args) {
        Student obj = new Student("gireesh",40,"MK");
        System.out.println(obj.getAddress());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        obj.setAddress("London");
        obj.setAge(39);
        obj.setName("Jeera");
        System.out.println(obj.getAddress());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }

}
