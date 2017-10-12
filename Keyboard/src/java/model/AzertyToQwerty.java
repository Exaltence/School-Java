/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shaun
 */
public class AzertyToQwerty implements IKeyboard {

    private Map<Character, Character> keys;

    public AzertyToQwerty() {
        keys = new HashMap();
        
        keys.put('A', 'Q');
        keys.put('a', 'q'); 
        keys.put('Z', 'W');
        keys.put('z', 'w');
        keys.put('Q', 'A'); 
        keys.put('q', 'a');
        keys.put('M', ':'); 
        keys.put('w', 'z');
        keys.put('W', 'Z');
        keys.put('m', ':');
        keys.put(',', 'M');  
        
        keys.put('²', '`');
        keys.put('&', '1');
        keys.put('é', '2');
        keys.put('"', '3');
        keys.put('\'', '4');
        keys.put('(', '5');
        keys.put('§', '6');
        keys.put('è', '7');
        keys.put('!', '8');
        keys.put('ç', '9');
        keys.put('à', '0');
        keys.put(')', '-');
        keys.put('-', '=');
        
        keys.put('³', '~');
        keys.put('1', '!');
        keys.put('2', '@');
        keys.put('3', '#');
        keys.put('4', '$');
        keys.put('5', '%');
        keys.put('6', '^');
        keys.put('7', '&');
        keys.put('8', '*');
        keys.put('9', '(');
        keys.put('0', ')');
        keys.put(')', '_');
        keys.put('-', '+');
        
        keys.put('^', '[');
        keys.put('$', ']');
        keys.put('ù', '\'');
        keys.put('µ', '\\');
        keys.put(';', ',');
        keys.put(':', '.');
        keys.put('=', '/');
        
        keys.put('¨', '{');
        keys.put('*', '}');
        keys.put('%', '"');
        keys.put('£', '|');
        keys.put('.', '<');
        keys.put('/', '>');
        keys.put('+', '?');
    }

    @Override
    //getOrDefault(Object key, V defaultValue)
    //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key
    public char Translate(char input) {
        return keys.getOrDefault(input, input);
    }
}
