public class Calculator {
   int nOpDone;
   double lastRes;
    double add(double a, double b){    
        this.nOpDone += 1;
        return this.lastRes = (a + b);
    }
     double sub(double a, double b){
         this.nOpDone += 1;
         return this.lastRes = (a - b);
    }
    double div(double a, double b){
        this.nOpDone += 1;
        return this.lastRes = (a / b);
    }
     double mul(double a, double b){
        this.nOpDone += 1; 
         return this.lastRes =  (a * b);
    }
    void build(){
        this.nOpDone = 0;
        this.lastRes = 0;
    }
}
