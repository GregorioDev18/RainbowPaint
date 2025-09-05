/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rainbowpaint;

import java.awt.Graphics;

/**
 *
 * @author raiss
 */
public class Linha extends Forma{
    
    @Override
    public void desenhar( Graphics g){
        
        g = g.create();
        
        g.setColor( contorno );
        g.drawLine(x1, y1, x2, y2);
        
        g.dispose();
    }
            
}
