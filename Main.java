package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Hero Spider = new Hero("Peter", 26, "running and jumping.");
    System.out.println("Hi I am " + Spider.getName() + ". " + "I am " + Spider.getAge() +
            ". My Super Power is " + Spider.getPower());


        Citizen c1 = new Citizen("Armenian", 23415630);
        System.out.println("I am " + c1.citizenship + ", my passport number is " + c1.printPNum());
        c1.changeCitizenship("American");
        System.out.println("I got GreenCard");
        System.out.println("Now I am " + c1.citizenship);

        car car1 = new car(280, 680.3, false);
        car1.printVars();
        car1.setMaxSpeed(330);
        System.out.println("New updated speed. YAY!!! ");
        car1.printVars();

        System.out.println(fact.Factorial(4));
    }


}
