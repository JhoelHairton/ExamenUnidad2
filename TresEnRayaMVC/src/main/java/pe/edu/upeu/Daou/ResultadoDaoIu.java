/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Daou;

import java.util.List;
import pe.edu.upeu.modelo1.ResultadoTOA;

/**
 *
 * @author Usuario
 */
public interface ResultadoDaoIu {
     public List listarResultados();
   public int crearResultado(ResultadoTOA re);
}
