package com.example.sping_portfolio.minilabs.arithmeticTwo;
import java.util.Scanner;

public class arithmeticController
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("How many iterations");
    String iterations = input.nextLine();
    int y = Integer.parseInt(iterations);
    parentArithmetic.iter=y;
    parentArithmetic arith1 = new arithFor();
    parentArithmetic arith2 = new arithRecurse();
    parentArithmetic arith3 = new arithStream();
    parentArithmetic arith4 = new arithWhile();
    parentArithmetic.forr = false;
    parentArithmetic.recurse = true;
    if (parentArithmetic.forr == true)
    {
        arith1.arithmeticMethodone();
        arith1.arithmeticMethodtwo();
        arith1.print();

    }
    if (parentArithmetic.recurse == true)
    {
        arith2.arithmeticMethodone();
        arith2.print();
    }
    if (parentArithmetic.stream == true)
    {
        arith3.arithmeticMethodone();
        arith3.print();
    }
    if (parentArithmetic.whilee == true)
    {
        arith4.arithmeticMethodone();
        arith4.print();
    }
}
}
