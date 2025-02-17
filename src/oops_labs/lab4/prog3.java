package src.oops_labs.lab4;
//Define a class to represent a Bank account. Include the following members.
//Data members:
//a. Name of the depositor
//b. Account number.
//c. Type of account.
//d. Balance amount in the account.
//e. Rate of interest (static data)
//Provide a default constructor and parameterized constructor to this class. Also
//provide Methods:
//a. To deposit amount.
//b. To withdraw amount after checking for minimum balance.
//c.To display all the details of an account holder.
//d.Display rate of interest (a static method)
//Illustrate all the constructors as well as all the methods by defining objects.
class Bank{
    String name_of_depositor,type_of_account;
    int account_number;
    static double rate_of_interest=0.8;
    double bank_balance;
    double min_balace = 1000.00;

    //default constructor
    Bank(){
        name_of_depositor = "Default name";
        type_of_account = "Savings account";
        account_number = 0000000;
        rate_of_interest = 0.10;
        bank_balance = 0;
    }

    //parameterized constructor
    Bank(String name_of_depositor,String type_of_account, int account_number, double bank_balance){
        this.name_of_depositor =name_of_depositor;
        this.type_of_account=type_of_account;
        this.account_number=account_number;
        this.bank_balance = bank_balance;
    }

    void deposit(double in_money){
        bank_balance+=in_money;
        System.out.println("money has been added!!");
    }
    void withdraw(double out_money){
        double max_withrawl=bank_balance-min_balace;
        if(out_money<max_withrawl){
            bank_balance-=out_money;
            System.out.println("money has been withdrawn!!");
        }
        else{
            System.out.println("not enough money :<");
        }
    }
    void display(){
        System.out.println("-----------------------");
        System.out.printf("name:- %s\n",name_of_depositor);
        System.out.printf("type:- %s\n",type_of_account);
        System.out.printf("account number:- %d\n",account_number);
        System.out.printf("bank balance:- %f\n",bank_balance);
        System.out.println("-----------------------");
    }
    static void display_rate_of_interest(){
        System.out.println("Rate of interest:- "+Bank.rate_of_interest);
    }
}
public class prog3 {
    public static void main(String[] args){
        //default
        Bank obj1 = new Bank();
        //parameterised
        Bank obj2 = new Bank("Rishi","Student",245811482,3000);

        obj1.display();
        obj1.deposit(100000);
        obj1.display();

        obj2.display();
        obj2.deposit(1500);
        obj2.display();
        obj2.withdraw(900);
        obj2.display();

    }
}
