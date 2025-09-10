package rainbowpaint;

import rainbowpaint.shapes.Retangulo;
import rainbowpaint.shapes.Linha;
import rainbowpaint.shapes.Forma;
import rainbowpaint.shapes.Elipse;
import java.awt.Color;
import javax.swing.JColorChooser;
import rainbowpaint.shapes.Hexagono;
import rainbowpaint.shapes.Lapis;
import rainbowpaint.shapes.Triangulo;

public class JanelaPrincipal extends javax.swing.JFrame {

    private Forma forma;

    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgShapes = new javax.swing.ButtonGroup();
        bgFilling = new javax.swing.ButtonGroup();
        bgOutline = new javax.swing.ButtonGroup();
        painelDesenho = new rainbowpaint.PainelDesenho();
        btnDesfazer = new javax.swing.JButton();
        btnRefazer = new javax.swing.JButton();
        jpSideBar = new javax.swing.JPanel();
        painelFormas = new javax.swing.JPanel();
        btnLinha = new javax.swing.JToggleButton();
        btnRetangulo = new javax.swing.JToggleButton();
        btnElipse = new javax.swing.JToggleButton();
        btnTriangulo = new javax.swing.JToggleButton();
        btnLapis = new javax.swing.JToggleButton();
        btnHexagono = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JButton();
        painelCores = new javax.swing.JPanel();
        fRed = new javax.swing.JToggleButton();
        fOrange = new javax.swing.JToggleButton();
        fYellow = new javax.swing.JToggleButton();
        fGreen = new javax.swing.JToggleButton();
        fBlue = new javax.swing.JToggleButton();
        fIndigo = new javax.swing.JToggleButton();
        fViolet = new javax.swing.JToggleButton();
        fPick = new javax.swing.JToggleButton();
        fWhite = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        oRed = new javax.swing.JToggleButton();
        oOrange = new javax.swing.JToggleButton();
        oYellow = new javax.swing.JToggleButton();
        oGreen = new javax.swing.JToggleButton();
        oBlue = new javax.swing.JToggleButton();
        oAnil = new javax.swing.JToggleButton();
        oViolet = new javax.swing.JToggleButton();
        oPick = new javax.swing.JToggleButton();
        oBlack = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();

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

        btnDesfazer.setForeground(new java.awt.Color(255, 255, 255));
        btnDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/undo.png"))); // NOI18N
        btnDesfazer.setBorder(null);
        btnDesfazer.setBorderPainted(false);
        btnDesfazer.setContentAreaFilled(false);
        btnDesfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDesfazer.setDefaultCapable(false);
        btnDesfazer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedUndo.png"))); // NOI18N
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        btnRefazer.setForeground(new java.awt.Color(255, 255, 255));
        btnRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/redo.png"))); // NOI18N
        btnRefazer.setBorderPainted(false);
        btnRefazer.setContentAreaFilled(false);
        btnRefazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRefazer.setDefaultCapable(false);
        btnRefazer.setMaximumSize(new java.awt.Dimension(30, 30));
        btnRefazer.setMinimumSize(new java.awt.Dimension(30, 30));
        btnRefazer.setPreferredSize(new java.awt.Dimension(30, 30));
        btnRefazer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedRedo.png"))); // NOI18N
        btnRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefazerActionPerformed(evt);
            }
        });

        jpSideBar.setBackground(new java.awt.Color(0, 0, 0));
        jpSideBar.setName("sideBar"); // NOI18N
        jpSideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelFormas.setBackground(new java.awt.Color(0, 0, 0));
        painelFormas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153)), "Shapes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(204, 102, 255))); // NOI18N
        painelFormas.setFocusable(false);

        btnLinha.setBackground(new java.awt.Color(204, 0, 204));
        bgShapes.add(btnLinha);
        btnLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/line.png"))); // NOI18N
        btnLinha.setBorder(null);
        btnLinha.setBorderPainted(false);
        btnLinha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLinha.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLinha.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedLine.png"))); // NOI18N
        btnLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinhaActionPerformed(evt);
            }
        });

        btnRetangulo.setBackground(new java.awt.Color(204, 0, 204));
        bgShapes.add(btnRetangulo);
        btnRetangulo.setForeground(new java.awt.Color(255, 255, 255));
        btnRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/rectangle.png"))); // NOI18N
        btnRetangulo.setBorder(null);
        btnRetangulo.setBorderPainted(false);
        btnRetangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRetangulo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRetangulo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedRectangle.png"))); // NOI18N
        btnRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetanguloActionPerformed(evt);
            }
        });

        btnElipse.setBackground(new java.awt.Color(204, 0, 204));
        bgShapes.add(btnElipse);
        btnElipse.setForeground(new java.awt.Color(255, 255, 255));
        btnElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/elipse.png"))); // NOI18N
        btnElipse.setBorder(null);
        btnElipse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElipse.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnElipse.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedElipse.png"))); // NOI18N

        bgShapes.add(btnTriangulo);
        btnTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/triangle.png"))); // NOI18N
        btnTriangulo.setBorder(null);
        btnTriangulo.setBorderPainted(false);
        btnTriangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTriangulo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedTriangle.png"))); // NOI18N
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        bgShapes.add(btnLapis);
        btnLapis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/pencil.png"))); // NOI18N
        btnLapis.setSelected(true);
        btnLapis.setBorder(null);
        btnLapis.setBorderPainted(false);
        btnLapis.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedPencil.png"))); // NOI18N
        btnLapis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapisActionPerformed(evt);
            }
        });

        bgShapes.add(btnHexagono);
        btnHexagono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/hexagon.png"))); // NOI18N
        btnHexagono.setBorder(null);
        btnHexagono.setBorderPainted(false);
        btnHexagono.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedHexagon.png"))); // NOI18N

        javax.swing.GroupLayout painelFormasLayout = new javax.swing.GroupLayout(painelFormas);
        painelFormas.setLayout(painelFormasLayout);
        painelFormasLayout.setHorizontalGroup(
            painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLapis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormasLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHexagono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelFormasLayout.setVerticalGroup(
            painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelFormasLayout.createSequentialGroup()
                        .addComponent(btnLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRetangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormasLayout.createSequentialGroup()
                        .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnElipse)
                            .addComponent(btnLapis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelFormasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHexagono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpSideBar.add(painelFormas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 170, -1));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/eraser.png"))); // NOI18N
        btnLimpar.setBorder(null);
        btnLimpar.setBorderPainted(false);
        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedEraser.png"))); // NOI18N
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
        jpSideBar.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 417, -1, -1));

        painelCores.setBackground(new java.awt.Color(0, 0, 0));
        painelCores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filling", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(153, 102, 255))); // NOI18N
        painelCores.setPreferredSize(new java.awt.Dimension(76, 186));
        painelCores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelCoresMousePressed(evt);
            }
        });
        painelCores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fRed.setBackground(new java.awt.Color(255, 0, 0));
        bgFilling.add(fRed);
        fRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fRed.png"))); // NOI18N
        fRed.setBorder(null);
        fRed.setBorderPainted(false);
        fRed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fRed.setFocusPainted(false);
        fRed.setFocusable(false);
        fRed.setMaximumSize(new java.awt.Dimension(30, 30));
        fRed.setMinimumSize(new java.awt.Dimension(30, 30));
        fRed.setPreferredSize(new java.awt.Dimension(30, 30));
        fRed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFRed.png"))); // NOI18N
        fRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fRedMouseClicked(evt);
            }
        });
        fRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRedActionPerformed(evt);
            }
        });
        painelCores.add(fRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 43, 20, 20));

        fOrange.setBackground(new java.awt.Color(255, 102, 0));
        bgFilling.add(fOrange);
        fOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fOrange.png"))); // NOI18N
        fOrange.setBorder(null);
        fOrange.setBorderPainted(false);
        fOrange.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFOrange.png"))); // NOI18N
        painelCores.add(fOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 69, -1, -1));

        fYellow.setBackground(new java.awt.Color(255, 255, 0));
        bgFilling.add(fYellow);
        fYellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fYellow.png"))); // NOI18N
        fYellow.setBorder(null);
        fYellow.setBorderPainted(false);
        fYellow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFYellow.png"))); // NOI18N
        painelCores.add(fYellow, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 95, -1, -1));

        fGreen.setBackground(new java.awt.Color(0, 255, 0));
        bgFilling.add(fGreen);
        fGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fGreen.png"))); // NOI18N
        fGreen.setBorder(null);
        fGreen.setBorderPainted(false);
        fGreen.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFGreen.png"))); // NOI18N
        painelCores.add(fGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 121, -1, -1));

        fBlue.setBackground(new java.awt.Color(0, 0, 255));
        bgFilling.add(fBlue);
        fBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fBlue.png"))); // NOI18N
        fBlue.setBorder(null);
        fBlue.setBorderPainted(false);
        fBlue.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFBlue.png"))); // NOI18N
        painelCores.add(fBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 147, -1, -1));

        fIndigo.setBackground(new java.awt.Color(25, 0, 130));
        bgFilling.add(fIndigo);
        fIndigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fAnil.png"))); // NOI18N
        fIndigo.setBorder(null);
        fIndigo.setBorderPainted(false);
        fIndigo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFAnil.png"))); // NOI18N
        painelCores.add(fIndigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 173, -1, -1));

        fViolet.setBackground(new java.awt.Color(127, 0, 255));
        bgFilling.add(fViolet);
        fViolet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fViolet.png"))); // NOI18N
        fViolet.setBorder(null);
        fViolet.setBorderPainted(false);
        fViolet.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFViolet.png"))); // NOI18N
        painelCores.add(fViolet, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 199, -1, -1));

        fPick.setBackground(fPick.getBackground());
        bgFilling.add(fPick);
        fPick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fPick.png"))); // NOI18N
        fPick.setBorder(null);
        fPick.setBorderPainted(false);
        fPick.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFPick.png"))); // NOI18N
        fPick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fPickMouseClicked(evt);
            }
        });
        painelCores.add(fPick, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 225, -1, -1));

        fWhite.setBackground(new java.awt.Color(255, 0, 0));
        bgFilling.add(fWhite);
        fWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fWhite.png"))); // NOI18N
        fWhite.setSelected(true);
        fWhite.setBorder(null);
        fWhite.setBorderPainted(false);
        fWhite.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fWhite.setFocusPainted(false);
        fWhite.setFocusable(false);
        fWhite.setMaximumSize(new java.awt.Dimension(30, 30));
        fWhite.setMinimumSize(new java.awt.Dimension(30, 30));
        fWhite.setPreferredSize(new java.awt.Dimension(30, 30));
        fWhite.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFWhite.png"))); // NOI18N
        fWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fWhiteMouseClicked(evt);
            }
        });
        fWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fWhiteActionPerformed(evt);
            }
        });
        painelCores.add(fWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 17, 20, 20));

        jpSideBar.add(painelCores, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, -1, 256));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(204, 102, 255)), "Outline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(153, 102, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(76, 186));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgOutline.add(oRed);
        oRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fRed.png"))); // NOI18N
        oRed.setBorder(null);
        oRed.setBorderPainted(false);
        oRed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFRed.png"))); // NOI18N
        jPanel1.add(oRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        bgOutline.add(oOrange);
        oOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fOrange.png"))); // NOI18N
        oOrange.setBorder(null);
        oOrange.setBorderPainted(false);
        oOrange.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFOrange.png"))); // NOI18N
        jPanel1.add(oOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 71, -1, -1));

        bgOutline.add(oYellow);
        oYellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fYellow.png"))); // NOI18N
        oYellow.setBorder(null);
        oYellow.setBorderPainted(false);
        oYellow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFYellow.png"))); // NOI18N
        jPanel1.add(oYellow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 97, -1, -1));

        bgOutline.add(oGreen);
        oGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fGreen.png"))); // NOI18N
        oGreen.setBorder(null);
        oGreen.setBorderPainted(false);
        oGreen.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFGreen.png"))); // NOI18N
        jPanel1.add(oGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 123, -1, -1));

        bgOutline.add(oBlue);
        oBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fBlue.png"))); // NOI18N
        oBlue.setBorder(null);
        oBlue.setBorderPainted(false);
        oBlue.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFBlue.png"))); // NOI18N
        jPanel1.add(oBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 149, -1, -1));

        bgOutline.add(oAnil);
        oAnil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fAnil.png"))); // NOI18N
        oAnil.setBorder(null);
        oAnil.setBorderPainted(false);
        oAnil.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFAnil.png"))); // NOI18N
        jPanel1.add(oAnil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, -1, -1));

        bgOutline.add(oViolet);
        oViolet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fViolet.png"))); // NOI18N
        oViolet.setBorder(null);
        oViolet.setBorderPainted(false);
        oViolet.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFViolet.png"))); // NOI18N
        jPanel1.add(oViolet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 201, -1, -1));

        bgOutline.add(oPick);
        oPick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fPick.png"))); // NOI18N
        oPick.setBorder(null);
        oPick.setBorderPainted(false);
        oPick.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFPick.png"))); // NOI18N
        oPick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oPickMouseClicked(evt);
            }
        });
        jPanel1.add(oPick, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 227, -1, -1));

        bgOutline.add(oBlack);
        oBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/fBlack.png"))); // NOI18N
        oBlack.setSelected(true);
        oBlack.setBorder(null);
        oBlack.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/imgs/selectedFBlack.png"))); // NOI18N
        jPanel1.add(oBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 19, -1, -1));

        jpSideBar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 128, -1, 256));
        jpSideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, 170, 10));

        javax.swing.GroupLayout painelDesenhoLayout = new javax.swing.GroupLayout(painelDesenho);
        painelDesenho.setLayout(painelDesenhoLayout);
        painelDesenhoLayout.setHorizontalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesenhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 610, Short.MAX_VALUE)
                .addComponent(jpSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelDesenhoLayout.setVerticalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(painelDesenhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelDesenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMousePressed
        if (btnLinha.isSelected()) {
            forma = new Linha();

        } else if (btnRetangulo.isSelected()) {
            forma = new Retangulo();

        } else if (btnElipse.isSelected()) {
            forma = new Elipse();

        } else if (btnTriangulo.isSelected()) {
            forma = new Triangulo();

        } else if (btnLapis.isSelected()) {
            forma = new Lapis();
            ((Lapis) forma).addPonto(evt.getX(), evt.getY());
        } else if (btnHexagono.isSelected()) {
            forma = new Hexagono();

        }

        forma.setX1(evt.getX());
        forma.setY1(evt.getY());

        if (fWhite.isSelected()) {
            forma.setPreenchimento(Color.WHITE);
        } else if (fRed.isSelected()) {
            forma.setPreenchimento(Color.RED);
        } else if (fOrange.isSelected()) {
            forma.setPreenchimento(Color.ORANGE);
        } else if (fYellow.isSelected()) {
            forma.setPreenchimento(Color.YELLOW);
        } else if (fGreen.isSelected()) {
            forma.setPreenchimento(Color.GREEN);
        } else if (fBlue.isSelected()) {
            forma.setPreenchimento(Color.BLUE);
        } else if (fIndigo.isSelected()) {
            forma.setPreenchimento(new Color(86, 5, 145));
        } else if (fViolet.isSelected()) {
            forma.setPreenchimento(new Color(127, 0, 255));
        } else if (fPick.isSelected()) {
            forma.setPreenchimento(fPick.getBackground());;
        }

        if (oBlack.isSelected()) {
            forma.setContorno(Color.BLACK);
        } else if (oRed.isSelected()) {
            forma.setContorno(Color.RED);
        } else if (oOrange.isSelected()) {
            forma.setContorno(Color.ORANGE);
        } else if (oYellow.isSelected()) {
            forma.setContorno(Color.YELLOW);
        } else if (oGreen.isSelected()) {
            forma.setContorno(Color.GREEN);
        } else if (oBlue.isSelected()) {
            forma.setContorno(Color.BLUE);
        } else if (oAnil.isSelected()) {
            forma.setContorno(new Color(86, 5, 145));
        } else if (oViolet.isSelected()) {
            forma.setContorno(new Color(127, 0, 255));
        } else if (oPick.isSelected()) {
            forma.setContorno(oPick.getBackground());
        }
    }//GEN-LAST:event_painelDesenhoMousePressed

    private void painelDesenhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseReleased
        if (forma instanceof Lapis lapis) {
            lapis.addPonto(evt.getX(), evt.getY());
        } else {
            forma.setX2(evt.getX());
            forma.setY2(evt.getY());
        }
        painelDesenho.addForma(forma);
        painelDesenho.setFormaTemp(null);
        painelDesenho.repaint();
    }//GEN-LAST:event_painelDesenhoMouseReleased

    private void painelDesenhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseDragged
        if (forma instanceof Lapis lapis) {
            lapis.addPonto(evt.getX(), evt.getY());
            painelDesenho.setFormaTemp(forma);
        } else {
            forma.setX2(evt.getX());
            forma.setY2(evt.getY());
            painelDesenho.setFormaTemp(forma);
        }
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

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazerActionPerformed
        painelDesenho.desfazer();
    }//GEN-LAST:event_btnDesfazerActionPerformed

    private void btnRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefazerActionPerformed
        painelDesenho.refazer();
    }//GEN-LAST:event_btnRefazerActionPerformed

    private void btnRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetanguloActionPerformed

    private void btnLapisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLapisActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLinhaActionPerformed

    private void fRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fRedActionPerformed

    private void fRedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fRedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fRedMouseClicked

    private void painelCoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelCoresMousePressed

    }//GEN-LAST:event_painelCoresMousePressed

    private void fWhiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fWhiteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fWhiteMouseClicked

    private void fWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fWhiteActionPerformed

    private void oPickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oPickMouseClicked
        Color c = JColorChooser.showDialog(this, "Outline Color", oPick.getBackground());

        if (c != null) {
            oPick.setBackground(c);
        }
    }//GEN-LAST:event_oPickMouseClicked

    private void fPickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPickMouseClicked
        Color c = JColorChooser.showDialog(this, "Outline Color", fPick.getBackground());

        if (c != null) {
            fPick.setBackground(c);
        }
    }//GEN-LAST:event_fPickMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFilling;
    private javax.swing.ButtonGroup bgOutline;
    private javax.swing.ButtonGroup bgShapes;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JToggleButton btnElipse;
    private javax.swing.JToggleButton btnHexagono;
    private javax.swing.JToggleButton btnLapis;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JToggleButton btnLinha;
    private javax.swing.JButton btnRefazer;
    private javax.swing.JToggleButton btnRetangulo;
    private javax.swing.JToggleButton btnTriangulo;
    private javax.swing.JToggleButton fBlue;
    private javax.swing.JToggleButton fGreen;
    private javax.swing.JToggleButton fIndigo;
    private javax.swing.JToggleButton fOrange;
    private javax.swing.JToggleButton fPick;
    private javax.swing.JToggleButton fRed;
    private javax.swing.JToggleButton fViolet;
    private javax.swing.JToggleButton fWhite;
    private javax.swing.JToggleButton fYellow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpSideBar;
    private javax.swing.JToggleButton oAnil;
    private javax.swing.JToggleButton oBlack;
    private javax.swing.JToggleButton oBlue;
    private javax.swing.JToggleButton oGreen;
    private javax.swing.JToggleButton oOrange;
    private javax.swing.JToggleButton oPick;
    private javax.swing.JToggleButton oRed;
    private javax.swing.JToggleButton oViolet;
    private javax.swing.JToggleButton oYellow;
    private javax.swing.JPanel painelCores;
    private rainbowpaint.PainelDesenho painelDesenho;
    private javax.swing.JPanel painelFormas;
    // End of variables declaration//GEN-END:variables
}
