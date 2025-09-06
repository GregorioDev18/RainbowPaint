package rainbowpaint;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

public class JanelaPrincipal extends javax.swing.JFrame {

    private Forma forma;
    private final ImageIcon undo;
    private final ImageIcon redo;
    private final ImageIcon square;

    public JanelaPrincipal() {
        initComponents();
        undo = new ImageIcon(getClass().getResource("/rainbowpaint/undo.png"));
        redo = new ImageIcon(getClass().getResource("/rainbowpaint/redo.png"));
        square = new ImageIcon(getClass().getResource("/rainbowpaint/square.png"));

        btnDesfazer.setIcon(new ImageIcon(undo.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        btnRefazer.setIcon(new ImageIcon(redo.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        btnRetangulo.setIcon(new ImageIcon(square.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        painelDesenho = new rainbowpaint.PainelDesenho();
        btnDesfazer = new javax.swing.JButton();
        btnRefazer = new javax.swing.JButton();
        jpSideBar = new javax.swing.JPanel();
        painelFormas = new javax.swing.JPanel();
        btnLinhas = new javax.swing.JToggleButton();
        btnRetangulo = new javax.swing.JToggleButton();
        btnElipse = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JButton();
        painelContorno = new javax.swing.JPanel();
        painelPreenchimento = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MeuPaint");

        painelDesenho.setPreferredSize(new java.awt.Dimension(900, 500));
        painelDesenho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseDragged(evt);
            }
        });
        painelDesenho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelDesenhoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseReleased(evt);
            }
        });

        btnDesfazer.setBackground(new java.awt.Color(255, 255, 255));
        btnDesfazer.setForeground(new java.awt.Color(255, 255, 255));
        btnDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/undo.png"))); // NOI18N
        btnDesfazer.setBorder(null);
        btnDesfazer.setBorderPainted(false);
        btnDesfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesfazer.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/undo.png"))); // NOI18N
        btnDesfazer.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/undo.png"))); // NOI18N
        btnDesfazer.setFocusPainted(false);
        btnDesfazer.setFocusable(false);
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        btnRefazer.setBackground(new java.awt.Color(255, 255, 255));
        btnRefazer.setForeground(new java.awt.Color(255, 255, 255));
        btnRefazer.setBorder(null);
        btnRefazer.setBorderPainted(false);
        btnRefazer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefazerActionPerformed(evt);
            }
        });

        jpSideBar.setBackground(new java.awt.Color(0, 0, 0));
        jpSideBar.setName("sideBar"); // NOI18N

        painelFormas.setBackground(new java.awt.Color(0, 0, 0));
        painelFormas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153)), "Shapes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(204, 0, 204))); // NOI18N
        painelFormas.setForeground(new java.awt.Color(153, 0, 153));
        painelFormas.setFocusable(false);

        btnLinhas.setBackground(new java.awt.Color(153, 0, 153));
        buttonGroup.add(btnLinhas);
        btnLinhas.setForeground(new java.awt.Color(255, 255, 255));
        btnLinhas.setSelected(true);
        btnLinhas.setText("Linha");
        btnLinhas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup.add(btnRetangulo);
        btnRetangulo.setForeground(new java.awt.Color(255, 255, 255));
        btnRetangulo.setBorder(null);
        btnRetangulo.setBorderPainted(false);
        btnRetangulo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/redo.png"))); // NOI18N
        btnRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetanguloActionPerformed(evt);
            }
        });

        btnElipse.setBackground(new java.awt.Color(204, 0, 204));
        buttonGroup.add(btnElipse);
        btnElipse.setForeground(new java.awt.Color(255, 255, 255));
        btnElipse.setText("Elipse");

        javax.swing.GroupLayout painelFormasLayout = new javax.swing.GroupLayout(painelFormas);
        painelFormas.setLayout(painelFormasLayout);
        painelFormasLayout.setHorizontalGroup(
            painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormasLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElipse)
                    .addComponent(btnLinhas)
                    .addComponent(btnRetangulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFormasLayout.setVerticalGroup(
            painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLinhas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnElipse)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnLimpar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        painelContorno.setBackground(new java.awt.Color(0, 0, 0));
        painelContorno.setToolTipText("cor do Contorno");
        painelContorno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelContorno.setPreferredSize(new java.awt.Dimension(20, 20));
        painelContorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelContornoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelContornoLayout = new javax.swing.GroupLayout(painelContorno);
        painelContorno.setLayout(painelContornoLayout);
        painelContornoLayout.setHorizontalGroup(
            painelContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        painelContornoLayout.setVerticalGroup(
            painelContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        painelPreenchimento.setBackground(new java.awt.Color(255, 255, 255));
        painelPreenchimento.setToolTipText("cor do Preenchimento");
        painelPreenchimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        painelPreenchimento.setPreferredSize(new java.awt.Dimension(20, 20));
        painelPreenchimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelPreenchimentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelPreenchimentoLayout = new javax.swing.GroupLayout(painelPreenchimento);
        painelPreenchimento.setLayout(painelPreenchimentoLayout);
        painelPreenchimentoLayout.setHorizontalGroup(
            painelPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        painelPreenchimentoLayout.setVerticalGroup(
            painelPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpSideBarLayout = new javax.swing.GroupLayout(jpSideBar);
        jpSideBar.setLayout(jpSideBarLayout);
        jpSideBarLayout.setHorizontalGroup(
            jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideBarLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpSideBarLayout.createSequentialGroup()
                        .addComponent(painelPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpar))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFormas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpSideBarLayout.setVerticalGroup(
            jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFormas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addGroup(jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelContorno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelPreenchimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout painelDesenhoLayout = new javax.swing.GroupLayout(painelDesenho);
        painelDesenho.setLayout(painelDesenhoLayout);
        painelDesenhoLayout.setHorizontalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesenhoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE)
                .addComponent(jpSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelDesenhoLayout.setVerticalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDesenhoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesfazer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefazer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jpSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelDesenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMousePressed
        if (btnLinhas.isSelected()) {
            forma = new Linha();

        } else if (btnRetangulo.isSelected()) {
            forma = new Retangulo();

        } else if (btnElipse.isSelected()) {
            forma = new Elipse();
        }
        forma.setX1(evt.getX());
        forma.setY1(evt.getY());
        forma.setContorno(painelContorno.getBackground());
        forma.setPreenchimento(painelPreenchimento.getBackground());
    }//GEN-LAST:event_painelDesenhoMousePressed

    private void painelDesenhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseReleased
        forma.setX2(evt.getX());
        forma.setY2(evt.getY());
        painelDesenho.addForma(forma);
        painelDesenho.setFormaTemp(null);

        painelDesenho.repaint();
    }//GEN-LAST:event_painelDesenhoMouseReleased

    private void painelDesenhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseDragged
        forma.setX2(evt.getX());
        forma.setY2(evt.getY());
        painelDesenho.setFormaTemp(forma);

        painelDesenho.repaint();
    }//GEN-LAST:event_painelDesenhoMouseDragged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        painelDesenho.limpar();
        painelDesenho.repaint();
        painelDesenho.refazer();
        painelDesenho.desfazer();
    }//GEN-LAST:event_btnLimparMouseClicked

    private void painelDesenhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_painelDesenhoMouseClicked

    private void painelContornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelContornoMouseClicked
        Color c = JColorChooser.showDialog(
                this, "Cor do contorno", painelContorno.getBackground());

        if (c != null) {
            painelContorno.setBackground(c);
        }
    }//GEN-LAST:event_painelContornoMouseClicked

    private void painelPreenchimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelPreenchimentoMouseClicked
        Color c = JColorChooser.showDialog(
                this, "Cor do preenchimento", painelPreenchimento.getBackground());

        if (c != null) {
            painelPreenchimento.setBackground(c);
        }
    }//GEN-LAST:event_painelPreenchimentoMouseClicked

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazerActionPerformed
        painelDesenho.desfazer();
    }//GEN-LAST:event_btnDesfazerActionPerformed

    private void btnRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefazerActionPerformed
        painelDesenho.refazer();
    }//GEN-LAST:event_btnRefazerActionPerformed

    private void btnRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetanguloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JToggleButton btnElipse;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JToggleButton btnLinhas;
    private javax.swing.JButton btnRefazer;
    private javax.swing.JToggleButton btnRetangulo;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel jpSideBar;
    private javax.swing.JPanel painelContorno;
    private rainbowpaint.PainelDesenho painelDesenho;
    private javax.swing.JPanel painelFormas;
    private javax.swing.JPanel painelPreenchimento;
    // End of variables declaration//GEN-END:variables
}
