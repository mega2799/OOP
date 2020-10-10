class ComplexNum {

    /*
     * Inserire qui la dichiarazione dei campi della classe
     */
    double re,im;
    
    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        return num.re == this.re && num.im == this.im ;    
    }

    void add(ComplexNum num) {
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {
        return "re_0: " + this.re + "\tre_1:" + re +"= " + (this.re + re) + "\tim_0: " + this.im + "i\t im_1: " + im +"i= " + (this.im + im) + "i";
    }
}
