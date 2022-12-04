/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.evaluacion2;

import pe.edu.upeu.evaluacion2.gui.ControladorJuego;
import pe.edu.upeu.evaluacion2.gui.MainJuego;
import pe.edu.upeu.evaluacion2.gui.ModeloJuego;


public class Evaluacion2 {

    public static void main(String[] args) {
        ModeloJuego model = new ModeloJuego();
        MainJuego view = new MainJuego();
        ControladorJuego controlador = new ControladorJuego(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true); //
    }
}
