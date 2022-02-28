package MethodOverloading;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank");
        bank.addBranch("poor");
        bank.addCustomer("poor","Rachel",50.55);
        bank.addCustomer("poor","Tim",50.55);
        bank.addCustomer("poor","Jake",30.44);

        bank.addCustomerTransaction("poor","Tate",40.10);
        bank.addCustomerTransaction("poor","Jake",12.33);
        bank.addCustomerTransaction("poor","Jake",11.11);
        bank.listCustomers("poor",true);





    }
}
