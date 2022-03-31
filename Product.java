class Product
{
    int pcode;
    String pname;
    float price;
    Product(int a,String b,float c)
    {
        pcode=a;
        pname=b;
        price=c;
    }
    
    public static void main(String args[])
    {
        Product p1=new Product(1, "abc", 190);
        System.out.println("Empcode="+p1.pcode);
        System.out.println("Empname="+p1.pname);
        System.out.println("price="+p1.price);
        Product p2=new Product(2, "efg", 200);
        System.out.println("Empcode="+p2.pcode);
        System.out.println("Empname="+p2.pname);
        System.out.println("price="+p2.price);
        Product p3=new Product(3, "fgh",250);
        System.out.println("Empcode="+p3.pcode);
        System.out.println("Empname="+p3.pname);
        System.out.println("price="+p3.price);
        if(p1.price>p2.price)
        {
            if(p1.price>p3.price)
                    {
                    System.out.println("p1 is grater");
                    }
            else
                    {
                    System.out.println("p2 is grater");
                    }
        }
        else
        {
                System.out.println("p3 is grater");
                }
                
                
                
            
    }
    
    }
    
    
    
    
    


