package com.company;

public class Citizen {
    String citizenship;
    int passportNumber;

    public Citizen(String citizenship, int pNum){
        this.passportNumber = pNum;
        this.citizenship = citizenship;
    }

    public void changeCitizenship(String U){
        citizenship = U;
    }

    public int printPNum(){
        return passportNumber;
    }
}
