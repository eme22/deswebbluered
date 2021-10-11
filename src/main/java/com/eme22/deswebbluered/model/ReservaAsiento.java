package com.eme22.deswebbluered.model;

public class ReservaAsiento {

    private int reservaAsientoReservaID;
    private int reservaAsientoBusID;
    private int reservaAsientoAsientoID;
    private boolean reservaAsientoEsMenor;

    public ReservaAsiento(int reservaAsientoReservaID, int reservaAsientoBusID, int reservaAsientoAsientoID, boolean reservaAsientoEsMenor) {
        this.reservaAsientoReservaID = reservaAsientoReservaID;
        this.reservaAsientoBusID = reservaAsientoBusID;
        this.reservaAsientoAsientoID = reservaAsientoAsientoID;
        this.reservaAsientoEsMenor = reservaAsientoEsMenor;
    }

    public int getReservaAsientoReservaID() {
        return reservaAsientoReservaID;
    }

    public void setReservaAsientoReservaID(int reservaAsientoReservaID) {
        this.reservaAsientoReservaID = reservaAsientoReservaID;
    }

    public int getReservaAsientoBusID() {
        return reservaAsientoBusID;
    }

    public void setReservaAsientoBusID(int reservaAsientoBusID) {
        this.reservaAsientoBusID = reservaAsientoBusID;
    }

    public int getReservaAsientoAsientoID() {
        return reservaAsientoAsientoID;
    }

    public void setReservaAsientoAsientoID(int reservaAsientoAsientoID) {
        this.reservaAsientoAsientoID = reservaAsientoAsientoID;
    }

    public boolean isReservaAsientoEsMenor() {
        return reservaAsientoEsMenor;
    }

    public void setReservaAsientoEsMenor(boolean reservaAsientoEsMenor) {
        this.reservaAsientoEsMenor = reservaAsientoEsMenor;
    }
}
