import java.util.Scanner; 
public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1,t2;  
		char c;  
		int i=0;  
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter Text : ");  
		t1=scan.nextLine();  
		t2=t1.toUpperCase();  
		for(i=t2.length()-1;i>=0;i--)  
		{  
			c=t2.charAt(i);  
			if(c=='E'){  
				c='R';  
		 	}  
		 	else if(c=='R'){  
		 		c='W';  
		 	}  
		 	else if(c=='W'){  
		 		c='E';  
		 	}  
		 	System.out.print(c);  
		 	}  
	}
}
