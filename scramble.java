class Scramble
{ 
/* just give the word or numbers as string in the
argument and get all the possible combinations
as output
*/
public StringBuffer sb;
public int last;

Scramble(String s,int l)
{ sb=new StringBuffer(s);
last=l;
}
void jumble(StringBuffer temp,int counter)
{ counter++;
if(counter<=last) { for(int i=temp.length();i>=0;i--)
{ temp.insert(i,sb.charAt(counter));

if(temp.length()==(last+1))
{ System.out.println(temp);
}

jumble(temp,counter);
temp.deleteCharAt(i);
}
}
}
public static void main(String args[])
{ String word;
try
{ word=args[0];
int last=word.length()-1;

Scramble s=new Scramble(word,last);
String start=word.substring(0,1);

StringBuffer sb=new StringBuffer(start);

s.jumble(sb,0);


}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Enter a word as argument");
}
}
}

