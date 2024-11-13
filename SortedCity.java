package com.addressbook.operations;

import com.addressbook.main.AddressBook;

public class SortedCity {
    public void citySorted()
    {
        AddressBook.arraylist.stream().sorted((ncity, mcity)->ncity.getCity().compareTo(mcity.getCity())).forEach(name-> System.out.println(name.getFirstName()+" "+name.getLastName()+" "+name.getCity()+" "+name.getstate()+" "+name.getZip()+" "+name.getphno()+" "+name.getaddress()));
    }
}
