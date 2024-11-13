package com.addressbook.operations;

import com.addressbook.main.AddressBook;

import java.util.regex.Pattern;

public class CitySearch {
    String city;

  public void citySearch() {
      while (true) {
          System.out.println("enter the city");
          city = getCity("^[A-Za-z]+$", "give proper city");
          if (citySearching(city)) {
              AddressBook.arraylist.stream().filter(name -> name.getCity().equalsIgnoreCase(city)).forEach(name -> System.out.println (name.getFirstName() + " " + name.getLastName() + " " + name.getCity() + " " + name.getstate() + " " + name.getZip() +" "+ name.getphno()+ " " + name.getaddress()));
              break;
          } else {
              System.out.println("the city will not found");
          }
      }
  }




    public static String getCity(String regex,String message)
    {
        while(true)
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


    public boolean citySearching(String city)
    {
        boolean search = AddressBook.arraylist.stream().anyMatch(name -> name.getCity().equals(city));
        return search;
    }
}
