/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shaun
 */
public class Keyboard {

    private IKeyboard ikeyboard;

    public Keyboard(IKeyboard ikeyboard) {
        this.ikeyboard = ikeyboard;
    }
    
    //"vertaalt" ingegeven string char per char en plaatst deze in nieuwe string
    public String Translate(String input) {

        char translation;
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            translation = executeITranslate(input.charAt(i));
            output += translation;
        }

        return output;
    }
    
    
    public char executeITranslate(char input) {
        return ikeyboard.Translate(input);
    }
    public void setKeyboard(IKeyboard keyboard){
        ikeyboard = keyboard;
    }
}
