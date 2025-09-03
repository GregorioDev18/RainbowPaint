/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author raiss
 */
public class JanelaTeste extends JFrame{
    
    private JButton botao;
    
    public JanelaTeste(){
        setTitle("Minha Janela de Teste");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        
        botao = new JButton("clique aqui");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi");
            }
            
        });
        
        setLayout(new FlowLayout());
        add(botao);
        
    }
    
   public static void main(String[] args){
       JanelaTeste janela = new JanelaTeste();
       janela.setVisible(true);
   }
    
}
