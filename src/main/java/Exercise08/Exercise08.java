/*
 *  UCF COP3330 Fall 2021 Exercise 8 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise08;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();

        System.out.println("How many pizzas do you have?");
        Scanner sc1 = new Scanner(System.in);
        int pizzas = sc1.nextInt();

        System.out.println("How many slices per pizza?");
        Scanner sc2 = new Scanner(System.in);
        int slices = sc2.nextInt();

        int totalSlices = pizzas*slices;
        int slicesPer = totalSlices/people;
        int leftOver = totalSlices%people;

        System.out.println(people+" people with "+pizzas+" pizzas ("+totalSlices+" slices)");
        System.out.println("Each person gets "+slicesPer+" pieces of pizza.");
        System.out.println("there are "+leftOver+" leftover pieces.");

    }

}
