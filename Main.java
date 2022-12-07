import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     System.out.println("!!!Lets Start!!!");
	 
		System.out.println("1-ROCK");
		System.out.println("2-PAPER");
		System.out.println("3-SCISSOR");
		int u=sc.nextInt();
		Random r=new Random();
		int c=r.nextInt(3);
		if(u==1&&c==3||u==2&&c==1||u==3&&c==2)
		System.out.println("You Win");
		else if(u==c)
     	System.out.println("Its a tie");		
	    else
	    System.out.println("Computer win");
	    System.out.println("Coz Computer chose "+c);
	 }
}
