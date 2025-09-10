package rainbowpaint.shapes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Lapis extends Forma {

    private final List<int[]> pontos;

    public Lapis() {
        pontos = new ArrayList<>();
    }

    public void addPonto(int x, int y) {
        pontos.add(new int[]{x, y});
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(contorno);

        for (int i = 1; i < pontos.size(); i++) {
            int[] p1 = pontos.get(i - 1);
            int[] p2 = pontos.get(i);

            g.drawLine(p1[0], p1[1], p2[0], p2[1]);
        }
    }
}
