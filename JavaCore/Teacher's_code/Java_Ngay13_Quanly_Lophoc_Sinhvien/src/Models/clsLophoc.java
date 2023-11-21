/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Tran Manh Truong
 */
public class clsLophoc {
    int Malop;
    String Tenlop;
    public clsLophoc()
    {
        Malop =0;
        Tenlop="";
    }
    public clsLophoc(int malop, String tenlop)
    {
        Malop =malop;
        Tenlop=tenlop;
    }
    public int getMalop()
    {
        return Malop;
        
    }
    public void setMalop(int malop)
    {
        Malop = malop;
    }
    public String getTenlop()
    {
        return Tenlop;
    }
    public void setTenlop(String tenlop)
    {
        Tenlop = tenlop;
    }
    @Override
    public String toString() {
        return Tenlop ;
    }  
}
