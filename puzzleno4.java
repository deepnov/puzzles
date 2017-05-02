/*
Four words add up to a fifth word numerically:

     mars
    venus
   uranus
   saturn
 -------- +
  neptune 

Each of the ten letters (m, a, r, s, v, e, n, u, t, and p) 
represent a unique number from the range 0 .. 9. 
Furthermore, numbers 1 and 6 are being used most frequently.
Find the Unique Number?

*/
//depends on scramble class
public class Puz
{
// (m, a, r, s, v, e, n, u, t, and p)
String s[]={"mars","venus","uranus","saturn","neptune"};
public Puz()
{
}
void change(StringBuffer s1,StringBuffer stemp)
{
for(int i=0;i < s1.length();i++)
{
if(s1.charAt(i)=='m')
s1.setCharAt(i,stemp.charAt(0));
if(s1.charAt(i)=='a')
s1.setCharAt(i,stemp.charAt(1));
if(s1.charAt(i)=='r')
s1.setCharAt(i,stemp.charAt(2));
if(s1.charAt(i)=='s')
s1.setCharAt(i,stemp.charAt(3));
if(s1.charAt(i)=='v')
s1.setCharAt(i,stemp.charAt(4));
if(s1.charAt(i)=='e')
s1.setCharAt(i,stemp.charAt(5));
if(s1.charAt(i)=='n')
s1.setCharAt(i,stemp.charAt(6));
if(s1.charAt(i)=='u')
s1.setCharAt(i,stemp.charAt(7));
if(s1.charAt(i)=='t')
s1.setCharAt(i,stemp.charAt(8));
if(s1.charAt(i)=='p')
s1.setCharAt(i,stemp.charAt(9));

}

}
public void equate(StringBuffer stemp)
{ StringBuffer s1,s2,s3,s4,s5;
s1=new StringBuffer(s[0]);
s2=new StringBuffer(s[1]);
s3=new StringBuffer(s[2]);
s4=new StringBuffer(s[3]);
s5=new StringBuffer(s[4]);
change(s1,stemp);
change(s2,stemp);
change(s3,stemp);
change(s4,stemp);
change(s5,stemp);
int i1,i2,i3,i4,i5,sum;
i1=Integer.parseInt(s1.toString());
i2=Integer.parseInt(s2.toString());
i3=Integer.parseInt(s3.toString());
i4=Integer.parseInt(s4.toString());
i5=Integer.parseInt(s5.toString());
sum=i1+i2+i3+i4;
if(sum==i5)
{ try{
System.out.println("solution found: "+i5);
if(i5==917409)
Thread.sleep(10000);
else
System.exit(0);
}catch(Exception e){}
}
}

public static void main(String args[])
{ 


StringBuffer sb;
sb=new StringBuffer("11");
System.out.println(Integer.parseInt(sb.toString()));

}

}
