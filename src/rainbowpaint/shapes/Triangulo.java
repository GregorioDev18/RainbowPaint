package rainbowpaint.shapes;

import java.awt.Graphics;

public class Triangulo extends Forma {

    @Override
    public void desenhar(Graphics g) {
        int x1d = Math.min(x1, x2);
        int y1d = Math.min(y1, y2);
        int x2d = Math.max(x1, x2);
        int y2d = Math.max(y1, y2);

        int[] xPoints = {x1d, x2d, (x1d + x2d) / 2};
        int[] yPoints = {y2d, y2d, y1d};

        g = g.create();
        g.setColor(preenchimento);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(contorno);
        g.drawPolygon(xPoints, yPoints, 3);
        g.dispose();
    }
}
