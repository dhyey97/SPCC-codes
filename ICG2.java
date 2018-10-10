import  java.util.*;
class ICG2
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner (System.in);
		String name,exp;
		int n;
		String code[]=new String[10];
		System.out.println("Enter the name of the control statement:");
		name=ob.next();
		System.out.println("Enter the condition of the loop");
		exp=ob.next();
		System.out.println("Enter the no of lines of code");
		n=ob.nextInt();
		System.out.println("Enter the lines of code in loop, each on a new line");
		for(int i=0;i<n;i++)
		{
			code[i]=ob.next();
		}
		int index=100;
		System.out.println("Translation Scheme for the loop while "+exp+" do is:");
		System.out.println(index++ +".\t L1: if "+exp+" goto L2");
		System.out.println(index++ +".\t goto Stop");
		System.out.println(index++ +".\t L2: "+code[0]);
		for (int i=1;i<n ;i++ )
		{
			System.out.println(index++ +".\t"+code[i]);	
		}
		System.out.println(index++ +".\t Goto L1");
		System.out.println(index++ +".\t Stop");
		
	}
}  