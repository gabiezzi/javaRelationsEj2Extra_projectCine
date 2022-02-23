/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Gabi
 */
public enum enumCinemaRow {

    A("A"), B("B"), C("C"), D("D"), E("E"), F("F");

    private String row;

    private enumCinemaRow() {
    }

    private enumCinemaRow(String row) {
        this.row = row;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
    
    

}
