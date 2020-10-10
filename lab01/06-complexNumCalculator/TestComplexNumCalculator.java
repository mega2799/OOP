class TestComplexNumCalculator {
    public static void main(String[] args) {
        ComplexNumCalculator c = new ComplexNumCalculator(); 
        ComplexNum nu_1 = new ComplexNum(1.0,2.0);
        ComplexNum nu_2 = new ComplexNum(2.0,3.0);
        ComplexNum nu_3 = new ComplexNum(4.0,5.0);
        ComplexNum nu_4 = new ComplexNum(6.0,7.0);
        ComplexNum nu_5 = new ComplexNum(8.0,2.0);
        ComplexNum nu_6 = new ComplexNum(3.0,-1.0);
        System.out.println(c.add(nu_1,nu_2).toStringRep());
        System.out.println(c.sub(nu_3, nu_4).toStringRep());
        System.out.println(c.mul(nu_5, nu_6).toStringRep());
        }
}
