// instead of using variable tokens, I have used number tokens. Pls Bear with me
import java.util.*;
class ICG1
{
	public int countOfOperators(String exp)
	{
		int c=0;
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='/')
				c++;
		}
		return c;
	}

	public static void main(String args[])
	{
		
		ICG1 obj=new ICG1();
		String exp;
		int i1=0,i2=0,i3=0,i4=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the expr");
		exp=ob.next();
		String t[]=new String[10];
		char start=exp.charAt(0);
		exp=exp.substring(2);
		int c=obj.countOfOperators(exp);

		exp+="|";
		//int r=c;
		if(c!=0)
		{
			for(int i=0;i<c+1;i++)
			{
				//if(r!=0)
				
					i1=exp.indexOf('*');
					i2=exp.indexOf('/');
					i3=exp.indexOf('+');
				    i4=exp.indexOf('-');
					if(i1==-1)
						i1=99;
					if(i2==-1)
						i2=99;
					if(i3==-1)
						i3=99;
					if(i4==-1)
						i4=99;
					
					if(i1<i2)
					{
						t[i]=exp.substring(i1-1,i1+2);
						String a=Integer.toString(i);
						exp=exp.replace(t[i],a);
						//r--;
						continue;
					}

					else if(i1>i2)
					{
						t[i]=exp.substring(i2-1,i2+2);
						String a=Integer.toString(i);
						exp=exp.replace(t[i],a);
						//r--;
						continue;
					}

					else if(i3<i4)
					{
						t[i]=exp.substring(i3-1,i3+2);
						String a=Integer.toString(i);
						exp=exp.replace(t[i],a);
						//r--;
						continue;
					}

					else if(i3>i4)
					{
						t[i]=exp.substring(i4-1,i4+2);
						String a=Integer.toString(i);
						exp=exp.replace(t[i],a);
						//r--;
						continue;
					}
					//continue;
				
				//else
				
					t[i]=exp;
				

			}

		}
		else
			t[0]=exp;
		int j;
		for( j=0;j<c;j++)
		{
			System.out.println(j+"="+t[j]);
		}
		System.out.println(start+"="+t[j].substring(0,t[j].length()-1));
	}
}