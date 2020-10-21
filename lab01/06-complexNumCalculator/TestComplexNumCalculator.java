class TestComplexNumCalculator {
    public static void main(String[] args) {
        ComplexNumCalculator c = new ComplexNumCalculator(); 
        ComplexNums nu_1 = new ComplexNums(1.0,2.0);
        ComplexNums nu_2 = new ComplexNums(2.0,3.0);
        ComplexNums nu_3 = new ComplexNums(4.0,5.0);
        ComplexNums nu_4 = new ComplexNums(6.0,7.0);
        ComplexNums nu_5 = new ComplexNums(8.0,2.0);
        ComplexNums nu_6 = new ComplexNums(3.0,-1.0);
        System.out.println(c.add(nu_1,nu_2).toStringRep());
        System.out.println(c.sub(nu_3, nu_4).toStringRep());
        System.out.println(c.mul(nu_5, nu_6).toStringRep());
        }
}
