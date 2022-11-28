/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import pe.edu.upeu.gui.MainJuego;

/**
 *
 * @author Usuario
 */
public class ControladorGamer {
    private MainJuego view;
    private ModeloGame model;
    private JButton[][] casillas;
    public ControladorGamer(MainJuego view, ModeloGame model){
        this.view = view;
        this.model = model;
        casillas = view.getCasillas();
        agregarListeners();
}

    private void agregarListeners() {
         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 agregarEventoMouse(i,j);
                }
            }   
         }

 
    private void agregarEventoMouse(int i, int j) {
        JButton casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.marcarCasilla(i,j,casillas);
            }
});
    
                