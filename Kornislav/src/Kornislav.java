import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vl1,vl2,vl3,vl4,temp;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Input Value_1 : ");
		 vl1=scan.nextInt();
		 System.out.print("Input Value_2 : ");
		 vl2=scan.nextInt();
		 System.out.print("Input Value_3 : ");
		 vl3=scan.nextInt();
		 System.out.print("Input Value_4 : ");
		 vl4=scan.nextInt();
		 if(vl1>vl2){
		 temp=vl1;
		 vl1=vl2;
		 vl2=temp;
		 }
		 if(vl1>vl3){
		 temp=vl1;
		 vl1=vl3;
		 vl3=temp;
		 }
		 if(vl1>vl4){
		 temp=vl1;
		 vl1=vl4;
		 vl4=temp;
		 }
		 if(vl2>vl3){
		 temp=vl2;
		 vl2=vl3;
		 vl3=temp;
		 }
		 if(vl2>vl4){
		 temp=vl2;
		 vl2=vl4;
		 vl4=temp;
		 }
		 if(vl3>vl4){
		 temp=vl3;
		 vl3=vl4;
		 vl4=temp;
		 }
		 System.out.print("\nRectangle Area = : "+""+vl3+""+" * "+vl1+" = "+vl3*vl1);
	}

}
