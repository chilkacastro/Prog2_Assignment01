/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

import java.util.Scanner;

/**
 * Programming 2: Task 1
 * @author Chilka Castro
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = console.nextInt();

        System.out.printf("%-10s: %d\n", "Reversed Number", reverseNum(num));
    }
    
    /** 
     * To reverse an integer number
     * @param num the number to reverse
     * @return the reversed number
     */
    public static int reverseNum(int num) {
        int num2 = 0;
        
        while (num != 0) {                   
            int lastDigit = num % 10;           // extract last digit of number
            num2 = num2 * 10 + lastDigit;       // * then + so no 0 infront
            num /= 10;                          // remove extracted last digit
        }
        return num2;
    }
}
