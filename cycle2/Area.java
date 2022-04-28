class Shape
{
    float len,wid,hgth,r;
    Shape(int len, int wid)
    {
        this.len=len;
        this.wid=wid;
    }
    Shape(float r)
    {
        this.r=r;
    }
    Shape(float len,float wid,float hgth)
    {
        this.len=len;
        this.wid=wid;
        this.hgth=hgth;
    }
    Shape(float wid,float hgth)
    {
        this.wid=wid;
        this.hgth=hgth;
    }
    void area1()
    {
        System.out.println("Area of Rectangle="+len*wid);
    }
    void area2()
    {
        float s=((len+wid)/2)*hgth;

        System.out.println("Area of Trapeziod= "+s);
    }
    void area3()
    {
        System.out.println("Area of circle="+3.14*r*r);

    }
    void area4()
    {
        System.out.println("Area of triangle="+ 0.5*wid*hgth);
    }
}
class Area
{
    public static void main(String args[])
    {
        Shape area1=new Shape(1,2);
        Shape area2=new Shape(1F);
        Shape area3=new Shape(3F,4F,5F);
        Shape area4=new Shape(3f,4f);
        area1.area1();
        area2.area1();
        area3.area1();
        area4.area1();
    }  
}