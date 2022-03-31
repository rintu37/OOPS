class RectArea
{
    int l,b;
    RectArea(int length,int breadth) 
    {
        l=length;
        b=breadth;
    }
    public void arearect()
    {
        int area;
        area=l*b;
        System.out.println("Area="+area);
    }
    public void peri()
    {
        int peri;
        peri=2*(l+b);
        System.out.println("Perimeter="+peri);
    }
    public static void main(String args[])
    {
        RectArea r1=new RectArea(10,20);
        r1.arearect();
        r1.peri();
    }
}