package com.addressbook.operations;

import com.addressbook.main.AddressBook;

import java.util.regex.Pattern;

public class CountPersons {
    String city;
    public void personsCount()
    {
        while (true) {
            System.out.println("enter the city");
            city = getCity("^[A-Za-z]+$", "give proper city");
            if (citySearch(city)) {
                long count = AddressBook.arraylist.stream().filter(name -> name.getCity().equalsIgnoreCase(city)).count();
                System.out.println(count);
                break;
            } else {
                System.out.println("the city will not found");
            }
        }
    }

    public static String getCity(String regex,String message)
    {
        while(true  )
        {
            String input=AddressBook.scanner.next();
            if(Pattern.matches(regex,input))
            {
                return input;
            }
            else {
                System.out.println(message);
            }
        }
    }


    public boolean citySearch(String city)
    {
        boolean count = AddressBook.arraylist.stream().anyMatch(cityname ->cityname.getCity().equals(city));
        return count;
    }
}

