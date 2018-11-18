package com.company;

public class fact {
    public static int Factorial(int x){
        int result;
        if(x == 0 || x==1)
            return 1;

        result = Factorial(x-1) * x;
        return result;
    }
}
