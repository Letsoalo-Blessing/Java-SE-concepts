/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package JavaIO;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Blessing
 */
public class FileReader {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        //Reading the File
        File file=new File("C://Users/Reverside/Desktop/git.txt");
        
        //Add content into file
        Scanner scan =new Scanner(file);
        
        while (scan.hasNext()) {
           System.out.println(scan.nextLine());
        }
        
        
    }
    
}
