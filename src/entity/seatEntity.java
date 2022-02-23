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
class seatEntity {
    
    private String columnLetre;
    private int rowNumber;
    private boolean occupiedSeat;

    public seatEntity() {
        occupiedSeat = false;
    }

    public seatEntity(String columnLetre, int rowNumber, boolean occupiedSeat) {
        this.columnLetre = columnLetre;
        this.rowNumber = rowNumber;
        this.occupiedSeat = occupiedSeat = false;
    }

    public String getColumnLetre() {
        return columnLetre;
    }

    public void setColumnLetre(String columnLetre) {
        this.columnLetre = columnLetre;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public boolean isOccupiedSeat() {
        return occupiedSeat;
    }

    public void setOccupiedSeat(boolean occupiedSeat) {
        this.occupiedSeat = occupiedSeat;
    }

    @Override
    public String toString() {
        return "seatEntity{" + "columnLetre=" + columnLetre + ", rowNumber=" + rowNumber + ", occupiedSeat=" + occupiedSeat + '}';
    }
    
    
   
}
