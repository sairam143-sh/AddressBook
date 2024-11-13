package com.addressbook.operations;

import com.addressbook.main.AddressBook;

public class ReadDetails {
    public  void readDetails()
    {
        System.out.println("\nContacts:");
        for (int i = 0; i < AddressBook.arraylist.size(); i++) {
            System.out.println((i + 1) + "  " + AddressBook.arraylist.get(i));
        }
    }
}
