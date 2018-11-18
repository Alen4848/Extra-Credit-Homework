package com.company;

public class Hero {
    String name;
    int age;
    String power;

    public Hero(String name, int age, String power){
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getPower(){
        return power;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


/*
    public Dogs(String name, int age, Boolean hungry){
        this.name = name;
        this.age = age;
        this.hungry = hungry;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void checkIfHungry(){
        if (hungry == true){
            System.out.println("Give me food");
        } else {
            System.out.println("I am not hungry");
        }
    }

    public void giveFood(){
        if (hungry == true){
            hungry = false;
            System.out.println("Thanks, now I am not hungry!!");
        } else {
            System.out.println("Now I am not hungry, I'll eat it later");
        }
    }
    */
}
