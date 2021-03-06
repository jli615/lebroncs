package com.example.sping_portfolio.minilabs.arithmetic.SeperateAlgorithm;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import com.example.sping_portfolio.minilabs.consoleUI.consoleMethods;
import lombok.Getter;

/*
 _Fibonacci class contains generalized logic to capture and analyze a Fibonacci sequence.
 _Fibonacci is an "abstract" class, meaning it can't be initialized directly
 The "_" in name is used to push this "Parent" Class to top of package file listing.
 */
@Getter  // this will enable standard Getters on attributes in Class in form "getName" where "name" is attribute
public abstract class arithmeticSequenceMain {
    int size;
    String name;
    int hashID;
    Duration timeElapsed;
    ArrayList<Long> list;
    HashMap<Integer, Object> hash;


    public arithmeticSequenceMain() {
        this( 20);
    }

    public arithmeticSequenceMain(int nth) {
        this.size = nth;
        this.list = new ArrayList<>();
        this.hashID = 0;
        this.hash = new HashMap<>();
        //initialize fibonacci and time algorithm
        Instant start = Instant.now();  // time capture -- start
        this.init();
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    /*
     Method is abstract as init() requires extender to define their own Fibonacci algorithm
     Method is protected as it is only authorized to someone who extends the class
     */
    protected abstract void init();

    /*
     Number is added to Fibonacci sequence, current state of "list" is added to hash for hashID "num"
     */
    public void setData(long num) {
        list.add(num);
        hash.put(this.hashID++, list.clone());
    }

    /*
     Custom Getter for timeElapsed in init process, timeElapsed.getNano() is part of Duration class
     */
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    /*
     Custom Getter to return last element in Fibonacci sequence
     */
    public long getNth() {
        return list.get(size - 1);
    }

    /*
     Custom Getter to return last Fibonacci sequence in HashMap
     */
    public Object getNthSeq(int i) {
        return hash.get(i);
    }

    /*
     Console/Terminal supported print method
     */
    public void print() {
        consoleMethods.println("Init method = " + this.name);
        consoleMethods.println("Init time = " + this.getTimeElapsed());
        consoleMethods.println("Arithmetic Number " + this.size + " = " + this.getNth());
        consoleMethods.println("Arithmetic List = " + this.getList());
        consoleMethods.println("Arithmetic Hashmap = " + this.getHash());
        for (int i=0 ; i<this.size; i++ ) {
            System.out.println("Fibonacci Sequence " + (i+1) + " = " + this.getNthSeq(i));
        }
    }

    /*
    Tester class method.  This calls "main" class of each of the extended classes in the package
     */
    public static void main(String[] args) {
        arithmeticSequenceFor.main(null);
        arithmeticSequenceRecursion.main(null);
        arithmeticSequenceStream.main(null);
        arithmeticSequenceWhile.main(null);
    }
}
