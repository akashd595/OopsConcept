package com.bridgelabz.oops_concept;
import java.util.*;

class Mobile {
    private String mobile_no;

    public Mobile(String mobile_no) {
        this.mobile_no = mobile_no;
    }
    public Mobile(){}

    public String getMobileNo() {
        return mobile_no;
    }
    public void setMobileNo(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "mobile_no='" + mobile_no ;
    }
}
class Person {
    private String name;
    ArrayList<Mobile> numbers;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Mobile> getNumbers() {
//        for(int i=0;i<numbers.size();i++){
//            System.out.println(numbers.get(i));
//        }
        return numbers;
    }
    public void setNumbers(ArrayList<Mobile> numbers) {
        this.numbers = numbers;
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Vivek Kumar Singh");

        Mobile number1 = new Mobile("9910162958");
        Mobile number2 = new Mobile("6295899101");

        ArrayList<Mobile> numberList = new ArrayList<>();
        numberList.add(number1);
        numberList.add(number2);
        System.out.println(numberList+" are mobile numbers of the person "+ person.getName());
    }
}