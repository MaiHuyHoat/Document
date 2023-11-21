/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Question2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author tmtruong
 */
public class WordAppears {
    //doc du lieu tu file van ban co ten filename
    //tinh so lan xuat hien cua moi tu, luu vao bien hm
    //Cot trai la tu doc duoc, cot phai so lan xuat hien
    public static void DocFile(String filename, HashMap hm)
    {
        FileReader fr=null;
        BufferedReader br=null;
        String line;
        StringTokenizer stk;
        try
        {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            while( (line = br.readLine())!=null )//doc tung dong cua file van ban luu vao bien line
            {
                stk = new StringTokenizer(line); //dung StringTokenizer de tach dong line thanh nhieu tu dua tren dau cach
                String word;
                while( stk.hasMoreTokens() ) //duyet cac tu tac duoc
                {
                    word = stk.nextToken(); //lay tu tach duoc luu vao bien word
                    if(hm.containsKey(word)) //neu word da ton tai trong danh sach key cua hm, thi tang so lan xuat hien (value) len 1 don vi
                    {
                        Integer n = (Integer) hm.get(word);//lay gia tri hien tai cua tu dang co
                        int m = n.intValue();
                        m++; //tang 1 do vi
                        hm.put(word, m); //gan lai word nay vao hm
                    }
                    else//neu word chua co trong keys cua hm thi them vao voi so lan xuat hien la 1
                    {
                        hm.put(word,1);
                    }
                }
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
    
    //Hien thi noi dung cua hm len man hinh
    public static void Hienthi(HashMap hm)
    {
        for(Object k : hm.keySet())
        {
            Integer n = (Integer)hm.get(k);
            System.out.println(k + " : " + n);
        }
    }
    public static void main(String[] args)
    {
        String filename;
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        //Moi nhap ten file luu vao bien filename
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap ten file van ban:");
        filename = input.nextLine();
        //Kiem tra file ton tai khong?
        File f = new File(filename);
        if(!f.exists())
        {
            System.out.println("File khong ton tai");
            System.exit(0);
        }
        //Goi ham Docfile de doc du lieu va luu ket qua vao hm
        DocFile(filename,hm);
        //Hienthi ket qua
        Hienthi(hm);
    }
}
