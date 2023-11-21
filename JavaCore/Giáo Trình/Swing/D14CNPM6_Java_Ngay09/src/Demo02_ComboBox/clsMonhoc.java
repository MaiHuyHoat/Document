package Demo02_ComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class clsMonhoc {
    String Mamon;
    String Temon;

    public clsMonhoc() {
    }

    public clsMonhoc(String Mamon, String Temon) {
        this.Mamon = Mamon;
        this.Temon = Temon;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }

    public String getTemon() {
        return Temon;
    }

    public void setTemon(String Temon) {
        this.Temon = Temon;
    }
    //ghi đè hàm toString để trả về nội dung cần hiển thị 
    @Override
    public String toString() {
        return Mamon + " - " + Temon;
    }
    
}
