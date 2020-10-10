class Recognizer{
    int valore;
    int nextExpectedInt(){
        if(valore == 0){
            this.valore += 1;
            return 1;
        }
        if(valore<3){
            return this.valore;
        }
        Recognizer res = new Recognizer();
        res.reset();
        return valore;
    }

    boolean check1(int num){
       this.valore += 1;  
       return num == 1;
   }
   boolean check2(int num){
       this.valore += 1;  
       return num == 2;
   }
   boolean check3(int num){
       this.valore += 1;  
       return num == 3;
   }
   boolean check4(int num){
       this.valore += 1;  
       return num == 4;
   }
   void reset(){
       this.valore = 0;
   }
}
