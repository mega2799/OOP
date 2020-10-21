class ComplexNumCalculator{
    ComplexNums add(ComplexNums a, ComplexNums b){
        ComplexNums result = new ComplexNums(0.0,0.0);
        result.re = a.re + b.re;
        result.im = a.im + b.im;
        return result;
    }
    ComplexNums sub(ComplexNums a, ComplexNums b){
        ComplexNums result = new ComplexNums(0.0,0.0);
        result.re = a.re - b.re;
        result.im = a.im - b.im;
        return result;
    }
    ComplexNums mul(ComplexNums a, ComplexNums b){
        ComplexNums result = new ComplexNums(0.0,0.0);
        result.re = (a.re * b.re) - (a.im * b.im); 
        result.im = (a.im * b.re) + (a.re * b.im);
        return result;
    }
    ComplexNums div(ComplexNums a, ComplexNums b){
        ComplexNums result = new ComplexNums(0.0,0.0);
        var denom = b.im * b.im + b.re * b.re;
        result.re = (a.re * b.re + a.im * b.im) / denom ;
        result.im = (a.im * b.re - a.re * b.im) / denom ;
        return result;
    }
}
