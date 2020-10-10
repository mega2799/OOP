package oop.lab02.constructors;

public class Train {

    int nTotSeats;
    int nFCSeats;
    int nSCSeats;

    int nFCReservedSeats;
    int nSCReservedSeats;

    Train() {
        this.nTotSeats = 7000;
        this.nFCSeats = 2500;
        this.nSCSeats = 4500;
        this.nFCReservedSeats = 0;
        this.nSCReservedSeats = 0;
    }

    void reserveFCSeats(final int nSeats) {
        this.nFCReservedSeats += nSeats;
    }

    void reserveSCSeats(final int nSeats) {
        this.nSCReservedSeats += nSeats;
    }

    double getTotOccupancyRatio() {
        return (this.nFCReservedSeats + this.nSCReservedSeats) * 100d / this.nTotSeats;
    }

    double getFCOccupancyRatio() {
        return this.nFCReservedSeats * 100d / this.nFCSeats;
    }

    double getSCOccupancyRatio() {
        return this.nSCReservedSeats * 100d / this.nSCSeats;
    }

    void deleteAllReservations() {
        this.nFCReservedSeats = 0;
        this.nSCReservedSeats = 0;
    }
}
