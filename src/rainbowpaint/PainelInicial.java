package rainbowpaint;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PainelInicial extends JPanel implements ActionListener {

    private final String titulo = "Rainbow Paint";
    private final Color[] cores = {
        Color.RED, Color.ORANGE, Color.YELLOW,
        Color.GREEN, Color.BLUE, new Color(75, 0, 130), new Color(148, 0, 211)
    };
    private final Font fonte = new Font("Comic Sans MS", Font.BOLD, 60);
    private final int tempo = 200;

    private String textoAtual = "";
    private int index = 0;
    private Image fundo;
    private Timer timer;

    public PainelInicial() {
        timer = new Timer(tempo, this);
        timer.start();

        fundo = new ImageIcon(getClass().getResource("/rainbowpaint/imgs/background.png")).getImage();

        setFont(fonte);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        aplicarSuavizacao(g2D);

        g2D.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);

        desenharTitulo(g2D);
    }

    private void aplicarSuavizacao(Graphics2D g2D) {
        g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    }

    private void desenharTitulo(Graphics2D g2D) {
        g2D.setFont(fonte);
        FontMetrics fm = g2D.getFontMetrics();

        int x = (getWidth() - fm.stringWidth(titulo)) / 2;
        int y = getHeight() / 3;

        for (int i = 0; i < textoAtual.length(); i++) {
            g2D.setColor(cores[i % cores.length]);
            String letra = String.valueOf(textoAtual.charAt(i));
            int letraX = x + fm.stringWidth(textoAtual.substring(0, i));
            g2D.drawString(letra, letraX, y);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (index < titulo.length()) {
            textoAtual += titulo.charAt(index);
            index++;
            repaint();
        } else {
            ((Timer) e.getSource()).stop();
        }
    }
}
