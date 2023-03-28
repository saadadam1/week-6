//1. ATM Simulator: Create a class called "Account" that represents a bank account. 
//The class should have properties such as account number, balance, and account holder name, and methods such as deposit, 
//withdraw and check balance. Create another class called "ATMSimulator" 
//that represents an ATM machine. The class should have a list of accounts,
//and methods such as addAccount, removeAccount, and transact.


import java.util.Scanner;
class Account {
  int AccNo;
  int Bal;
  int arLen=2;
  String AccHolName;

  Account Ar[]= new Account[2];
      Scanner sc=new Scanner(System.in);


  
  void deposit(){

      
    System.out.println("Enter the balance");
    Bal=sc.nextInt();

    System.out.println("Enter amount to deposit");
    int dep=sc.nextInt();

    Bal=Bal+dep;

    checkBalance();
  }
  void withdraw(){

    System.out.println("Enter amount to withdraw");
    int wDraw=sc.nextInt();

    Bal=Bal-wDraw;
    checkBalance();
    
    }
  void checkBalance(){
   System.out.println("The balance for your current account is "+Bal);
    
    }
  }
class AtmSimulator extends Account{
  int arLen=2;
  //Account Ar[]= new Account[2];
    Scanner sc=new Scanner(System.in);
  
    void addAcc(){
      for(int i=0;i<Ar.length;i++){
         Ar[i]=new Account();
      
        System.out.println("enter account number");
        Ar[i].AccNo=sc.nextInt();

        sc.nextLine();
         System.out.println("enter account holder name");
        Ar[i].AccHolName=sc.nextLine();
         System.out.println("Acc balance");
        Ar[i].Bal=sc.nextInt();
        
        
        }
      for(int i=0;i<Ar.length;i++){
        System.out.println((i+1)+". "+Ar[i].AccNo+" "+Ar[i].AccHolName+" "+Ar[i].Bal);
        
      }
    }


void RemoveAcc(){
  
  int loc=-1;
     for(int i=0;i<=arLen;i++){
       System.out.println("enter AccNo to delete");
       int DNo=sc.nextInt();
       if(DNo==Ar[i].AccNo){
         loc=i;        
       }
       break;
     }
  if(loc>=0){
         for(int i=0;i<=arLen;i++){

         Ar[i].AccNo=Ar[i+1].AccNo;
         Ar[i].AccHolName=Ar[i+1].AccHolName;
         Ar[i].Bal=Ar[i+1].Bal;
         }
         arLen--;    
      }      
       else{
        System.out.println("Account not found");              
       }
  for(int i=0;i<Ar.length;i++){
        System.out.println((i+1)+". "+Ar[i].AccNo+" "+Ar[i].AccHolName+" "+Ar[i].Bal);
        break;
      }
       }
  void transaction(){
  
  for(int i=0;i<arLen;i++){
    System.out.println("Enter the account Number for transaction");
    int acct=sc.nextInt();
    if(acct==Ar[i].AccNo){
      deposit();
      //withdraw();
      break;
    }
    else{
      System.out.println("Account not found");
    }
  }
}
}







class Atm{
  public static void main(String args[]){
    AtmSimulator as=new AtmSimulator();
    Account a=new Account();
    as.addAcc();
    as.transaction();
    
    //as.RemoveAcc();
  }
  
}