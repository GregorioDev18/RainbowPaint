package rainbowpaint;

import rainbowpaint.shapes.Forma;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import java.util.Stack;

public class PainelDesenho extends JPanel {

    private Forma formaTemp;

    private final List<Forma> formas;

    private final Stack<Forma> acoesDesfazer;
    private final Stack<Forma> acoesRefazer;

    public PainelDesenho() {
        formas = new ArrayList<>();
        acoesDesfazer = new Stack<>();
        acoesRefazer = new Stack<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        aplicarSuavizacao(g2D);

        g2D.setColor(Color.BLACK);
        g2D.fillRect(0, 0, getWidth(), getHeight());

        g2D.setColor(Color.WHITE);
        g2D.fillRect(0, 0, getWidth() - 1, getHeight() - 1);

        if (formaTemp != null) {
            formaTemp.desenhar(g2D);
        }

        for (Forma forma : formas) {
            forma.desenhar(g2D);
        }
    }

    public static void aplicarSuavizacao(Graphics2D g2D) {
        g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    }

    public void limpar() {
        formas.clear();
        acoesDesfazer.clear();
        acoesRefazer.clear();
        repaint();
    }

    public void setFormaTemp(Forma forma) {
        this.formaTemp = forma;
    }

    public void addForma(Forma forma) {
        formas.add(forma);
        acoesDesfazer.push(forma);
        acoesRefazer.clear();
    }

    void refazer() {
        if (!acoesRefazer.isEmpty()) {
            Forma refazerForma = acoesRefazer.pop();
            formas.add(refazerForma);
            acoesDesfazer.push(refazerForma);
            repaint();
        }
    }

    void desfazer() {
        if (!acoesDesfazer.isEmpty()) {
            Forma ultima = acoesDesfazer.pop();
            formas.remove(ultima);
            acoesRefazer.push(ultima);
            repaint();
        }
    }
}
