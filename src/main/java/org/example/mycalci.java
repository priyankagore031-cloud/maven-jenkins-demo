package org.example;

public class mycalci {

    int sum (int a, int b  ){
        return a+b;
    }

    int diff (int a, int b  ){
        return a-b;
    }

public static void main(String[] args){
    mycalci calci = new mycalci();
    System.out.println("sum is:" +calci.sum (10,20));
    System.out.println("diff is:" +calci.diff (10,5));
}
}