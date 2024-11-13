package com.addressbook.operations;

import com.addressbook.entity.Contact;
import com.addressbook.main.AddressBook;
import exception.InvalidNameException;

import java.util.regex.Pattern;

public class UpdateDetails {
    public  void updateDetails()
    {
        System.out.println("enter the index to update:");
        int index= AddressBook.scanner.nextInt();

        if (index < 1 || index > AddressBook.arraylist.size())
        {
            System.out.println("Invalid contact number.");
            return;
        }
        Contact contact= AddressBook.arraylist.get(index-1);
        System.out.println("enter the new id");
        String FirstName;
        while(true)
        {
            FirstName=getDetails("^[A-Z]+[a-z]+[A-Za-z]{3,10}$","give the proper first name");
            if(presentFirstName(FirstName))
            {
                System.out.println("this is present");
            }
            else
            {
                break;
            }
        }
        contact.setFirstName(FirstName);
        System.out.println("enter the new LastName");
        String LastName=getDetails("^[A-Z]+[a-z]+[A-Za-z]{3,10}$","please enter valid name");
        contact.setLastName(LastName);
        System.out.println("Enter the new city");
        String city=getDetails("^[A-Z]+[a-z]+[A-Za-z]{3,10}$","ente the correct city");
        contact.setCity(city);
        System.out.println("enter the state");
        String state=getDetails("^^[A-Z]+[a-z]+[A-Za-z]{3,10}$","enter the correct state");
        contact.setstate(state);
        System.out.println("enter the new phno");
        String phno=getDetails("^[0-9]{10}$","please enter valid mobile number");
        contact.setphno(phno);
        System.out.println("ente the zip code");
        String zip=getDetails("^[0-9]{6}$","enter the valid zip code");
        contact.setZip(zip);
        contact.setphno(phno);
        System.out.println("enter the new address");
        String address=getDetails("^[A-za-z0-9/s,.-/]+$","plese enter valid address");
        contact.setaddress(address);
    }
    public String getDetails(String regex,String message)
    {
        while(true){
            try {

                String input = AddressBook.scanner.next();
                if (Pattern.matches(regex, input)) {
                    return input;
                } else {
                    throw new InvalidNameException(message);
                }
            }catch (InvalidNameException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    public static boolean presentFirstName(String FirstName) {
        return AddressBook.arraylist.stream().anyMatch(name -> name.getFirstName().equals(FirstName));
    }
}
