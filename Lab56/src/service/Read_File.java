/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Read_File {

    public static void main(String[] args) throws IOException {
        File filename = new File("r_ph26840.txt");
        try {
            FileInputStream fis = new FileInputStream(filename);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                char c = (char) i;
                System.out.print(c);    
             //    System.out.println("Ký tự Bạn vừa nhập: " + Character.toString(c));
            }
            System.out.println("");
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
