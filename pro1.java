public class pro1
{
public static void main(String [] args)
{
StringBuffer buff=new StringBuffer("Java Developers never RIP they just get Garbage Collected");
System.out.println("Original string=" +buff);
buff.delete (5,15);
System.out.println("After Deletion=" +buff);
}
}