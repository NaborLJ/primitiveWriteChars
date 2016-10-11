/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivewritechars;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class PrimitiveWriteChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String cadea="";
        String aux;
       
    File texto4 = new File("/home/oracle/NetBeansProjects/primitiveWriteChars/texto4.txt");
        texto4.createNewFile();
        DataOutputStream textdout = new DataOutputStream(new FileOutputStream("texto4.txt",true));
        DataInputStream textdin = new DataInputStream(new FileInputStream("texto4.txt"));
        textdout.writeChars("esta e unha cadea\n");
        System.out.println("writeChars escribiu: "+textdout.size());
        aux=""+textdout.size();
        System.out.println("writeChars escribiu en bytes :"+textdout.size());
        textdout.writeChars("esta e unha cadea\n");
        
        System.out.println("writeChars escribiu total: "+textdout.size());
        textdout.close();
        System.out.println("lemos a primeira cadea en Chars: ");
            for(int i = 0;i<18;i++){
        cadea+=textdin.readChar();
            }
        System.out.println(cadea);
        System.out.println("Numero de bytes leidos : "+aux);
        cadea="";
        System.out.println("lemos a segunda cadea en Chars: ");
            for(int i = 0;i<18;i++){
        cadea+=textdin.readChar();
            }    
        System.out.println(cadea);
        System.out.println("Numero de bytes leidos : "+aux);
        System.out.println("numero de bytes disponibeis: "+textdin.available());
        
        
        
    }
    
}
