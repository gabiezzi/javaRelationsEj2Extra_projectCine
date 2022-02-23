/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Gabi
 */
class cinemaEntity {
    
    ArrayList<spectatorEntity> spectators ;
    
    ArrayList<seatEntity> seats;

    public cinemaEntity(ArrayList<spectatorEntity> spectators, ArrayList<seatEntity> seats) {
        this.spectators = spectators;
        this.seats = seats;
    }

    public cinemaEntity() {
    }

    public ArrayList<spectatorEntity> getSpectators() {
        return spectators;
    }

    public void setSpectators(ArrayList<spectatorEntity> spectators) {
        this.spectators = spectators;
    }

    public ArrayList<seatEntity> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<seatEntity> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "cinemaEntity{" + "spectators=" + spectators + ", seats=" + seats + '}';
    }
    
    
    
    
}
