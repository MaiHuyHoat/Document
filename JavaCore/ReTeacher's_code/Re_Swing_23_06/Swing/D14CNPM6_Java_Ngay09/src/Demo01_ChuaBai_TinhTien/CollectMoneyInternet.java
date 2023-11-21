/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo01_ChuaBai_TinhTien;

/**
 *
 * @author Tran Manh Truong
 */
public class CollectMoneyInternet extends CollectMoney{
    private int sothang;
    public final int dongia = 285000;

    public CollectMoneyInternet() {
    }

    public CollectMoneyInternet(int sothang) {
        this.sothang = sothang;
    }

    public int getSothang() {
        return sothang;
    }

    public void setSothang(int sothang) {
        if(sothang>0)
        this.sothang = sothang;
    }
    @Override
    public double calculateMoney()
    {
        if(sothang<3)
            ThanhTien = sothang*dongia;
        else if(sothang>=3 && sothang<6)
            ThanhTien = sothang*dongia*0.95;
        else
            ThanhTien = sothang*dongia*0.9;
       return ThanhTien;
    }
}
