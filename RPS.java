package q11487;
import java.util.Scanner;
public class CTJ11487 {
	public static void main(String args[]){
		char p1,p2;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++){
			p1=s.next().charAt(0); //nextInt(),nextDouble(),nextBoolean();nextChar()
		p2=s.next().charAt(0);
		if (p1=='R' && p2=='P') System.out.println("P2 Wins");
		else if (p1=='P' && p2=='R') System.out.println("P1 Wins");
		else if (p1=='P' && p2=='S') System.out.println("P2 Wins");
		else if (p1=='S' && p2=='P') System.out.println("P1 Wins");
		else if (p1=='S' && p2=='R') System.out.println("P2 Wins");
		else if (p1=='R' && p2=='S') System.out.println("P1 Wins");
		else if(p1==p2)  System.out.println("Tie");
		else  System.out.println("Invalid Input");
		}
	}
}
