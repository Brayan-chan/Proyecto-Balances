package Inicio;

import java.awt.Color;

public class Inicio extends javax.swing.JFrame {

    int xMouse, yMouse;
    int red = 0;
    int green = 134;
    int blue = 190;
    
    int rojo = 0;
    int verde = 83;
    int azul = 117;
    
    public Inicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBase = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        PanelSesion = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        DefaultLogo = new javax.swing.JLabel();
        CerrarPanel = new javax.swing.JPanel();
        CerrarBoton = new javax.swing.JLabel();
        TextoNuevoBG = new java.awt.Label();
        TextoBGGuardados = new java.awt.Label();
        BotonNuevo = new javax.swing.JButton();
        BotonArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelBase.setBackground(new java.awt.Color(255, 255, 255));
        PanelBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelSuperior.setBackground(new java.awt.Color(78, 184, 223));
        PanelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSuperiorMouseDragged(evt);
            }
        });
        PanelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSuperiorMousePressed(evt);
            }
        });

        PanelSesion.setBackground(new java.awt.Color(255, 255, 255));
        PanelSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N

        DefaultLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo (1).png"))); // NOI18N

        javax.swing.GroupLayout PanelSesionLayout = new javax.swing.GroupLayout(PanelSesion);
        PanelSesion.setLayout(PanelSesionLayout);
        PanelSesionLayout.setHorizontalGroup(
            PanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSesionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DefaultLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelSesionLayout.setVerticalGroup(
            PanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(26, 26, 26))
            .addGroup(PanelSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DefaultLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        CerrarPanel.setPreferredSize(new java.awt.Dimension(40, 40));

        CerrarBoton.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        CerrarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CerrarBoton.setText("X");
        CerrarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarBotonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CerrarBotonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout CerrarPanelLayout = new javax.swing.GroupLayout(CerrarPanel);
        CerrarPanel.setLayout(CerrarPanelLayout);
        CerrarPanelLayout.setHorizontalGroup(
            CerrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        CerrarPanelLayout.setVerticalGroup(
            CerrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(PanelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addComponent(CerrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addComponent(CerrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(PanelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        TextoNuevoBG.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        TextoNuevoBG.setText("Crear Nuevo Balance General");

        TextoBGGuardados.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        TextoBGGuardados.setText("Balances General Guardados");

        BotonNuevo.setForeground(new java.awt.Color(153, 153, 153));
        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document2.png"))); // NOI18N
        BotonNuevo.setBorder(null);
        BotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseExited(evt);
            }
        });
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonArchivo.setForeground(new java.awt.Color(153, 153, 153));
        BotonArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder.png"))); // NOI18N
        BotonArchivo.setBorder(null);
        BotonArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonArchivoMouseExited(evt);
            }
        });
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBaseLayout = new javax.swing.GroupLayout(PanelBase);
        PanelBase.setLayout(PanelBaseLayout);
        PanelBaseLayout.setHorizontalGroup(
            PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBaseLayout.createSequentialGroup()
                .addGroup(PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBaseLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TextoNuevoBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBaseLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBaseLayout.createSequentialGroup()
                        .addComponent(BotonArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBaseLayout.createSequentialGroup()
                        .addComponent(TextoBGGuardados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        PanelBaseLayout.setVerticalGroup(
            PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseLayout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(BotonArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoNuevoBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoBGGuardados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
        BalancesGuardados newframe = new BalancesGuardados();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonArchivoActionPerformed

    private void PanelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMousePressed
     xMouse = evt.getX();
     yMouse = evt.getY();
    }//GEN-LAST:event_PanelSuperiorMousePressed

    private void PanelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_PanelSuperiorMouseDragged

    private void CerrarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBotonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarBotonMousePressed

    private void CerrarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBotonMouseClicked
      System.exit(0);
    }//GEN-LAST:event_CerrarBotonMouseClicked

    private void CerrarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBotonMouseEntered
        CerrarPanel.setBackground(Color.red);
    }//GEN-LAST:event_CerrarBotonMouseEntered

    private void CerrarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBotonMouseExited
        CerrarPanel.setBackground(Color.white);
    }//GEN-LAST:event_CerrarBotonMouseExited

    private void BotonNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseEntered
    Color customColor = new Color(red, green, blue);
        BotonNuevo.setBackground(customColor);
    }//GEN-LAST:event_BotonNuevoMouseEntered

    private void BotonNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseExited
        BotonNuevo.setBackground(Color.WHITE);
    }//GEN-LAST:event_BotonNuevoMouseExited

    private void BotonArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonArchivoMouseEntered
    Color customColor = new Color(red, green, blue);
        BotonArchivo.setBackground(customColor);
    }//GEN-LAST:event_BotonArchivoMouseEntered

    private void BotonArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonArchivoMouseExited
        BotonArchivo.setBackground(Color.WHITE);
    }//GEN-LAST:event_BotonArchivoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonArchivo;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JLabel CerrarBoton;
    private javax.swing.JPanel CerrarPanel;
    private javax.swing.JLabel DefaultLogo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JPanel PanelBase;
    private javax.swing.JPanel PanelSesion;
    private javax.swing.JPanel PanelSuperior;
    private java.awt.Label TextoBGGuardados;
    private java.awt.Label TextoNuevoBG;
    // End of variables declaration//GEN-END:variables
}
