class Student1
{
    int m1,m2,m3,sum;

    Student1(int a,int b,int c) 
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        sum=m1+m2+m3;
        System.out.println("Sum="+sum);
    }
    public void percentage()
    {
        int per;
        per=sum*100/300;
        System.out.println("Percentage="+per);
    }
public static void main(String args[])
{
    Student1 s=new Student1(70, 30, 30);
    s.sum();
    s.percentage();
    Student1 s1=new Student1(45, 50, 60);
    s1.sum();
    s1.percentage();
}

    
}