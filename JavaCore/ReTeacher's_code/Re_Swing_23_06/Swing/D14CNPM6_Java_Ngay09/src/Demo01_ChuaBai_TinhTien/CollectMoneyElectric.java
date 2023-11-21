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
public class CollectMoneyElectric extends CollectMoney{
    private int chisodau;
    private int chisocuoi;
    public final int dongia = 2500;//khai báo hằng bằng từ khóa final

    public CollectMoneyElectric() {
    }

    public CollectMoneyElectric(int chisodau, int chisocuoi) {
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
    }

    public int getChisodau() {
        return chisodau;
    }

    public void setChisodau(int chisodau) {
        if(chisodau>=0)
            this.chisodau = chisodau;
    }

    public int getChisocuoi() {
        return chisocuoi;
    }

    public void setChisocuoi(int chisocuoi) {
        if(chisocuoi>=0)
        this.chisocuoi = chisocuoi;
    }
    
    @Override
    public double calculateMoney()
    {
        int chisotieuthu = chisocuoi-chisodau;
        if(chisotieuthu<100)
            ThanhTien = chisotieuthu*dongia;
        else if(chisotieuthu>=100&&chisotieuthu<300)
            ThanhTien = chisotieuthu*dongia*1.05;
        else
            ThanhTien = chisotieuthu*dongia*1.1;
        return ThanhTien;
    }
}
