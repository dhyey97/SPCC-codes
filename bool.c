#include<stdio.h>
#include<stdlib.h>
#include<string.h>
char x[20];
int top=0;
void push(char a)
{
	x[top]=a;
	top++;
}

char pop()
{
	char a=x[top];
	return a
}

void main()
{
	char a[20];
	int count=100,i,k=1,j=3;
	printf("Enter the expression without spaces\n" );
	scanf("%s",a);

	for(i=0;i<strlen(a);i++)
	{
		if(a[i]=='&'|| a[i]=='|')
		{
			push(a[i]);
			i++;
			continue;
		}

		printf("%d: if %c%c%c goto %d\n",count,a[i],a[i+1],a[i+2],count+3);
		count++;
		printf("%d: t%d=0\n",count,k);
		count++;
		printf("%d: goto %d\n",count,count+2);
		count++;
		printf("%d: t%d=1\n",count,k);
		count++;
		k++;
		i+=2;
	}

	if(top!=0)
	{
		printf("%d: t%d=t1%c%ct2\n",count,k,x[0],x[0]);
		k++;
		count++;
	}

	for(i=1;i<top;i++,j++,k++,count++)
	{
		printf("%d: t%d=t%d%c%ct%d\n",count,k,k-1,x[i],x[i],j );
	}
}