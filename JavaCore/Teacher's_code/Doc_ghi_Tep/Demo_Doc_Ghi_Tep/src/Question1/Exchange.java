/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tmtruong
 */
public class Exchange {
    ArrayList<Rate> arr; //mang chua cac loai ty gia doc tu file Rate.txt
    
    public Exchange()
    {
        
        arr = new ArrayList<Rate>(); //tao doi tuong ArrayList
    }
    //Doc du lieu tu filename, luu cac ty gia vao mang arr
    private boolean ReadFromFile(String filename)
    {
        FileReader fr = null;
        BufferedReader br = null;
        boolean ok = false;
        try
        {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String str;
            //Doc tung dong cua tep
            while( (str = br.readLine())!=null )
            {
                //tach chuoi doc duoc thanh 3 chuoi con dua tren dau cham phay
                String[] strary = str.split(";");
                //gan 3 thanh phan tach duoc cho doi tuong Rate moi
                Rate r = new Rate(strary[0],strary[1],Double.parseDouble(strary[2])) ;
                //Dua rate moi doc duoc vao mang ArrayList
                arr.add(r);
            }
            for(Rate r : arr)
            {
                //System.out.println(r.toString());
                System.out.println(r);
            }
            ok = true;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Khong tim thay file");
            ok = false;
        }
        catch(IOException e)
        {
            System.out.println("Loi doc tep");
            ok = false;
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
                System.out.println("Loi dong tep");
            }
                    
        }
        return ok;
    }
    //Chuyen so tien amount tu don vi tien code1 sang don vi tien code2
    private double Convert(String code1, String code2, double amount)
    {
        double result=0.0;
        double rate=0.0;
        //duyet mang arr ke tim ra phan tu co code1 va code2 tuong ung voi tham so truyen vao
        for(int i=0; i<arr.size(); i++)
        {
            //if( arr.get(i).CODE1.equals(code1) &&  arr.get(i).CODE2.equals(code2) )
            if( arr.get(i).CODE1.equalsIgnoreCase(code1)
                    &&  arr.get(i).CODE2.equalsIgnoreCase(code2))
            {
                rate = arr.get(i).rate;
                break;
            }
        }
        result = amount * rate;
        return result;
    }
    
    //1.Moi nguoi dung nhap ten file ty gia
    //2.Nhap don vi tien can chuyen va tong so tien. 
    //3.Hien thi ket qua
    public void doExchange()
    {
       String filename;
       boolean ok;
       String code1, code2;
       double amount;
       double result;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the name of text file: ");
       filename = input.nextLine();
       
       File f = new File(filename);
       if( f.exists() ) //Neu tep ton tai
       {
            ok = this.ReadFromFile(filename); //Doc noi dung cua file va luu vao mang arr
            if(ok)
            {
                System.out.println("Enter the first currency code:");
                code1 = input.nextLine();
                System.out.println("Enter the second currency code:");
                code2 = input.nextLine();
                System.out.println("Enter the amount of first currency:");
                amount = input.nextDouble();
                result = this.Convert(code1, code2, amount);
                if(result > 0.0)
                {
                    System.out.println("The amount after converted:" + result);
                }
                else //neu result =0 nghia la don vi tien te nhap vao khong co trong danh sach
                {
                    System.out.print("Invalid currency code");
                }
            } 
       }
       else //Tep khong ton tai
       {
            System.out.println("Tep khong ton tai");
       }
    }
    public static void main(String[] args)
    {
        Exchange ex = new Exchange();
        ex.doExchange();
    }
}
