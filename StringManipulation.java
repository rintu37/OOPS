import java.util.Scanner;
class StringManipulation
{
    String str1;
    StringManipulation(String sm)
    {
        str1=sm;
        
    }
    public void strLen()
    {   
        System.out.println("Length of the string is"+str1.length());
    }
    public void strConcat()
    {   
        String str3="World";
        System.out.println("concatenated string is:"+str1.concat(str3));
    }
    public void charPos()
    {
        System.out.println("Character at 3rd position in str1 is:"+str1.charAt(2));
    }
    public void compare()
    {  
        String str2="Helloo";
       System.out.println("String after comparison:"+str1.compareTo(str2));
       if(str1.compareTo(str2)==0)
       {
           System.out.println("Strings are same");
           
       }
       else
       {
           System.out.println("not same");
       }
    }
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        str=sc.next();
        StringManipulation sm=new StringManipulation(str);
        sm.strLen();
        sm.strConcat();
        sm.charPos();
        sm.compare();
    }
    
}
