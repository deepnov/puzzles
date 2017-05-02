/*

A rich man died. In his will, he has divided his gold coins among his 5 sons, 5 daughters and a manager.

According to his will: First give one coin to manager. 1/5th of the remaining to the elder son. Now give one coin to the manager and 1/5th of the remaining to second son and so on..... After giving coins to 5th son, divided the remaining coins among five daughters equally.

All should get full coins. Find the minimum number of coins he has?(Author:unknown)


*/

class Coin
{
public static void main(String args[])
{ int no=0,counter,temp;
while(true)
{ no++;
temp=no;
counter=0;
for(int i=0;i<5;i++)
{ temp--;
if(temp==0)break;
if(temp%5==0)
{ System.out.println("Son "+(i+1)+" gets "+temp/5);
temp=temp-(temp/5);
counter++;
}
else break;
}
if(temp%5==0) { counter++;
System.out.println("daughters : "+temp/5); }
if(counter==6) {
System.out.println("solution found : "+no);
System.exit(0);
}
}
}
}
