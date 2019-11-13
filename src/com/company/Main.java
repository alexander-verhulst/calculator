package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator first = new Calculator();
        System.out.println(first.divide(8,0)); //Outputs infinity, arithmetic exception

    }
}
