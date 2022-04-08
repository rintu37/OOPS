import java.util.Scanner;
public class Employee
{
    int eid;
    String ename;
    float salary;
    public void GetInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id");
        eid=sc.nextInt();
        System.out.println("Enter the name");
        ename=sc.next();
        System.out.println("Enter salary");
        salary=sc.nextFloat();
    }
    public void Display()
    {
        System.out.println("Employee id:"+eid);
        System.out.println("Employee name:"+ename);
        System.out.println("Salary:"+salary);
    }
    public static void main(String args[])
    {
        int i,n,s,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of employees");
        n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(i=0;i<n;i++)
        {
            e[i]=new Employee();
            e[i].GetInput();
        }
        System.out.println("Employee details are");
        for(i=0;i<n;i++)
        {
            e[i].Display();
        }
        System.out.println("Enter the employee id to be search");
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(s==e[i].eid)
            {
                f=1;
                break;
            }
            
                
                
        }
        if(f==1)
        {
            System.out.println("Employee details:");
            e[i].Display();
        }
        else
        {
            System.out.println("Details not found");
        }
                
                
    }
}


