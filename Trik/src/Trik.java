import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L=1,C=0,R=0,temp,i;
		 String swap;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter Value : ");
		 swap = scan.next();
		 for(i=0;i<swap.length();i++){
		 if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		 temp=L;
		 L=C;
		 C=temp;
		 }else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		 temp=C;
		 C=R;
		 R=temp;
		 }else{
		 temp=L;
		 L=R;
		 R=temp;
		 }
		 }
		 if(L == 1) System.out.println("Coin is in L glass");
		 else if(C == 1) System.out.println("Coin is in C glass");
		 else System.out.println("Coin is in R glass");
	}

}
