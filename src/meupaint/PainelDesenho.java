package meupaint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raiss
 */
public class PainelDesenho extends JPanel{
    
    private Forma formaTemp;
    
    private List<Forma> formas;
    
    private Stack<Forma> acoesDesfazer;
    private Stack<Forma> acoesRefazer;
   
    public PainelDesenho(){
        formas = new ArrayList<>();
        acoesDesfazer = new Stack<>();
        acoesRefazer = new Stack<>();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        
        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth()-1,getHeight()-1);
        
        
        if(formaTemp != null){
        formaTemp.desenhar(g);
        }
        
        for( Forma forma : formas){
            forma.desenhar(g);
        }
        
    }
    
    public void limpar(){
        formas.clear();
        acoesDesfazer.clear();
        acoesRefazer.clear();
        repaint();
    }

    public void setFormaTemp(Forma forma) {
        this.formaTemp = forma;
    }
    
    
    public void addForma (Forma forma){
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
