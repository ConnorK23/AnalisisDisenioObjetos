/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dapda
 */
public class JavaIO extends IO {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    public String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            this.write(title);
            try {
                input = bufferedReader.readLine();
                ok = true;
            } catch(IOException ex) {
                this.writeError("de cadena de caracteres");
            }
        } while(!ok); 
        return input;
    }
    
    public int readInt (String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(this.readString(title));
                ok = true;
            } catch (NumberFormatException ex) {
                this.writeError("entero");
            }
        } while (!ok);
        return input;
    }
    
    public char readChar (String title) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = this.readString(title);
            if(input.length() != 1) {
                this.writeError("caracter");
            } else {
                charValue = input.charAt(0);
                ok = true;
            }
        } while (!ok);
        return charValue;
    }
    
    public void writeln() {
        System.out.println();
    }
    
    public void write(String string) {
        System.out.println(string);
    }
    
    public void writeln(String string) {
        System.out.println(string);
    }
    
    private void writeError(String formato) {
        System.out.println("ERROR DE FORMATO! Introduzca un valor con formato " + formato + "." );
    }
}
