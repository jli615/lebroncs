package com.example.sping_portfolio.minilabs.arithmetic.SeperateAlgorithm;

import org.springframework.stereotype.Controller;

@Controller
public class arithmeticSequenceWhile extends arithmeticSequenceMain {
    public arithmeticSequenceWhile() {
        super();
    }
    public arithmeticSequenceWhile(int nth) {
        super(nth);
    }
    @Override
    protected void init() {
        //setup for recursion
        super.name = "Recursion";
        long limit = super.size;
        long[] f = new long[]{0, 1};
        initRecurse(limit,f);       // recursion is redirected
    }

    /*
    Recursive methods contains an escape, in this  "base condition" with a limit
    VERY IMPORTANT... recursion requires pre-decrement, post-decrement will not occur until unstacking
     */
    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;                                 //exit condition
        super.setData(f[0]);
        // observe this syntax and function, many think of recursion as another way to do iteration
        initRecurse(--limit, new long[]{f[1], f[0] + f[1]});
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[0] + 5};
        }
    }

    /*
    Class method "main" with purpose of testing FibRecurse
     */
    public static void main(String[] args) {
        arithmeticSequenceMain arith1 = new arithmeticSequenceWhile();  // "FibRecurse" is used as initializer for the "_Fibonacci fibonacci"  object
        arith1.print();
    }
}