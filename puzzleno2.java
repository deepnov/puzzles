/*
In a sports contest there were m medals awarded on n successive days (n > 1).
1. On the first day 1 medal and 1/7 of the remaining m - 1 medals were awarded.
2. On the second day 2 medals and 1/7 of the now remaining medals was awarded; and so on.
3. On the nth and last day, the remaining n medals were awarded.
How many days did the contest last, and how many medals
were awarded altogether?(Author:unknown)
*/

class medal
{
public static void main(String args[])
{
int n,m,temp;
n=1;
m=1;
while(true)
{
m=m+7;
temp=m;
System.out.println("IF medals= "+m);
n=1;
while(temp>=0)
{
if(temp==n)
{ System.out.println("solution found:Days->"+n+"Medals->"+temp);
System.exit(0);
}

temp=temp-(n+((temp-n)/7));
System.out.println("Day "+n+" Remaining "+temp);
n++;

}
}
}
}
