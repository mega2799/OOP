class ComplexNumCalculator{
    ComplexNum add(ComplexNum a, ComplexNum b){
        ComplexNum result = new ComplexNum(0.0,0.0);
        result.re = a.re + b.re;
        result.im = a.im + b.im;
        return result;
    }
    ComplexNum sub(ComplexNum a, ComplexNum b){
        ComplexNum result = new ComplexNum(0.0,0.0);
        result.re = a.re - b.re;
        result.im = a.im - b.im;
        return result;
    }
    ComplexNum mul(ComplexNum a, ComplexNum b){
        ComplexNum result = new ComplexNum(0.0,0.0);
        result.re = (a.re * b.re) - (a.im * b.im); 
        result.im = (a.im * b.re) + (a.re * b.im);
        return result;
    }
    ComplexNum div(ComplexNum a, ComplexNum b){
        ComplexNum result = new ComplexNum(0.0,0.0);
        var denom = b.im * b.im + b.re * b.re;
        result.re = (a.re * b.re + a.im * b.im) / denom ;
        result.im = (a.im * b.re - a.re * b.im) / denom ;
        return result;
    }
}
