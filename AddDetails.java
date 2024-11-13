package com.addressbook.operations;

import com.addressbook.entity.Contact;
import com.addressbook.main.AddressBook;
import exception.InvalidNameException;

import java.util.regex.Pattern;
public class AddDetails {
    public  void addDetails()
    {
        System.out.println("enter FirstName:");
        String FirstName;
        while(true) {
            FirstName=getInputDetails("^[A-Z][a-z]+[A-za-z]{3,10}$","give the proper first name");
            if(isPresentFirstName(FirstName))
            {
                System.out.println("this is present");
            }
            else
            {
                break;
            }
        }

        System.out.println("enter LastnName:");
        String LastName=getInputDetails("^[A-Z][a-z]+[A-Za-z]{3,15}$","please enter only alphabetical letters");
        System.out.println("enter the city");
        String city=getInputDetails("^[A-Z][a-z]+[A-Za-z]{3,15}$","enter the correct city");
        System.out.println("enter the state");
        String state=getInputDetails("^[A-Z][a-z]+[A-Za-z]{3,15}$","enter the correct state");
        System.out.println("ente the zip code");
        String zip=getInputDetails("^[0-9]{6}$","enter the valid zip code");
        System.out.println("enter phone number");
        String phoneNumber=getInputDetails("^[0-9]{10}$","please enter valid number");
        System.out.println("enter the address");
        String address=getInputDetails("^[A-Za-z0-9/s,.-/]+$","please enter valid address");
        AddressBook.arraylist.add(new Contact(FirstName,LastName,city,state,zip,phoneNumber,address));
    }
    public String getInputDetails(String regex,String message)
    {
        while(true) {
            try {
                String input = AddressBook.scanner.next();
                if (Pattern.matches(regex, input)) {
                    return input;
                } else {
                    throw new InvalidNameException(message);
                }
            }catch(InvalidNameException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean isPresentFirstName(String FirstName) {
        return AddressBook.arraylist.stream().anyMatch(name ->name.getFirstName().equals(FirstName));
    }

}
