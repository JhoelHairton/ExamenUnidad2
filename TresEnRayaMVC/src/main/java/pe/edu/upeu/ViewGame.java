/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class ViewGame extends javax.swing.JFrame {

    /**
     * Creates new form ViewGame
     */
    private JLabel[][] casillas;
    
    public ViewGame() {
        casillas = new JLabel[3][3];
        initComponents();
        asignarCasillas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla6 = new javax.swing.JLabel();
        casilla3 = new javax.swing.JLabel();
        casilla4 = new javax.swing.JLabel();
        casilla5 = new javax.swing.JLabel();
        casilla7 = new javax.swing.JLabel();
        casilla1 = new javax.swing.JLabel();
        casilla2 = new javax.swing.JLabel();
        casilla9 = new javax.swing.JLabel();
        casilla8 = new javax.swing.JLabel();
        botonReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        victoriasJ2 = new javax.swing.JLabel();
        victoriasJ1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        casilla6.setBackground(new java.awt.Color(255, 255, 255));
        casilla6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla6.setOpaque(true);

        casilla3.setBackground(new java.awt.Color(255, 255, 255));
        casilla3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla3.setOpaque(true);

        casilla4.setBackground(new java.awt.Color(255, 255, 255));
        casilla4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla4.setOpaque(true);

        casilla5.setBackground(new java.awt.Color(255, 255, 255));
        casilla5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla5.setOpaque(true);

        casilla7.setBackground(new java.awt.Color(255, 255, 255));
        casilla7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla7.setOpaque(true);

        casilla1.setBackground(new java.awt.Color(255, 255, 255));
        casilla1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla1.setOpaque(true);

        casilla2.setBackground(new java.awt.Color(255, 255, 255));
        casilla2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla2.setOpaque(true);

        casilla9.setBackground(new java.awt.Color(255, 255, 255));
        casilla9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla9.setOpaque(true);

        casilla8.setBackground(new java.awt.Color(255, 255, 255));
        casilla8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casilla8.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(casilla1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(casilla4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casilla7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(casilla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(casilla5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(casilla4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casilla6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(casilla7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(casilla8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casilla9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 300));

        botonReset.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        botonReset.setText("Volver a Jugar");
        getContentPane().add(botonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("EVALUACION UNIDAD 2");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("ESTUDIANTE: Jhoel Hairton Apaza Quispe");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

        victoriasJ2.setBackground(new java.awt.Color(255, 204, 204));
        victoriasJ2.setFont(new java.awt.Font("Oswald", 3, 24)); // NOI18N
        victoriasJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoriasJ2.setText("0");
        victoriasJ2.setOpaque(true);

        victoriasJ1.setBackground(new java.awt.Color(255, 204, 204));
        victoriasJ1.setFont(new java.awt.Font("Oswald", 3, 24)); // NOI18N
        victoriasJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoriasJ1.setText("0");
        victoriasJ1.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(255, 204, 204));
        jLabel12.setText("Jugador 2");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(255, 204, 204));
        jLabel13.setText("Jugador 1");
        jLabel13.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton1.setText("INICIAR ");

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton2.setText("ANULAR");

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(victoriasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(victoriasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addGap(179, 179, 179))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(victoriasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(victoriasJ1)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReset;
    private javax.swing.JLabel casilla1;
    private javax.swing.JLabel casilla2;
    private javax.swing.JLabel casilla3;
    private javax.swing.JLabel casilla4;
    private javax.swing.JLabel casilla5;
    private javax.swing.JLabel casilla6;
    private javax.swing.JLabel casilla7;
    private javax.swing.JLabel casilla8;
    private javax.swing.JLabel casilla9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel victoriasJ1;
    private javax.swing.JLabel victoriasJ2;
    // End of variables declaration//GEN-END:variables

    private void asignarCasillas() {
        casillas[0][0] = casilla1;
        casillas[0][1] = casilla2;
        casillas[0][2] = casilla3;
        casillas[1][0] = casilla4;
        casillas[1][1] = casilla5;
        casillas[1][2] = casilla6;
        casillas[2][0] = casilla7;
        casillas[2][1] = casilla8;
        casillas[2][2] = casilla9;
    }
    public JLabel[][] getCasillas(){
        return casillas;
    }
    public JLabel getVictoriasJ1(){
        return victoriasJ1;
    }
    public JLabel getVictoriasJ2(){
        return victoriasJ2;
    }
    public JButton getBotonReset(){
        return botonReset;
    }
}