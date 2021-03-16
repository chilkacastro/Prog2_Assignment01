package addressstudent;


import addressstudent.Address;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * A Student class
 *
 * @author Chilka Castro
 */
public class Student {

    private String fname;
    private String lname;
    private int age;
    private Address address;
    private String email;

    /**
     * Default constructor
     */
    public Student() {
        this.fname = null;
        this.lname = null;
        this.age = 0;
        this.address = new Address();                                           // null address
        this.email = null;
    }

    /**
     * Constructor with two parameters
     *
     * @param fname the first name of the student
     * @param lname the last name of the student
     */
    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        this.age = 0;                         // or -1
        //this.address = null;                // not as good, you cannot call anything through the address, including the toString() method
        this.address = new Address();         // better  // creates a new piece of memory then the address DOES HAVE A MEMORY-> contain more memory than line 41  // every student have address  // no problem calling the toString of the other one
        generateEmail();
    }

    /**
     * Constructor with all parameters
     *
     * @param fname the first name of the student
     * @param lname the last name of the student
     * @param age the age of the student
     * @param address the address of the student
     */
    public Student(String fname, String lname, int age, Address address) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.address = address;
        generateEmail();
    }

    /**
     * Copy constructor
     *
     * @param student the student object to copy
     */
    public Student(Student student) {
        this.fname = student.fname;
        this.lname = student.lname;
        this.age = student.age;
        this.address = student.address;                     // shallow copy -- bad
        this.address = new Address(student.address);        // deep copy -- good
        this.email = student.email;
    }

    /**
     * To generate an email for a student
     */
    private void generateEmail() {
        Random rand = new Random();

        int bound = 10;
        String name = lname + fname.charAt(0);
        String randomDigits = String.format("%d%d%d%d", rand.nextInt(bound),
                rand.nextInt(bound), rand.nextInt(bound), rand.nextInt(bound));

        email = String.format("%s%s@vaniercollege.qc.ca", name.toLowerCase(),
                randomDigits);
    }

    /**
     * To convert a String too title-case
     *
     * @param str the input String
     * @return the converted String(title-case)
     */
    public static String toTitleCase(String str) {
        str = str.toLowerCase();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0)
                str2 += Character.toUpperCase(str.charAt(i));
            if (c == ' ')
                str2 += str.substring(i, i + 1)
                        + Character.toUpperCase(str.charAt(++i));
            if (i != 0 && c != ' ')
                str2 += str.charAt(i);
        }
        return str2;
    }

    /**
     * To compare if two student objects are the same or not
     *
     * @param student the student object to compare with
     * @return True if the student objects are the same and False if not
     */
    public boolean equals(Student student) {
        return this.fname.equals(student.fname)
                && this.lname.equals(student.lname)
                && this.age == student.age
                && this.address.equals(student.address)
                && this.email.equals(student.email);
    }

    /**
     * To print a String that represents a student
     *
     * @return the String that represents the student
     */
    @Override
    public String toString() {
        String str = "";

        str += String.format("%-10s: %s %s\n", "Name", fname, lname);
        str += String.format("%-10s: %d\n", "Age", age);
        str += String.format("%-10s: \n%s", "Address", address);                // add address to toString method of the address object of the address class -> no need to put .toString()  -> and if u use this.address = null;    -> code will crush
        str += String.format("%-10s: %s\n", "Email", email);

        return toTitleCase(str);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = toTitleCase(fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = toTitleCase(lname);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
