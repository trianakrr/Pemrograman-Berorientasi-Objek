package com.pbo;

public class Modul_Recursion {
    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int a){
        if (a > 0 ){
            return a + sum(a - 1);
        }else{
            return 0;
        }
    }
}
