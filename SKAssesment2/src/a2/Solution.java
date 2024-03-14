package a2;

import java.io.*;
import java.util.*;
import java.lang.Math;


public class Solution {
    public static int countWays(int n, int k) {
        // Write your code here

        int m = (int) Math.pow(10, 9) + 7;
         int c = k;

         for(int i = 1; i < n; i++){
             c = (c * (k - 1)) % m;
         }

        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int n = Integer.parseInt(scan.nextLine().trim());
        
        int k = Integer.parseInt(scan.nextLine().trim());
    
        int result = countWays(n, k);
    
        System.out.println(result);
    }
}