/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Blessing
 */
public class FileWriter {

   
    public static void main(String[] args) throws IOException {
        
        //Reading the File
        File file=new File("C://Users/Reverside/Desktop/git.txt");
        Scanner scan=new Scanner(file);
        
        String fileContent="";
        
        while(scan.hasNextLine()){
        
            fileContent=fileContent.concat(scan.nextLine()+"\n");
        }
        
//       FileWriter writer=new FileWriter();
//       writer.
        
    }
    
}
