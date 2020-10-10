class ComplexNum{
    double re;
    double im;
       ComplexNum(double a, double b) {
        this.re = a;
        this.im = b;
    }
   boolean equal(ComplexNum num) {
        return (re == num.re) && (im == num.im);
    }

    void add(ComplexNum num) {
        re += num.re;
        im += num.im;
    }

    String toStringRep() {
        return im == 0
            // Special case: real number.
            ? re + ""
            // Stringify real part if present
            : (re == 0 ? "" : re)
                // Add + signum if required (if negative, - is added automatically)
                + (re != 0 && im > 0 ? "+" : "")
                // Add imaginary part, handle +-1
                + (im == 1 ? "" : (im == -1 ? "-" : im + "")) + "i";
    }
}
