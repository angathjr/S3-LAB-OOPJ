class Time {
    int hr, min;

    Time(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }

    Time() {
        hr = 0;
        min = 0;
    }

    Time sum(Time t2) {
        Time t3 = new Time();
        int s;
        t3.hr = hr + t2.hr;
        s = min + t2.min;
        if (s > 60) {
            t3.min = s % 60;
            s = s / 60;
            t3.hr += s;
        } else {
            t3.min = s;
        }
        return t3;

    }
}

class Time_sum {
    public static void main(String args[]) {
        Time t1 = new Time(8, 5);
        Time t2 = new Time(4, 45);
        Time t3 = new Time();
        t3 = t1.sum(t2);
        System.out.println(t3.hr + " hours " + t3.min + " minutes ");
    }
}