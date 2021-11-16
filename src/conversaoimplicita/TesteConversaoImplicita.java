/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaoimplicita;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class TesteConversaoImplicita {
    
    public static void main (String arg[]){
    
        ConversaoImplicita ex = new ConversaoImplicita();
        
        //abaixo se os valores forem colocados corretamente a função funciona com perfeição
        
        JOptionPane.showMessageDialog(null, "Quadrado de 3 = " + ex.retornaQuadradoNumero(3));
        
        /// ja neste caso se os valores forem inserido incorretamente o resultado será um retorno incorreto.
        JOptionPane.showMessageDialog(null, "Quadrado de 3 = " + ex.retornaQuadradoNumero('3'));
    
    }
    
}
