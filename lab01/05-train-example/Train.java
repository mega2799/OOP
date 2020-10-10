class Train{
    int nTotSeats;  
    int nFirstClassSeats;
    int nSecondClassSeats; 
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    Train(int nTotSeats,int nFirstClassSeats,int nSecondClassSeats,int nFirstClassReservedSeats, int nSecondClassReservedSeats){
     this.nTotSeats = nTotSeats;
     this.nFirstClassSeats= nFirstClassSeats;
     this.nSecondClassSeats= nSecondClassSeats;
     this.nFirstClassReservedSeats= 0;
     this.nSecondClassReservedSeats= 0;
    }
    
    void reserveFirstClass(int res){
        this.nFirstClassReservedSeats += res;
    }
    void reserveSecondClass(int res){
        this.nSecondClassReservedSeats += res;
    }
    double getTotOccupancyRatio(){
        double t = this.nTotSeats - this.nFirstClassReservedSeats - this.nSecondClassReservedSeats;
        t /= this.nTotSeats;
        return t*100;
    }
    double getFirstClassOccupancyRatio(){
        double t = this.nFirstClassSeats - this.nFirstClassReservedSeats;
        t /= this.nFirstClassSeats;
        return t*100;
    }
    double getSecondClassOccupancyRatio(){
        double t = this.nTotSeats - this.nFirstClassReservedSeats - this.nSecondClassReservedSeats;
        t /= this.nSecondClassSeats;
        return t*100;
    }
    void deleteAllReservations(){
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}


/*- `void reserveFirstClassSeats(int)` (consente di riservare dei posti in prima classe)
    - `void reserveSecondClassSeats(int)` (consente di riservare dei posti in seconda classe)
    - `double getTotOccupancyRatio()` (percentuale globale di posti occupati)
    - `double getFirstClassOccupancyRatio()` (percentuale posti occupati in prima classe)
    - `double getSecondClassOccupancyRatio()` (percentuale posti occupati in seconda classe)
    - `void deleteAllReservations()` (annulla tutte le prenotazioni)
    * *Nota*: Si gestisca correttamente la conversione da `int` a `double` all'atto del calcolo della percentuale di posti occupati. Si fa presente che le operazioni fra tipi primitivi in Java funzionano allo stesso modo delle operazioni fra `int` e `double` in C (compilato per processori a 64bit) - chiedere al docente o al tutor in caso di dubbi.
2. Si completi la classe `UseTrain` seguendo i commenti in essa contenuti
3. Si compili e si esegua*/
