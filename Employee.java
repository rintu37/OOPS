class Employee
{
    int emp_id;
    float salary;
    String empname;
    float t_salary;
    Employee(int a,String b,float c)
    {
        emp_id=a;
        empname=b;
        salary=c;
    }
    public void Totalsalary()
    {
        t_salary=salary+salary*20/100;
        System.out.println("total salary="+t_salary);
    }
    public static void main(String args[])
    {
        Employee e1=new Employee(100, "abc", 5000);
        e1.Totalsalary();
        Employee e2=new Employee(101,"bcd",7000);
        e2.Totalsalary();
    }

}
