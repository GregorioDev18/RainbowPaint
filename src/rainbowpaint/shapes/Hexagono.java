package rainbowpaint.shapes;

import java.awt.Graphics;

public class Hexagono extends Forma {

    @Override
    public void desenhar(Graphics g) {
        int x1d = Math.min(x1, x2);
        int y1d = Math.min(y1, y2);
        int x2d = Math.max(x1, x2);
        int y2d = Math.max(y1, y2);

        int largura = x2d - x1d;
        int altura = y2d - y1d;

        int centroX = (x1d + x2d) / 2;
        int centroY = (y1d + y2d) / 2;

        int raio = Math.min(largura, altura) / 2;

        int[] xPoints = new int[6];
        int[] yPoints = new int[6];

        for (int i = 0; i < 6; i++) {
            xPoints[i] = (int) (centroX + raio * Math.cos(Math.toRadians(60 * i)));
            yPoints[i] = (int) (centroY + raio * Math.sin(Math.toRadians(60 * i)));
        }

        g = g.create();
        g.setColor(preenchimento);
        g.fillPolygon(xPoints, yPoints, 6);
        g.setColor(contorno);
        g.drawPolygon(xPoints, yPoints, 6);
        g.dispose();
    }
}
