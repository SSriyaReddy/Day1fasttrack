package com.day1;

import java.util.Scanner;

public class program9 {
public static void main(String args[])  
{   
    System.out.println("Enter the value of x and y");  
    Scanner sc = new Scanner(System.in);  
    /*Define variables*/  
    int x = sc.nextInt();  
    int y = sc.nextInt();  
    System.out.println("before swapping numbers: "+x +" "+ y);  
   /*Swapping*/  
    x = x + y;   
    y = x - y;   
    x = x - y;   
    System.out.println("After swapping: "+x +"  " + y);   
}   
}  

