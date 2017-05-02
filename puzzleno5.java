/*
A number of 9 digits has the following properties:

• The number comprising the leftmost two digits is divisible by 2, that comprising the leftmost three digits is divisible by 3, the leftmost four by 4, the leftmost five by 5, and so on for the nine digits of the number i.e. the number formed from the first n digits is divisible by n, 2<=n<=9. • Each digit in the number is different i.e. no digits are repeated. • The digit 0 does not occur in the number i.e. it is comprised only of the digits 1-9 in some order. Find the number? 

*/

//solution depends on scramble class
public class Nine
{
public Nine()
{}
void checkIt(StringBuffer sb)
{ 
  if(sb.length()==9)
  { 
    String str;
    int counter=0;
    for(int i= 1 ; i < 9 ; i++) 
    { 
      str=new String(""); 
      str=sb.substring(0,i+1); 
      int val=Integer.parseInt(str); 
      if((val%(i+1))==0) counter++; 
    } 
    
    if(counter==8) { System.out.println("Solution Found : "+sb); System.exit(0); } 
    } 
   } 
  } 
