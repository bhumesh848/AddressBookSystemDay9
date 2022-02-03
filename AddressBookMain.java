package com.bridge.address.book.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonContact contact = new PersonContact();
        System.out.println("Welcome to Address Book Program");
        System.out.println("Enter first Name");
        String firstName = sc.nextLine();
        contact.setFirstName(firstName);

        System.out.println("Enter Last Name");
        String lastname = sc.nextLine();
        contact.setLastName(lastname);

        System.out.println("Enter the Address");
        String address = sc.nextLine();
        contact.setAddress(address);

        System.out.println("Enter City");
        String city = sc.nextLine();
        contact.setCity(city);

        System.out.println("Enter State");
        String state = sc.nextLine();
        contact.setState(state);

        System.out.println("Enter Zip");
        int zip = sc.nextInt();
        contact.setZip(zip);

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email ID");
        String emailID = sc.next();
        contact.setEmailID(emailID);

        System.out.println(contact);

        AddressBook addressBook = new AddressBook();
        ArrayList<PersonContact> contacts = new ArrayList<>();
        contacts.add(contact);
        System.out.println(Arrays.toString(contacts.toArray()));

    }
}

