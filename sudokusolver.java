import java.io.*;
import java.util.*;

class Sudoku
{
Sudoku(int[][] area)
{ 
System.out.println("PROBLEM MATRIX\n");
for(int i=0;i {
for(int j=0;j { System.out.print(area[i][j]+" ");
}
System.out.println();
}
System.out.println("Problem Matrix Completion Status ==> "+isComplete(area));

solve(area);

}
void print(int[][] area,int p)
{
System.out.println("PROBLEM MATRIX\n");
for(int i=0;i {
for(int j=0;j { System.out.print(area[i][j]+" ");
}
System.out.println();
}
System.out.println("Status after phase "+p+">"+isComplete(area));
if(isComplete(area)==true)
System.exit(0);
}
void solve(int[][] a)
{ boolean flag;
while(!isComplete(a))
{ flag=false;
for(int i=0;i {
for(int j=0;j { if(a[i][j]==0)
{ Vector v=getPossibleValues(a,i,j,plotCube(i,j));
if(v.size()==1) 
{ a[i][j]=(Integer)v.get(0);
flag=true; 
}
}

}
}
if(flag!=true)break;
}

print(a,1);

if(!isComplete(a))
{ solveII(a);
}

}

void solveII(int a[][])
{ 
for(int i=0;i {
for(int j=0;j { 
if(a[i][j]==0)
{ 
Vector v=getPossibleValues(a,i,j,plotCube(i,j));
if(v.size()==0)return;
for(int k=0;k { int x[][]=new int[9][9];

for(int m=0;m { for(int n=0;n { x[m][n]=a[m][n];
}
}
x[i][j]=(Integer)v.get(k);
solveII(x);

}

return;
}

}
}
print(a,2);

} 

int plotCube(int x,int y)
{ int cube;
if(x<3)
{ if(y<3)
{ return 1;
}
else if(y>=3&&y<6)
{ return 2;
}
else if(y>=6)
{ return 3;
}
}
else if(x>=3&&x<6)
{ if(y<3)
{ return 4;
}
else if(y>=3&&y<6)
{ return 5;
}
else if(y>=6)
{ return 6;
}
}
else if(x>=6)
{ if(y<3)
{ return 7;
}
else if(y>=3&&y<6)
{ return 8;
}
else if(y>=6)
{ return 9;
}
}
return 0;
}

Vector getPossibleValues(int a[][],int x,int y,int z)
{ 
if(z==0)
{ System.out.print("Cube position can't be ZERO");
System.exit(0);
}
Vector v=new Vector();
boolean b[]={true,true,true,true,true,true,true,true,true};
for(int i=0;i<9;i++)
{ if(a[x][i]>0&&a[x][i]<10)
b[a[x][i]-1]=false;
}
int[] n=getColumnArray(a,y);
for(int i=0;i<9;i++)
{ if(n[i]>0&&n[i]<10)
b[n[i]-1]=false;
}
int[] m=getCubeArray(a,z);
for(int i=0;i<9;i++)
{ if(m[i]>0&&m[i]<10)
b[m[i]-1]=false;
}
for(int i=0;i<9;i++)
{ if(b[i]==true)
v.add(i+1);
}

return v;
}
boolean isComplete(int[][] matrix)
{
for(int i=0;i {
for(int j=0;j {
if(matrix[i][j]<1||matrix[i][j]>9)
return false;
}
}
return true;

}
int[] getCubeArray(int cube[][],int z)
{
int x[]=new int[9];
int k=0,l=0;
switch(z)
{ case 1:k=0;l=0; break;
case 2:k=3;l=0; break;
case 3:k=6;l=0; break;
case 4:k=0;l=3; break;
case 5:k=3;l=3; break;
case 6:k=6;l=3; break;
case 7:k=0;l=6; break;
case 8:k=3;l=6; break;
case 9:k=6;l=6; break; 
}
int count=0;
for(int i=l;i { 
for(int j=k;j { x[count]=cube[i][j];
count++;

}
}

return x;

}
int[] getColumnArray(int a[][],int index)
{ int x[]=new int[9];
for(int i=0;i<9;i++)
{ x[i]=a[i][index];
}
return x;
}
boolean checkArray(int a[])
{ boolean b[]={true,true,true,true,true,true,true,true,true};
for(int i=0;i<9;i++)
{ if(a[i]>0&&a[i]<10)
{ b[a[i]-1]=false;
}
}
for(int i=0;i { if(b[i]==true)
{ return false;
}
}
return true;

}

public static void main(String args[])
{ //moderate problem
int b[][]={
{0,0,0,0,0,0,0,3,8},
{0,2,3,4,0,8,0,0,0},
{0,8,0,5,2,0,1,0,9},
{0,0,0,6,7,4,0,5,0},
{0,0,0,0,0,0,0,0,0},
{0,1,0,3,5,9,0,0,0},
{1,0,5,0,4,7,0,9,0},
{0,0,0,9,0,2,7,1,0},
{2,9,0,0,0,0,0,0,0}
};

try
{
new Sudoku(c);
}
catch(Exception e)
{ e.printStackTrace();
}
}
}
