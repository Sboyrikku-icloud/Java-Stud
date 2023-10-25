import java.util.Scanner;
class a{
public static void main(String args[]){
int a[]=new int[10];
Scanner r = new Scanner(System.in);
System.out.println("Enter an array elements ");
for(int i=0; i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.println("array elements ");
for(int i=0; i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println("array elements in reverse order");
for(int i=a.length-1;i>=0; i--)
{
System.out.print(a[i]+" ");
}
}
}