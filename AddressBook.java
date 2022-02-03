package com.bridge.address.book.system;

import java.util.ArrayList;

public class AddressBook {

   private ArrayList<PersonContact> contacts;

    public ArrayList<PersonContact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<PersonContact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                '}';
    }
}