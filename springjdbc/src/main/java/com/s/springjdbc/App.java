package com.s.springjdbc;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
//        Load the context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
//    	Get a reference to the bean
    	JdbcDoa doa = context.getBean("doa", JdbcDoa.class);
    	
    	
//    	Call the method
    	doa.connectToDb();
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	do
        {
        	System.out.println("1.add account");
        	System.out.println("2.check balance");
        	System.out.println("3.deposit");
        	System.out.println("4.withdraw");
        	System.out.println("5.fund transfer");
        	System.out.println("6.print transactions");
        	System.out.println("7.exit");	
        	System.out.println("enter your choice");
        	choice =sc.nextInt();
        	switch(choice)
        	{
        	case 1: System.out.println("Add account");
        		    Scanner t=new Scanner(System.in);
    	            System.out.println("\nNAME:");
    	            String NAME = t.nextLine();
        		    System.out.println("\nID:");
    	            int ID = t.nextInt();
    	            System.out.println("\nBALANCE:");
    	            Float BALANCE =t.nextFloat();
    	            doa.AddAccount(ID,NAME,BALANCE);
    	   	break;
        	case 2: System.out.println("enter your id");
        		    Scanner o=new Scanner(System.in);;
        		    int ID1 = o.nextInt();
                    doa.Checkbal(ID1);

        	break;
        	case 3: System.out.println("enter your id");
 		   			Scanner a=new Scanner(System.in);;
 		   			int ID2 = a.nextInt();
 		   			doa.Deposit(ID2);
        	break;
        	case 4: System.out.println("enter your id");
	   			    Scanner s=new Scanner(System.in);
	   			    int ID3 = s.nextInt();
	   			    doa.Withdraw(ID3);
    	
            break;
        	
        	case 5: System.out.println("enter your id");
        			Scanner b =new Scanner (System.in);
        			int ID5=b.nextInt();
        			System.out.println("enter id to be transfered to");
        			int ID6=b.nextInt();
        			doa.Transfer(ID5,ID6);
        			
                	     
        	break;
        	case 6: System.out.println("enter your id");
					Scanner c =new Scanner (System.in);
					int ID7=c.nextInt();
					doa.transactionview(ID7);
      
        		
        	case 7:break;
        	default:
        	}
        }while(choice!=7);

    	
    	
    	
    }

	
}