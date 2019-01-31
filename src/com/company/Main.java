package com.company;

public class Main {

    public static void main(String[] args) {
        multNumber(102);
    }
    public static void multNumber(int a){ //True if number is multiple 3
            if (a % 3 !=0){
                System.out.println("False");
            }
            else {
                System.out.println("True");
            }
        }
}
