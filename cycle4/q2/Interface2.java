interface Operations
{
    public void area();
    public void volume();
    final float PI=3.14f;
}
class Cylinder implements Operations
{
    float height,radius;
    Cylinder(float height,float radius)
    {
        this.height=height;
        this.radius=radius;
    }
    public void volume()
    {
        float vol=PI*radius*radius*height;
        System.out.println("The volume of the cylinder is "+vol);
    }
    public void area()
    {
        float ar=(2*PI*radius*height)+(2*PI*radius*radius);
        System.out.println("The area of the cylinder is "+ar);
    }
}
class Interface2
{
    public static void main(String args[])
    {
        Cylinder cy=new Cylinder(1f,1f);
        cy.area();
        cy.volume();
    }
}