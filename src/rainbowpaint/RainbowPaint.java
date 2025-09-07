package rainbowpaint;

import javax.swing.UIManager;

public class RainbowPaint {

    public static void main(String[] args) {
        
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println("Disponível: " + info.getName() + " - " + info.getClassName());
        }

        System.out.println("Ativo em runtime: " + UIManager.getLookAndFeel().getName());
        try {
            

            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Agora cria e mostra a janela
        JanelaInicial jInicial = new JanelaInicial();
        jInicial.setVisible(true);
    }
}
