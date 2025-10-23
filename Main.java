import java.util.*;


public class Main {
 
public static <balance> void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    int opt;
    int deposit=0;
    int withdraw=0;
    int balance=0;
   


             System.out.println("========================");
             System.out.println("=    Choose the Menu   =");
             System.out.println("========================");

        do{
            
             System.out.println("1, balance");
             System.out.println("2, deposit");
             System.out.println("3, withdraw");
             System.out.println("4, exit");
             
             System.out.println("Input the number");
             
             opt=input.nextInt();
            
            

             
        switch (opt) {
            case 1:
                System.out.println("Your Balance is :\n"+balance);
                
                break;
            case 2: 
                System.out.println("Please input your Amount to deposit?\n");
                 deposit=input.nextInt();
            if (deposit >0) {
                balance = balance + deposit;
                System.out.println("Your Deposit amount is:" + deposit);
            }
                else{
                    System.out.println("Invalid amount!!! error");
                }
                break;

            case 3:
                System.out.println("Please input your amount to withdraw?\n");
                withdraw = input.nextInt();
            if (withdraw>0) {
                balance = balance - withdraw;
                System.out.println("Your withdraw amount is: \n" + withdraw);
            }
             else{
                    System.out.println("Invalid amount!!! error"+"\n1");
                }
                break;

            case 4:
                System.out.println("Exit \n");
                System.out.println("Please Come again!");


                break;


            default:
            System.out.println("Thank you! Please try again!");
               break;
        }
    }
        while (opt!=4); 
            
        input.close();

    
    
}
}



    

 

