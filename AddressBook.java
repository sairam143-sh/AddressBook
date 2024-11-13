package com.addressbook.main;

import com.addressbook.entity.Contact;
import com.addressbook.operations.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<Contact> arraylist=new ArrayList<>();
    public static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
       ReadDetails read=new ReadDetails();
       AddDetails add=new AddDetails();
       UpdateDetails update=new UpdateDetails();
       DeleteDetails delete=new DeleteDetails();
       CitySearch citysearch=new CitySearch();
       CountPersons countpersons=new CountPersons();
       SortedPersonNames sortedpersons=new SortedPersonNames();
       SortedCity sortedcity=new SortedCity();
        while(true)
        {
            System.out.println("1.adddetails");
            System.out.println("2.readderails");
            System.out.println("3.updatedetails");
            System.out.println("4.deletedetails");
            System.out.println("5.city search");
            System.out.println("6.count the persons with same state");
            System.out.println("7.sorted by firstName");
            System.out.println("8.sorted by city name");
            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    add.addDetails();
                } else if (choice == 2) {
                    read.readDetails();
                } else if (choice == 3) {
                    update.updateDetails();
                } else if (choice == 4) {
                    delete.deleteDetails();
                } else if (choice == 5) {
                    citysearch.citySearch();
                } else if (choice == 6) {
                    countpersons.personsCount();
                } else if (choice == 7) {
                    sortedpersons.personsSorted();
                } else if (choice == 8) {
                    sortedcity.citySorted();
                } else {
                    System.out.println("enter the valid number");
                }
            }catch(Exception e)
            {
                System.out.println("An error occured "+e );
                scanner.nextLine();
            }

        }
    }
}
