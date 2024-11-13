package com.addressbook.operations;

import com.addressbook.main.AddressBook;

public class DeleteDetails {
    public  void deleteDetails()
    {
        int index= AddressBook.scanner.nextInt();
        if (index < 1 || index > AddressBook.arraylist.size()) {
            System.out.println("Invalid contact number.");
            return;
        }
        AddressBook.arraylist.remove(index-1);

    }

}
