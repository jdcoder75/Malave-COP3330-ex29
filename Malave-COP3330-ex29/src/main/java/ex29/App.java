package ex29;

import java.util.Scanner;
import java.util.*;


import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static boolean checker(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }


    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while(input == 0)
        {
            System.out.println( "What is the rate of return?" );
            String inString = sc.nextLine();
            int a = Integer.parseInt(inString);

            if ( checker(inString)== true)
            {
                System.out.println( "Sorry. That's not a valid input." );
                input = 0;

            }
            else if (a == 0)
            {
                System.out.println( "Sorry. That's not a valid input." );
                input = 0;
            }
            else
            {
                input = a;
                int year = 72 / a;
                System.out.println( "It will take "+year+" years to double your initial investment." );
            }
        }

    }
}
