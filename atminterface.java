import java.util.Scanner;
class atminterface{
    int account_balance=10000;
    public atminterface(){
    System.out.println("Enter a number from 1 to 3 for choice");
     System.out.println("withdraw balance");
      System.out.println("deposit balance");
       System.out.println("Check balance");
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       if(choice==1){
        withdraw();
       }
       else if(choice==2){
        deposit();
    }
    else if(choice==3){
        check_balance();
    }
    else{
        System.out.println("Invalid choice");
    }
}
public void withdraw(){
 System.out.println("Enter amount to be withdraw");
 Scanner sc = new Scanner(System.in);
 float amount = sc.nextFloat();
 if(amount>account_balance){
    System.out.println("money cannot withdraw because insufficient balance");
 }  
 else{
    account_balance-=amount;
    System.out.println("Money withdraw successfully");
    check_balance();
 }
}
public void deposit(){
     System.out.println("Enter amount to be deposit");
     Scanner sc = new Scanner(System.in);
     float amount = sc.nextFloat();
     account_balance+=amount;
     System.out.println("Money deposited successfully");
     check_balance();
    }
    public void check_balance(){
        System.out.println("account balance = "+account_balance);

    }
     public static void main(String[] args) {
    atminterface a=new atminterface();
}
}