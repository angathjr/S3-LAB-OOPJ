class Complex {
    float im, rl;

    Complex(float rl, float im) {
        this.rl = rl;
        this.im = im;
    }

    Complex() {
        im = 0;
        rl = 0;
    }

    Complex sum(Complex c2) {
        Complex c3 = new Complex();
        c3.rl = rl + c2.rl;
        c3.im = im + c2.im;
        return c3;
    }
}

class Complex_sum {
    public static void main(String args[]) {
        Complex c1 = new Complex(3f, 2f);
        Complex c2 = new Complex(1f, 2f);
        Complex c3 = new Complex();
        c3 = c1.sum(c2);
        System.out.println(c1.rl + " +i" + c1.im);
        System.out.println(c2.rl + " +i" + c2.im);
        System.out.println(c3.rl + " +i" + c3.im);
    }
}