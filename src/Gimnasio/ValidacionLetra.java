
package Gimnasio;

import java.awt.event.KeyEvent;


public class ValidacionLetra {


    Character s,e;
    
    public void soloLetras(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isLetter(s)){
            evt.consume();
        
        }
    
    }
    
    public void soloLetrasyEspacios(KeyEvent evt){
        e = evt.getKeyChar();
        if(!Character.isLetter(e) && e != KeyEvent.VK_ESCAPE){
            evt.consume();
        
        }
    }
    
    
    
    public void soloNumeros(KeyEvent evt){
        e = evt.getKeyChar();
        if(!Character.isDigit(e) && e != KeyEvent.VK_ESCAPE){
            evt.consume();
        
        }
    }
    
}
