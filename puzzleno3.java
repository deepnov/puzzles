/*
How many ways are there to make change for a dollar?

*/

class Cent
{
public static void main(String args[])
{ int a,b,c,d,e,counter;
counter=0;
a=1;
b=5;
c=10;
d=25;
e=50;
for(int m=0;m<=2;m++) 
{ for(int l=0;l<=4;l++) 
{ for(int k=0;k<=10;k++) 
{ for(int j=0;j<=20;j++) 
{ for(int i=0;i<=100;i++) 
{ int sum=i*a+j*b+k*c+l*d+m*e; 
if(sum==100) 
{ counter++; System.out.println("50's("+m+")25's("+l+")10's("+k+")5's("+j+")1's("+i+")"); 
} 
}
}
}
}
} 
System.out.println(counter); 
} 
}
