package com.java;

import java.util.Random;

public class rollDie
{
    public static void main(String args[])
    {

        for(int i= 0;i<6;i++)

        for(int i= 0;i<10;i++)

        {
            Random r = new Random();
            int result = r.nextInt(6) + 1;
            System.out.println("You Rolled Die : " + result);
        }
    }
}
