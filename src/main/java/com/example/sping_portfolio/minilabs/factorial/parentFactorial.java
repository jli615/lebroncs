package com.example.sping_portfolio.minilabs.factorial;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.Instant;


public abstract class parentFactorial{
    int rotations;
    Duration timeElapsed;
    static boolean forr=false;
    static boolean stream=false;
    static boolean whilee=false;
    static boolean recurse=false;
    //ArrayList<Integer> art = new ArrayList<Integer>();
    //ArrayList<Integer> time = new ArrayList<Integer>();
    int x = 1;
    static int iter;
    //int z = 0;
    public abstract Integer factorial();
    //public abstract Duration arithmeticMethodtwo();
    public void print() {
        System.out.println("Factorial = " + x);
        //System.out.println("Process took " + timeElapsed);
    }
}