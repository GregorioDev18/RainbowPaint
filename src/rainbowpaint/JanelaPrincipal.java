package rainbowpaint;

import rainbowpaint.shapes.Retangulo;
import rainbowpaint.shapes.Linha;
import rainbowpaint.shapes.Forma;
import rainbowpaint.shapes.Elipse;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
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
        btnLimpar = new javax.swing.JButton();
        painelCores = new javax.swing.JPanel();
        fRed = new javax.swing.JToggleButton();
        fOrange = new javax.swing.JToggleButton();
        fYellow = new javax.swing.JToggleButton();
        fGreen = new javax.swing.JToggleButton();
        fBlue = new javax.swing.JToggleButton();
        fIndigo = new javax.swing.JToggleButton();
        fViolet = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        painelContorno = new javax.swing.JPanel();
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

        btnDesfazer.setBackground(new java.awt.Color(255, 255, 255));
        btnDesfazer.setForeground(new java.awt.Color(255, 255, 255));
        btnDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/undo.png"))); // NOI18N
        btnDesfazer.setBorder(null);
        btnDesfazer.setBorderPainted(false);
        btnDesfazer.setContentAreaFilled(false);
        btnDesfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesfazer.setDefaultCapable(false);
        btnDesfazer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedUndo.png"))); // NOI18N
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        btnRefazer.setBackground(new java.awt.Color(255, 255, 255));
        btnRefazer.setForeground(new java.awt.Color(255, 255, 255));
        btnRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/redo.png"))); // NOI18N
        btnRefazer.setBorderPainted(false);
        btnRefazer.setContentAreaFilled(false);
        btnRefazer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefazer.setDefaultCapable(false);
        btnRefazer.setMaximumSize(new java.awt.Dimension(30, 30));
        btnRefazer.setMinimumSize(new java.awt.Dimension(30, 30));
        btnRefazer.setPreferredSize(new java.awt.Dimension(30, 30));
        btnRefazer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedRedo.png"))); // NOI18N
        btnRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefazerActionPerformed(evt);
            }
        });

        jpSideBar.setBackground(new java.awt.Color(0, 0, 0));
        jpSideBar.setName("sideBar"); // NOI18N

        painelFormas.setBackground(new java.awt.Color(0, 0, 0));
        painelFormas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153)), "Shapes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(204, 102, 255))); // NOI18N
        painelFormas.setFocusable(false);

        btnLinha.setBackground(new java.awt.Color(204, 0, 204));
        bgShapes.add(btnLinha);
        btnLinha.setForeground(new java.awt.Color(0, 0, 0));
        btnLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/line.png"))); // NOI18N
        btnLinha.setBorder(null);
        btnLinha.setBorderPainted(false);
        btnLinha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinha.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLinha.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedLine.png"))); // NOI18N
        btnLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinhaActionPerformed(evt);
            }
        });

        btnRetangulo.setBackground(new java.awt.Color(204, 0, 204));
        bgShapes.add(btnRetangulo);
        btnRetangulo.setForeground(new java.awt.Color(255, 255, 255));
        btnRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/rectangle.png"))); // NOI18N
        btnRetangulo.setBorder(null);
        btnRetangulo.setBorderPainted(false);
        btnRetangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetangulo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRetangulo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedRectangle.png"))); // NOI18N
        btnRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetanguloActionPerformed(evt);
            }
        });

        btnElipse.setBackground(new java.awt.Color(204, 0, 204));
        bgShapes.add(btnElipse);
        btnElipse.setForeground(new java.awt.Color(255, 255, 255));
        btnElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/elipse.png"))); // NOI18N
        btnElipse.setBorder(null);
        btnElipse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElipse.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnElipse.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedElipse.png"))); // NOI18N

        bgShapes.add(btnTriangulo);
        btnTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/triangle.png"))); // NOI18N
        btnTriangulo.setBorder(null);
        btnTriangulo.setBorderPainted(false);
        btnTriangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTriangulo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedTriangle.png"))); // NOI18N
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        bgShapes.add(btnLapis);
        btnLapis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/pencil.png"))); // NOI18N
        btnLapis.setSelected(true);
        btnLapis.setBorder(null);
        btnLapis.setBorderPainted(false);
        btnLapis.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedPencil.png"))); // NOI18N
        btnLapis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapisActionPerformed(evt);
            }
        });

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
                .addGap(30, 30, 30)
                .addComponent(btnElipse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/eraser.png"))); // NOI18N
        btnLimpar.setBorder(null);
        btnLimpar.setBorderPainted(false);
        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedEraser.png"))); // NOI18N
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

        painelCores.setBackground(new java.awt.Color(0, 0, 0));
        painelCores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filling", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(153, 102, 255))); // NOI18N
        painelCores.setPreferredSize(new java.awt.Dimension(76, 186));
        painelCores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelCoresMousePressed(evt);
            }
        });

        fRed.setBackground(new java.awt.Color(255, 0, 0));
        bgFilling.add(fRed);
        fRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/fRed.png"))); // NOI18N
        fRed.setSelected(true);
        fRed.setBorder(null);
        fRed.setBorderPainted(false);
        fRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fRed.setFocusPainted(false);
        fRed.setFocusable(false);
        fRed.setMaximumSize(new java.awt.Dimension(30, 30));
        fRed.setMinimumSize(new java.awt.Dimension(30, 30));
        fRed.setPreferredSize(new java.awt.Dimension(30, 30));
        fRed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rainbowpaint/selectedFRed.png"))); // NOI18N
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

        fOrange.setBackground(new java.awt.Color(255, 102, 0));
        bgFilling.add(fOrange);
        fOrange.setBorder(null);
        fOrange.setBorderPainted(false);

        fYellow.setBackground(new java.awt.Color(255, 255, 0));
        bgFilling.add(fYellow);
        fYellow.setBorder(null);
        fYellow.setBorderPainted(false);

        fGreen.setBackground(new java.awt.Color(0, 255, 0));
        bgFilling.add(fGreen);
        fGreen.setBorder(null);
        fGreen.setBorderPainted(false);

        fBlue.setBackground(new java.awt.Color(0, 0, 255));
        bgFilling.add(fBlue);
        fBlue.setBorder(null);
        fBlue.setBorderPainted(false);

        fIndigo.setBackground(new java.awt.Color(25, 0, 130));
        bgFilling.add(fIndigo);
        fIndigo.setBorder(null);
        fIndigo.setBorderPainted(false);

        fViolet.setBackground(new java.awt.Color(127, 0, 255));
        bgFilling.add(fViolet);
        fViolet.setBorder(null);
        fViolet.setBorderPainted(false);

        javax.swing.GroupLayout painelCoresLayout = new javax.swing.GroupLayout(painelCores);
        painelCores.setLayout(painelCoresLayout);
        painelCoresLayout.setHorizontalGroup(
            painelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCoresLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(painelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fRed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fIndigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fViolet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        painelCoresLayout.setVerticalGroup(
            painelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCoresLayout.createSequentialGroup()
                .addComponent(fRed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fIndigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fViolet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(204, 102, 255)), "Outline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(153, 102, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(76, 186));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(painelContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpSideBarLayout = new javax.swing.GroupLayout(jpSideBar);
        jpSideBar.setLayout(jpSideBarLayout);
        jpSideBarLayout.setHorizontalGroup(
            jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelFormas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpSideBarLayout.createSequentialGroup()
                                .addComponent(painelCores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jpSideBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addGap(32, 32, 32))
        );
        jpSideBarLayout.setVerticalGroup(
            jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFormas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(painelCores, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar)
                .addGap(26, 26, 26))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, Short.MAX_VALUE)
                .addComponent(jpSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelDesenhoLayout.setVerticalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDesenhoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesfazer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefazer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        }
        
        forma.setX1(evt.getX());
        forma.setY1(evt.getY());
        
        if (fRed.isSelected()) {
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
        }
        
        
        forma.setContorno(painelContorno.getBackground());
        
    }//GEN-LAST:event_painelDesenhoMousePressed

    private void painelDesenhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseReleased
        if (forma instanceof Lapis) {
            ((Lapis) forma).addPonto(evt.getX(), evt.getY());
        } else {
            forma.setX2(evt.getX());
            forma.setY2(evt.getY());
        }
        painelDesenho.addForma(forma);
        painelDesenho.setFormaTemp(null);
        painelDesenho.repaint();
    }//GEN-LAST:event_painelDesenhoMouseReleased

    private void painelDesenhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseDragged
        if (forma instanceof Lapis) {
            ((Lapis) forma).addPonto(evt.getX(), evt.getY());
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

    private void painelContornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelContornoMouseClicked
        Color c = JColorChooser.showDialog(this, "Cor do contorno", painelContorno.getBackground());

        if (c != null) {
            painelContorno.setBackground(c);
        }
    }//GEN-LAST:event_painelContornoMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFilling;
    private javax.swing.ButtonGroup bgShapes;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JToggleButton btnElipse;
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
    private javax.swing.JToggleButton fRed;
    private javax.swing.JToggleButton fViolet;
    private javax.swing.JToggleButton fYellow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpSideBar;
    private javax.swing.JPanel painelContorno;
    private javax.swing.JPanel painelCores;
    private rainbowpaint.PainelDesenho painelDesenho;
    private javax.swing.JPanel painelFormas;
    // End of variables declaration//GEN-END:variables
}
