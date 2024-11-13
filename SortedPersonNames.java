package com.addressbook.operations;

import com.addressbook.main.AddressBook;

public class SortedPersonNames {
    public void personsSorted()
    {
        AddressBook.arraylist.stream().sorted((sortedn, sortedm)->sortedn.getFirstName().compareTo(sortedm.getFirstName())).forEach(name-> System.out.println(name.getFirstName()+" "+name.getLastName()+" "+name.getCity()+" "+name.getstate()+" "+name.getZip()+" "+name.getphno()+" "+name.getaddress()));
    }
}
