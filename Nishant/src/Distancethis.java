class Distancethis {
    int position;

    public static void main(String[] args) {
        Distancethis d1 = new Distancethis(10);
        Distancethis d2 = new Distancethis(25);

        d1.calculate(d2);
//        d2.calculate(d1);
    }

    Distancethis(int position) {
        this.position = position;
    }

    void calculate(Distancethis other) {
        System.out.println(this.position - other.position);
    }
}

// d1 nu this.position 10 and Distanceother