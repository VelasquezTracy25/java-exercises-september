package com.tracyvelasquezsite;

import org.w3c.dom.ls.LSOutput;

public class Strings {
    public static void main(String[] args) {

// "new String() is not necessary
        String message1 = new String("This is a new string.");

//String literal like below is preferred
        String message2 = "This a new string.";


//will both work but message2 is cleaner
        System.out.println(message1);
        System.out.println(message2);

//.indexOf()
        System.out.println(message1.indexOf('e')); //returns 11
        System.out.println(message1.indexOf('b')); //returns -1 (false)

// .replace()
        System.out.println(message1.replace(".", "!")); //prints a copy of string one that says"This is a new string!"
        System.out.println(message1); //will still print out original message "This is a new string."

//.trim() -- trims whitespace from beginning and end of the string
        String message3 = "   Hello World!   ";
        System.out.println(message3.trim());


    }


}
