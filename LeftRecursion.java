 import java.util.*;
class LeftRecursion
{
	public static void main(String args[])
	{
		int j=0;
		char start;
		String t[]=new String[10];
		String o1="",o2="";
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the production");		
		String s=ob.nextLine();
		start=s.charAt(0);


		//step 1: creating tokens
		for(int i=0;i<10;i++)         
		{
			t[i]="";
		}
		for(int i=3;i<s.length();i++)
		{
			if(s.charAt(i)!='|')
				t[j]+=s.charAt(i);
			else j++;

		}


		// step2: displaying tokens
		for(int i=0;i<=j;i++)
		{
			System.out.println("t"+(i+1)+"="+t[i]);
		}


		// step 3: telling the user which rule has left recursion
		int r=0,c=0;
		for(int i=0;i<=j;i++)
		{
			if(t[i].charAt(0)==start)
				System.out.println("Left Recursion exists in the "+(i+1)+" rule");
			else c++;
			
		}

		if(c>j)
		{
			System.out.println("There is no left recursion ");
		}


		// step 4: If left recursion exists, then eliminate.
		else
		{ 
			for(int i=0;i<=j;i++)
			{
				
				if(t[i].charAt(0)==start)
				{
					o2+=t[i].substring(1)+start+"\'"+"|";
				
				}
				else
				{
					o1+=t[i]+start+"\'"+"|";
				}
			}

			o2+="epsilon";
			o1=o1.substring(0,o1.length()-1);
			//step 5: print the expressions
			System.out.println(start+"->"+o1);
			System.out.println(start+"\'->"+o2);
		}
	}
}
