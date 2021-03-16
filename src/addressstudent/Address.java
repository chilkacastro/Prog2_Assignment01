package addressstudent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * An Address class
 * @author Chilka Castro
 */
public class Address {
    private String street;
    private String streetNum;
    private String city;
    private String zipCode;

    /**
     * Default constructor
     */
    public Address() {
        this.street = null;
        this.streetNum = null;
        this.city = null;
        this.zipCode = null;
    }
    
    /**
     * Constructor with all data members
     * @param street the street of the address
     * @param streetNum the street number of the address
     * @param city the city of the address
     * @param zipCode the zip code of the address
     */
    public Address(String streetNum, String street, String city, String zipCode) {
        this.street = street;
        this.streetNum = streetNum;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    /**
     * Copy constructor
     * @param address the address object to copy
     */
    public Address(Address address) {
        this.street = address.street;
        this.streetNum = address.streetNum;
        this.city = address.city;
        this.zipCode = address.zipCode;
    }
    
    /**
     * To convert a String to title-case
     * @param str the input String to convert
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
                str2 += str.substring(i, i + 1) + 
                        Character.toUpperCase(str.charAt(++i));
            if (i != 0 && c != ' ')
                str2 += str.charAt(i);
        }
        return str2;
    }

    /**
     * To compare if two address objects are the same or not
     * @param address the address object to compare with
     * @return True if the address objects are the same and False if not
     */
    public boolean equals(Address address) {
        return this.street.equals(address.street) && 
                this.streetNum.equals(address.streetNum) && 
                this.city.equals(address.city) && 
                this.zipCode.equals(address.zipCode);
    }
    
    /**
     * To print a string that represents an address
     * @return the string that represents an address
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %s, %s\n", "Street", streetNum, street);
        str += String.format("%-10s: %s\n", "City", city);
        str += String.format("%-10s: %s\n", "ZipCode", zipCode);

        return toTitleCase(str);
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = toTitleCase(street); 
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = toTitleCase(city);
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
