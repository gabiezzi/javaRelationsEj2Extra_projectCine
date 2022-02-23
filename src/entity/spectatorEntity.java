/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
class spectatorEntity {
    
    private String nameSpectator;
    private int ageSpectator;
    private double moneySpectator;

    public spectatorEntity() {
    }

    public spectatorEntity(String nameSpectator, int ageSpectator, double moneySpectator) {
        this.nameSpectator = nameSpectator;
        this.ageSpectator = ageSpectator;
        this.moneySpectator = moneySpectator;
    }

    public String getNameSpectator() {
        return nameSpectator;
    }

    public void setNameSpectator(String nameSpectator) {
        this.nameSpectator = nameSpectator;
    }

    public int getAgeSpectator() {
        return ageSpectator;
    }

    public void setAgeSpectator(int ageSpectator) {
        this.ageSpectator = ageSpectator;
    }

    public double getMoneySpectator() {
        return moneySpectator;
    }

    public void setMoneySpectator(double moneySpectator) {
        this.moneySpectator = moneySpectator;
    }

    @Override
    public String toString() {
        return "spectatorEntity{" + "nameSpectator=" + nameSpectator + ", ageSpectator=" + ageSpectator + ", moneySpectator=" + moneySpectator + '}';
    }
    
    
    
}
