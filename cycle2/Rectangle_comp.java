class Rectangle {
    float length, width, r_area, r_peri;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        length = 1;
        width = 2;
    }

    void area() {
        r_area = length * width;
    }

    void perimeter() {
        r_peri = 2 * (length + width);
    }

    int sameArea(Rectangle r1) {
        if (r_area == r1.r_area) {
            return 0;
        } else
            return 1;

    }

}

class Rectangle_comp {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(1f, 2f);
        Rectangle r2 = new Rectangle();
        r1.area();
        r2.area();
        r1.perimeter();
        r2.perimeter();
        System.out.println("Area of rectangle 1=" + r1.r_area);
        System.out.println("Area ofthe rectangle 2=" + r2.r_area);
        System.out.println("perimeter of rectangle 1=" + r1.r_peri);
        System.out.println("Perimeter of rectangle=" + r2.r_peri);
        int ans = r2.sameArea(r1);
        if (ans == 0)
            System.out.println("Both area are equal");
        else
            System.out.println("Both area are unequal");
    }

}
