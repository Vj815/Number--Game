import java.util.*;
public class NumberGame 
{

	public static void main(String[] args) 
	{
		int Guess, user;
		int ct=0;
		Random random=new Random();
		Guess=random.nextInt(100);
		
		do
		{
			System.out.println("Number generated Enter your guess:");
			Scanner sc =new Scanner(System.in);
			user=sc.nextInt();
			
//			System.out.println("User number"+user);
			
			if(Guess>user)
			{
				System.out.println("Too Low!!!");
				ct++;
				
			}
			else if (Guess<user)
			{
				System.out.println("Too High!!!");
				ct++;
			}
			else
			{
				ct++;
				System.out.println("Match!!YOU WIN !!");
				System.out.println("No.Attempts:"+ct);
				break;
			}
	
			}while(Guess!=user);
		
	
			
	}
	
}
		

		
	
			
		
		
		
		
		
		


	