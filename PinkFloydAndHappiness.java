package pack;
import java.util.*;
public class PinkFloydAndHappiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count =1;
		int a[]= new int[100];
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i+1]==a[i]+1)
			{
				count++;
			}
		}
		if(count == n)
			System.out.println("Happy");
		else
			System.out.println("Sad");
		

	}

}