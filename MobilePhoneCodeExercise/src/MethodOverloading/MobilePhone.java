package MethodOverloading;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            return false;
        }
        myContacts.add(contact);
        return true;


    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position >= 0) {
            this.myContacts.set(position, newContact);
            return true;
        }
        return false;


        }


    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position<0){
            return false;
        }
        this.myContacts.remove(position);
        return true;

    }
    private int findContact(Contact contact){
        for(int i = 0;i<this.myContacts.size();i++){
            if(myContacts.get(i).getName().equals(contact.getName())){
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name){
        for(int i = 0; i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }

        }
        return -1;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact list:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }

    }

}
