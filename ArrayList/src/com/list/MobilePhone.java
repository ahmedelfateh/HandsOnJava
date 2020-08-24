package com.list;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    public String addContact(String name, String number) {
        int index = findContact(name);
        if (index < 0) {
            Contact newContact = new Contact(name, number);
            myContacts.add(newContact);
            return makeContactDetails(newContact);
        }

        return null;
    }

    public String modifyContact(String name, String newName, String newNumber) {
        int index = findContact(name);

        if (index >= 0) {

            if (newName == null || newName.length() == 0) {
                newName = findContact(index).getName();
            }

            if (newNumber == null || newNumber.length() == 0) {
                newNumber = findContact(index).getNumber();
            }
            findContact(index);
            myContacts.set(index, Contact.createContact(newName, newNumber));
            return makeContactDetails(findContact(index));
        }

        return null;
    }

    public String removeContact(String name) {
        int index = findContact(name);

        if (index >= 0) {
            myContacts.remove(index);
            return "Contact with name '" + findContact(index).getName() + "' deleted";
        }

        return null;
    }

    public boolean checkForContact(String name) {
        return (findContact(name) >= 0);
    }

    private int findContact(String name) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = findContact(i);

            if (contact.getName().trim().toLowerCase().equals(name.trim().toLowerCase())) {
                return i;
            }

        }

        return -1;
    }

    private Contact findContact(int index) {
        return myContacts.get(index);
    }

    public String getContactDetails(String name) {
        int index = findContact(name);

        if (index < 0) {
            return null;
        }

        return makeContactDetails(findContact(index));
    }

    public String getAllContacts() {
        StringBuilder contactListString = new StringBuilder();

        if (myContacts.size() > 0) {

            for (int i = 0; i < myContacts.size(); i++) {
                Contact contact = findContact(i);
                contactListString.append(makeContactDetails(contact)).append("\n");
            }

            return contactListString.toString().trim();
        }

        return null;
    }

    private String makeContactDetails(Contact contact) {

        if (contact != null) {
            return "name: " + contact.getName() + ", phone Number: " + contact.getNumber();
        }

        return null;
    }

}