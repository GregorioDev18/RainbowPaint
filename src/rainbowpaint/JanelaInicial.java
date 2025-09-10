package rainbowpaint;

import javax.swing.SwingUtilities;

public class JanelaInicial extends javax.swing.JFrame {

    public JanelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInicial1 = new rainbowpaint.PainelInicial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rainbow Paint");
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().add(painelInicial1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rainbowpaint.PainelInicial painelInicial1;
    // End of variables declaration//GEN-END:variables
}
