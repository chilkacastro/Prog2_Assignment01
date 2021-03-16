/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorestring;

import java.util.Scanner;

/**
 * Programming 2: Task 2
 * @author Chilka Castro
 */
public class ScoreString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = console.nextLine();
        
        System.out.printf("%-8s: %s\n", "String", str);
        System.out.printf("%-8s: %.2f\n", "Score", countStringScore(str));
    }
    
    /**
     * To count the score of string
     * @param str the string to count a score
     * @return the score of the string 
     */
    public static double countStringScore(String str) {
        double totalScore = 0;
        double finalScore = 0;
        int noPoint = 0;
        int digitPoint = 1;
        int letterPoint = 2;
        int symbolPoint = 3;
        
        if (str == null)                                             // null str
            return noPoint;
                
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c))
                totalScore += digitPoint;
            if (Character.isLetter(c))     
                totalScore += letterPoint;
            if (!Character.isDigit(c) && !Character.isLetter(c) && c != ' ')
                totalScore += symbolPoint;
            
            finalScore = totalScore / str.length();
        }
        return finalScore;                                          // empty str
    }
}
