// This code only works for languages with 2 production rules ,eg: A->aCSD|aCSDFGH .
import java.util.*;
class LeftFactoring
{
	public static void main(String args[])
	{
		int j=0,i,c=0;
		char start;
		String t[]=new String[10];
		String o1="",o2="",common="";
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the production");		
		String s=ob.nextLine();
		start=s.charAt(0);
		//step 1: creating tokens
		for( i=0;i<10;i++)         
		{
			t[i]="";
		}
		for( i=3;i<s.length();i++)
		{
			if(s.charAt(i)!='|')
				t[j]+=s.charAt(i);
			else j++;

		} 
		// step2: displaying tokens
		for( i=0;i<=j;i++)
		{
			System.out.println("t"+(i+1)+"="+t[i]);
		}
		// code only for two productions
		//step 3: find out which token has max length

		int min= Math.min(t[0].length(),t[1].length());
		// step 4: leftfactoring 
		for( i=0;i<min;i++)
		{
			if(t[0].charAt(i)==t[1].charAt(i))
				common+=t[0].charAt(i);
			else 
			{
				 c=i;
				break;
			}


		}
		o1+=common+start+"\'";

		if(min==t[0].length())
		{
			if(i==min)
				o2+="epsilon";
			else
			{
				for( j=c;j<min;j++)
				{
					o2+=t[0].charAt(j);
				}

			}
			o2+="|";

			if(i==min)
				o2+=t[1].substring(min);
			else
				o2+=t[1].substring(c);

		}

		else if(min==t[1].length())
		{

			if(i==min)
				o2+=t[0].substring(min);
			else
				o2+=t[0].substring(c));

				o2+="|";

			if(i==min)
				o2+="epsilon";
			else
			{
				for( j=c;j<min;j++)
				{
					o2+=t[1].charAt(j);
				}

			}
		

			
		}
		System.out.println("***********Left Factoring is************");
		System.out.println(start+"->"+o1);
		System.out.println(start+"\'->"+o2);
	}
}