
package App;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel{
    private static final long serialVersionUID = 1L;
	private JFrame ventana;
	
    public Menu(JFrame ventana){
        ventana.setTitle("Menu Principal - Consultor");
        ventana.setSize(570, 700);
        ventana.setVisible(true);
        this.ventana = ventana;
         initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCandidatos = new javax.swing.JPanel();
        btnGestionarPreguntas = new javax.swing.JButton();
        btnGestionarFactores = new javax.swing.JButton();
        btnGestionarPuesto = new javax.swing.JButton();
        btnGestionarCompetencias = new javax.swing.JButton();
        panelSalidas = new javax.swing.JPanel();
        btnEmitirOdern = new javax.swing.JButton();
        btnEmitirReporte = new javax.swing.JButton();
        btnExportarResultados = new javax.swing.JButton();
        salirMenuPPal = new javax.swing.JButton();
        //jTextField1 = new javax.swing.JTextField();
        panelEvaluaciones = new javax.swing.JPanel();
        btnEvaluarCandidatos = new javax.swing.JButton();
        btnImportatCandidatos = new javax.swing.JButton();
        btnGestionarCandidatos = new javax.swing.JButton();

        panelCandidatos.setBackground(new java.awt.Color(255, 255, 255));
        panelCandidatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candidatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btnGestionarPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarPreguntas.setForeground(new java.awt.Color(0, 102, 255));
        btnGestionarPreguntas.setText("Gestionar Preguntas");
        btnGestionarPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPreguntasActionPerformed(evt);
            }
        });

        btnGestionarFactores.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarFactores.setForeground(new java.awt.Color(0, 102, 255));
        btnGestionarFactores.setText("Gestionar Factores");

        btnGestionarPuesto.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarPuesto.setForeground(new java.awt.Color(0, 102, 255));
        btnGestionarPuesto.setText("Gestionar Puesto");
        btnGestionarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPuestoActionPerformed(evt);
            }
        });

        btnGestionarCompetencias.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarCompetencias.setForeground(new java.awt.Color(0, 102, 255));
        btnGestionarCompetencias.setText("Gestionar Competencias");

        javax.swing.GroupLayout panelCandidatosLayout = new javax.swing.GroupLayout(panelCandidatos);
        panelCandidatos.setLayout(panelCandidatosLayout);
        panelCandidatosLayout.setHorizontalGroup(
            panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCandidatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCandidatosLayout.createSequentialGroup()
                        .addComponent(btnGestionarFactores, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGestionarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCandidatosLayout.createSequentialGroup()
                        .addComponent(btnGestionarCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGestionarPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCandidatosLayout.setVerticalGroup(
            panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCandidatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionarPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionarFactores, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSalidas.setBackground(new java.awt.Color(255, 255, 255));
        panelSalidas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btnEmitirOdern.setBackground(new java.awt.Color(255, 255, 255));
        btnEmitirOdern.setForeground(new java.awt.Color(0, 102, 255));
        btnEmitirOdern.setText("Emitir Orden de Merito");

        btnEmitirReporte.setBackground(new java.awt.Color(255, 255, 255));
        btnEmitirReporte.setForeground(new java.awt.Color(0, 102, 255));
        btnEmitirReporte.setText("Emitir Reporte Comparativo");

        btnExportarResultados.setBackground(new java.awt.Color(255, 255, 255));
        btnExportarResultados.setForeground(new java.awt.Color(0, 102, 255));
        btnExportarResultados.setText("Exportar Resultados");

        javax.swing.GroupLayout panelSalidasLayout = new javax.swing.GroupLayout(panelSalidas);
        panelSalidas.setLayout(panelSalidasLayout);
        panelSalidasLayout.setHorizontalGroup(
            panelSalidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelSalidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEmitirReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportarResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEmitirOdern, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSalidasLayout.setVerticalGroup(
            panelSalidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelSalidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmitirOdern, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportarResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmitirReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salirMenuPPal.setBackground(new java.awt.Color(255, 255, 255));
        salirMenuPPal.setForeground(new java.awt.Color(0, 0, 0));
        salirMenuPPal.setText("Salir");
        salirMenuPPal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuPPalActionPerformed(evt);
            }
        });

        //jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        panelEvaluaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelEvaluaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btnEvaluarCandidatos.setBackground(new java.awt.Color(255, 255, 255));
        btnEvaluarCandidatos.setForeground(new java.awt.Color(0, 102, 255));
        btnEvaluarCandidatos.setText("Evaluar Candidatos");

        btnImportatCandidatos.setBackground(new java.awt.Color(255, 255, 255));
        btnImportatCandidatos.setForeground(new java.awt.Color(0, 102, 255));
        btnImportatCandidatos.setText("Importar Candidatos");

        btnGestionarCandidatos.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarCandidatos.setForeground(new java.awt.Color(0, 102, 255));
        btnGestionarCandidatos.setText("Gestionar Candidatos");

        javax.swing.GroupLayout panelEvaluacionesLayout = new javax.swing.GroupLayout(panelEvaluaciones);
        panelEvaluaciones.setLayout(panelEvaluacionesLayout);
        panelEvaluacionesLayout.setHorizontalGroup(
            panelEvaluacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEvaluacionesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelEvaluacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImportatCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEvaluacionesLayout.createSequentialGroup()
                        .addComponent(btnGestionarCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEvaluarCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEvaluacionesLayout.setVerticalGroup(
            panelEvaluacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEvaluacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelEvaluacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEvaluarCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImportatCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEvaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        //.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salirMenuPPal)
                        .addGap(225, 225, 225))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(panelCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEvaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salirMenuPPal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                //.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void btnGestionarPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPreguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarPreguntasActionPerformed

    private void btnGestionarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPuestoActionPerformed
  
      ventana.setContentPane(new GestionarPuesto(ventana, this));
    }//GEN-LAST:event_btnGestionarPuestoActionPerformed

    private void salirMenuPPalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuPPalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirMenuPPalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirOdern;
    private javax.swing.JButton btnEmitirReporte;
    private javax.swing.JButton btnEvaluarCandidatos;
    private javax.swing.JButton btnExportarResultados;
    private javax.swing.JButton btnGestionarCandidatos;
    private javax.swing.JButton btnGestionarCompetencias;
    private javax.swing.JButton btnGestionarFactores;
    private javax.swing.JButton btnGestionarPreguntas;
    private javax.swing.JButton btnGestionarPuesto;
    private javax.swing.JButton btnImportatCandidatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCandidatos;
    private javax.swing.JPanel panelEvaluaciones;
    private javax.swing.JPanel panelSalidas;
    private javax.swing.JButton salirMenuPPal;
    // End of variables declaration//GEN-END:variables
}
