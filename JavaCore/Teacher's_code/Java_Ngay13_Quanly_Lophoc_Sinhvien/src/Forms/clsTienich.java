/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import CSDL.tbLophoc;
import Models.clsLophoc;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Tran Manh Truong
 */
public class clsTienich {
    //hiển thị danh sách lớp lên JComboBox
    //chonmalop để tự động chọn dòng có mã lớp tương ứng
    public static void ComboBoxLophoc(JComboBox cbb, int chonmalop)
    {
        Vector<clsLophoc> dsLophoc = new Vector<clsLophoc>();
        int ketqua = tbLophoc.LayDSLop(dsLophoc);
        if(ketqua>0)
        {
            //chèn các lớp học vào cbbLophoc
            //khi chèn mảng chứa các đối tượng là clsLophoc thì Java sẽ tự động
            //lấy chuỗi trả vể bởi hàm toString() của lớp để hiển thị lên combobox
            DefaultComboBoxModel cbm = new DefaultComboBoxModel(dsLophoc);
            cbb.setModel(cbm);
            cbm.insertElementAt("Chọn lớp học", 0);
            cbb.setSelectedIndex(0);
        }
    }
}
