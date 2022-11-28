/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.modelo;

import lombok.Data;

/**
 *
 * @author Usuario
 */

@Data
public class ResultadoTO {
    public int idResultado, punto;
    public String nombrepartida, nombrejugador1, nombrejugador2, ganador, estado; 
    
}
