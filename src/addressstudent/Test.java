package addressstudent;


import addressstudent.Student;
import addressstudent.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chilc
 */
public class Test {
    
    public static void main(String[] args) {
        Address a1 = new Address("7704", "rue verdier st leonard", "montreal", "h1s2h9");
          
        Student s1 = new Student("chilka", "castro", 22, a1);
        System.out.println(s1); } 

}
//        System.out.println(toTitleCase("title yoho bonks pineapplle kNiFe 0!towel ch!@#!ild"));
//    }
//    public static String toTitleCase(String str) {
//        str = str.toLowerCase();
//        String str2 = "";
//   
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (i == 0) 
//                str2 += Character.toUpperCase(str.charAt(i));
//            if (c == ' ')
//                str2 += str.substring(i, i + 1) + 
//                        Character.toUpperCase(str.charAt(++i));
//            if (i != 0 && c != ' ')
//                str2 += str.charAt(i);
//        }
//        return str2;
//    } 
    

