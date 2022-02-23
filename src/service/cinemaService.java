/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import enums.enumCinemaRow;

/**
 *
 * @author Gabi
 */
public interface cinemaService {

    public cinemaService createCinema() {

        for (int i = 0; i < 6; i++) {

            for (enumCinemaRow unitaryRow : enumCinemaRow.values()) {
                String aux = unitaryRow.getRow();

                for (int j = 8; j > 0; j--) {
                    
                 seatEntity newSeat =   
                    

                }
            }

        }

    }

}
