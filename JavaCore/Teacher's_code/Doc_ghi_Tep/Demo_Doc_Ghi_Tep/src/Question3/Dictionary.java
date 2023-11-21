/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author tmtruong
 */
public class Dictionary {
    
    HashMap<String,String> hm = new HashMap<String,String>();
    
    public void DocFile(String filename)
    {
        FileReader fr=null;
        BufferedReader br=null;
        String line;
     
        //Doc file va dem so lan xuat hien cua tung tu
        try
        {
            fr = new FileReader(filename); //Moi file dang van ban
            br = new BufferedReader(fr);
            //Doc tung dong cua file vua duoc mo
            while( (line = br.readLine())!=null )
            {
                String words[] = line.split(":");
                hm.put(words[0], words[1]);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Loi khong tim thay file");
        }
        catch(IOException e)
        {
            System.out.println("Loi doc file");
        }
        finally
        {
            try
            {
                br.close();
                fr.close();
            }
            catch(IOException e)
            {
                System.out.println("Loi dong file");
            }
        }        
    }
    public String lookup(String word)
    {
        return hm.get(word);
    }
    public void Tratu()
    {
        String word;
        String meaning;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Moi nhap tu can tra:");
            word = input.nextLine();
            
            if(!word.equals(""))
            {
                meaning = this.lookup(word);
                if(meaning ==  null)
                {
                    System.out.println("Tu ban can tra chua co trong tu dien");
                }
                else
                {
                    System.out.println("Nghia cua tu can tra la: " + meaning);
                }
            }   
            else
            {
                System.out.println("Nhan ENTER ket thuc");
                input.nextLine();
            }
        }while(!word.equals(""));
        
    }
    public static void main(String [] args)
    {
        
        String filename;
        Scanner input = new Scanner(System.in);
        //Moi nhap ten file tu ban phim va doc file
        System.out.println("Moi nhap duong dan file tu dien:");
        filename = input.nextLine();
        File f = new File(filename);
        if(!f.exists())
        {
            System.out.println("File khong ton tai");
            System.exit(0);
        }
        
        Dictionary dic = new Dictionary();
        dic.DocFile(filename);
        dic.Tratu();
    }
}
