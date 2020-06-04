package com.test;

public class Solution {

    public int hammingDistance(int x, int y) {
      //  System.out.println("n1 "+Integer.toBinaryString(x));
        //System.out.println("n2 "+Integer.toBinaryString(y));
        int diff = x ^ y;
        //System.out.println("first "+Integer.toBinaryString(diff));
        int setBits = 0;

        while (diff > 0)
        {
            System.out.println("diff "+Integer.toBinaryString(diff)  +" "+diff);
            System.out.println("setBitts "+Integer.toBinaryString(setBits)+" "+setBits);
            setBits += diff & 1;
            diff >>= 1;
            System.out.println("================================");
        }

        System.out.println("before returning setBitts "+Integer.toBinaryString(setBits)+" "+setBits);
        return setBits;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.hammingDistance(1,4);
    }
}
