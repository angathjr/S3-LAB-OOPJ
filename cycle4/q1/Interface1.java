interface Area
{
    double findArea();
}
interface Volume
{
    double findVolume();
}
class Shape
{
    String name;
    Shape(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
}
class Circle extends Shape implements Area
{
    double radius;
    Circle( String n,double r)
    {
        super(n);
        radius=r;
    }
    public double findArea()
    {
        return (3.14*radius*radius);
    }
}
class Square extends Shape implements Area
{
    double side;
    Square(String n,double s)
    {
        super(n);
        side=s;
    }
    public double findArea()
    {
        return(side*side);
    }
}
class Cylinder extends Circle implements Volume
{
    double height;
    double radius;
    Cylinder(String n,double r,double h)
    {
        super(n,r);
        height=h;
        radius=r;
    }

    public double findVolume()
    {
        return (3.14*radius*radius*height);
    }
    
}
class Sphere extends Circle implements Volume
{
    double radius;
    Sphere(String n,double r) 
    {
     super(n,r);
     radius=r;
    }
   public double findVolume()
   {
       return (4.19*radius*radius*radius);
   }
}
class Cube extends Square implements Volume
{
    double side;
    Cube(String n,double s)
    {
        super(n,s);
        side=s;
    }
    public double findVolume()
    {
        return (side*side*side);
    }
}
class Glome extends Sphere implements Volume
{
    double radius;
    Glome(String n,double r)
    {
        super(n,r);
        radius=r;
    }
    public double findVolume()
    {
        return (0.5*3.14*3.14*radius*radius*radius*radius);
    }
}
class Interface1
{
    public static void main(String args[])
    {
        Circle cir=new Circle("Circle",1);
        Square sqr=new Square("Square",1);
        Cylinder cdr=new Cylinder("Cylinder", 1, 1);
        Sphere spr=new Sphere("Sphere",1);
        Cube cb=new Cube("Cube", 1);
        Glome g=new Glome("Glome", 1);
        System.out.println("Area of "+cir.getName() +": "+ cir.findArea()); 
        System.out.println("Area of "+sqr.getName() +": "+ sqr.findArea()); 
        System.out.println("Volume of "+spr.getName() +": "+spr.findVolume());
        System.out.println("Volume of "+cb.getName() +": "+cb.findVolume()); 
        System.out.println("Volume of "+cdr.getName() +": "+cdr.findVolume());
        System.out.println("Volume of "+g.getName() +": "+g.findVolume());
    }
}