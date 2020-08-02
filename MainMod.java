import java.lang.reflect.Array;
import java.util.Scanner;

public class MainMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    char ch;
	    int hrs, cpus;
	    float price = 0; 
	    float cost = 0;

	    Scanner sc=new Scanner(System.in);

	    //Show menu to user
	    System.out.print("CPU ALLOCATION PROGRAM: \n" +
	    		"\t Region \t Server-CPU -> Cost (Available)\n" +
	    		"\t --------------------------------------------- \n" +
	    		"\t A) ASIA \t LARGE-1 -> 0.11 \t XLARGE-2 -> 0.20 \t 4LARGE-8 -> 0.67 \t 8LARGE-16 -> 1.18\n"+
	    		"\t B) US-EAST \t LARGE-1 -> 0.12 \t XLARGE-2 -> 0.23 \t 2LARGE-4 -> 0.45 \t 4LARGE-8 -> 0.774 \t 8LARGE-16 -> 1.4 \t 10LARGE-32 -> 1.4\n" +
	    		"\t C) US-WEST \t LARGE-1 -> 0.14 \t 2LARGE-4 -> 0.4113 \t 4LARGE-8 -> 0.89 \t 8LARGE-16 -> 1.3 \t 10large-32 -> 2.97\n");


	    //Infinite loop until user is willing to choose exit menu
	    int i=0;
	    for(; ; ) {
	    System.out.print("\n Please choose any below option : \n\t A) Specify no. of CPU for hours \tB) Specify price for hours \tC) Exit");
	    ch=sc.next().charAt(0);
	    
	    //Function call
	    GetInput(ch);
	    
	    }

	}

	private static void GetCost(float c, float h, float p, String reg) {
		// TODO Auto-generated method stub
		
	//    String reg;
	    char ch;
	    int hrs, cpus;
	    float price = 0; 
	    float cost = 0,j=0;
	    	    
	    System.out.println("values from func2");
	    
	    //If user chose option B
	    if (p!=0)
	    {
	    	for(j=0;j<=p;j++)
	    	{
	    		j*=0.14*h;
	    	}
	    	System.out.print("Total Cost :- " +p+ "\t No. of LARGE CPU :-"+j+ "\t Hours consumed :-"+h);
	    } 	   
	    //If user chose option A
	    else
	    {
	    switch(reg){
	    case "ASIA":
	    	
	    	if(Integer.compare((int) c, 1)==0)
	    	cost = (float) (0.11*h);
	    	else if(Integer.compare((int) c, 2)==0)
	    	cost = (float) (0.20*h);
	    	else if(Integer.compare((int) c, 8)==0)
	    	cost = (float) (0.67*h);
	    	else if(Integer.compare((int) c, 16)==0)
	    	cost = (float) (1.18*h);
	    	else 
	    	System.out.print("Error in calculating cost, SERVER TYPE NOT AVAILABLE");
	    		    	
	    	System.out.print("Total Cost :- " +p+ "\t No. of CPU :-"+c+ "\t Hours consumed :-"+h);
	    	break;
	    case "US-EAST":
	    	
	    	if(Integer.compare((int) c, 1)==0)
	    	cost = (float) (0.12*h);
	    	else if(Integer.compare((int) c, 2)==0)
	    	cost = (float) (0.23*h);
	    	else if(Integer.compare((int) c, 4)==0)
	    	cost = (float) (0.45*h);
	    	else if(Integer.compare((int) c, 8)==0)
	    	cost = (float) (1.774*h);
	    	else if(Integer.compare((int) c, 16)==0)
	    	cost = (float) (0.45*h);
	    	else if(Integer.compare((int) c, 32)==0)
	    	cost = (float) (1.774*h);
	    	else 
	    		System.out.print("Error in calculating cost, SERVER TYPE NOT AVAILABLE");
	    	System.out.print("Total Cost :- " +p+ "\t No. of CPU :-"+c+ "\t Hours consumed :-"+h);
	    	break;
	    case "US-WEST":
	    	
	    	if(Integer.compare((int) c, 1)==0)
	    	cost = (float) (0.14*h);
	    	else if(Integer.compare((int) c, 4)==0)
	    	cost = (float) (0.4113*h);
	    	else if(Integer.compare((int) c, 8)==0)
	    	cost = (float) (0.89*h);
	    	else if(Integer.compare((int) c, 16)==0)
	    	cost = (float) (1.3*h);
	    	else 
	    		System.out.print("Error in calculating cost, SERVER TYPE NOT AVAILABLE");
	    	System.out.print("Total Cost :- " +p+ "No. of CPU :-"+c+ "Hours consumed :-"+h);
	    	break;
	    default :
	    	System.out.println("Sorry, Invalid Region found!");     		
	    		
	    }
	    }
		
	}


	
	private static void GetInput(char ch) {
		// TODO Auto-generated method stub
	    String reg;
		int cpus, hrs;
		float prc;
		Scanner sc=new Scanner(System.in);
		cpus = 0; hrs=0;
		prc=0;
		
		if(ch=='a')
		{
		    System.out.print("Enter no. of CPU's :-");
		    cpus=sc.nextInt();
		    
			System.out.print("Enter Hours :-");
		    hrs=sc.nextInt();
		    sc.nextLine();	//consuming the leftover new line
		    
		}
		else if (ch=='b')
		{
		    System.out.print("Enter price :-");
		    prc=sc.nextFloat();
		    
			System.out.print("Enter Hours :-");
		    hrs=sc.nextInt();
		    sc.nextLine();	//consuming the leftover new line
		    
		}
		else
		{
			//When user wants to exit
			System.exit(0);
			//return null;
		}
		
		 System.out.println("Enter your region :");
		 reg=sc.nextLine();
		    
		 reg=reg.toUpperCase();
		 //Function call
		 GetCost(cpus,hrs,prc,reg);	

		

	}

}
