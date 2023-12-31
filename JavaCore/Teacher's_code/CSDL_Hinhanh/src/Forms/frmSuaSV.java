/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import CSDL.tbSinhvien;
import Models.clsLophoc;
import Models.clsSinhvien;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tran Manh Truong
 */
public class frmSuaSV extends javax.swing.JFrame {
    frmQuanlySinhvien formQuanlySV;
    clsSinhvien sinhvien;
    String gioitinh;
    String tenlop;
    File ImageFile;
    /**
     * Creates new form frmThemSV
     */
    public frmSuaSV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioitinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        cbLophoc = new javax.swing.JComboBox<>();
        btDongY = new javax.swing.JButton();
        btDonglai = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnChonanh = new javax.swing.JButton();
        txtHinhanh = new javax.swing.JTextField();
        lblHinhanh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sửa thông tin sinh viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SỬA THÔNG TIN SINH VIÊN");

        jLabel2.setText("Mã sinh viên:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Giới tính:");

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Lớp học:");

        btgGioitinh.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        btgGioitinh.add(rdNu);
        rdNu.setText("Nữ");

        btDongY.setText("Đồng ý");
        btDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDongYActionPerformed(evt);
            }
        });

        btDonglai.setText("Đóng lại");
        btDonglai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDonglaiActionPerformed(evt);
            }
        });

        jLabel7.setText("Hình ảnh:");

        btnChonanh.setText("chọn");
        btnChonanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonanhActionPerformed(evt);
            }
        });

        lblHinhanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btDongY)
                                .addGap(113, 113, 113)
                                .addComponent(btDonglai))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdNam)
                                        .addGap(31, 31, 31)
                                        .addComponent(rdNu))
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtHoten, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtMaSV)
                                    .addComponent(cbLophoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnChonanh))
                            .addComponent(txtHinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbLophoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btDongY)
                            .addComponent(btDonglai)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnChonanh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblHinhanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtMaSV.setText(this.sinhvien.masv);
        txtHoten.setText(this.sinhvien.hoten);
        txtDiachi.setText(this.sinhvien.diachi);
        if(this.sinhvien.gioitinh==true)
            rdNam.setSelected(true);
        else
            rdNu.setSelected(true);
        
        clsTienich.ComboBoxLophoc(cbLophoc,0);
        cbLophoc.getModel().setSelectedItem(tenlop);
        
        txtHinhanh.setText(sinhvien.hinhanh);
        File fileAnh = new File("src/images/"+sinhvien.hinhanh);
        clsTienich.HienthiAnh_Label(fileAnh, lblHinhanh);
    }//GEN-LAST:event_formWindowOpened

    private void btDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongYActionPerformed
        // TODO add your handling code here:
        String masv = txtMaSV.getText();
        String hoten = txtHoten.getText();
        boolean gioitinh;
        if(rdNam.isSelected())
            gioitinh = true;
        else
            gioitinh = false;
        String diachi = txtDiachi.getText();
        int malop = 0;
        int i = cbLophoc.getSelectedIndex();
        if(i<=0)
        {
            JOptionPane.showMessageDialog(this, "Chọn lớp học");
            return;
        }
        else
        {
            clsLophoc lh = (clsLophoc) cbLophoc.getModel().getSelectedItem();
            malop = lh.getMalop();
           // JOptionPane.showMessageDialog(this, "Mã lớp: " + malop);
        }
        //xử lý phần ảnh
        String hinhanh = txtHinhanh.getText();
        //copy file ảnh từ thư mục chọn vào thư mục Images của dự án
        //copy ảnh vào thư mục src/Images/
            if (ImageFile != null) {
                //String img = ImageFile.getName();
                String filecopy = "src/Images/" + hinhanh;
                File fc = new File(filecopy);
                try {
                    Files.copy(ImageFile.toPath(), fc.toPath(),StandardCopyOption.REPLACE_EXISTING);
                    
                } catch (IOException ex) {
                    Logger.getLogger(frmThemSV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        //tạo đối tượng sinh viên và thêm vào bảng tbSinhvien
        clsSinhvien sv = new clsSinhvien(this.sinhvien.id,masv,hoten,gioitinh,diachi,malop,hinhanh);
        tbSinhvien bangSinhvien = new tbSinhvien();
        boolean kq = bangSinhvien.SuaSinhvien(sv);
        if(kq==true)
        {
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            formQuanlySV.HienthiDSSinhvien();
        }
        else
            JOptionPane.showMessageDialog(null, "Lỗi Sửa sinh viên");
    }//GEN-LAST:event_btDongYActionPerformed

    private void btDonglaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDonglaiActionPerformed
        // TODO add your handling code here:
        formQuanlySV.HienthiDSSinhvien();
        this.dispose();
    }//GEN-LAST:event_btDonglaiActionPerformed

    private void btnChonanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonanhActionPerformed
        // TODO add your handling code here:
        JFileChooser OpenFile = new JFileChooser();
        FileNameExtensionFilter fft =
        new FileNameExtensionFilter("Hình ảnh", new String[]{"jpg","jpeg","gif","png"} );
        OpenFile.addChoosableFileFilter(fft);
        int re = OpenFile.showOpenDialog(this);
        if(re == JFileChooser.APPROVE_OPTION)
        {
            ImageFile =  OpenFile.getSelectedFile();
            clsTienich.HienthiAnh_Label(ImageFile, lblHinhanh);
            String strTenNgaunhien = clsTienich.randomString(20);
            String strDuoitep = clsTienich.TypeFile(ImageFile.getName());
            String strTenTepAnh = strTenNgaunhien + "." + strDuoitep;
            txtHinhanh.setText(strTenTepAnh);
        }
    }//GEN-LAST:event_btnChonanhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSuaSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSuaSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSuaSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSuaSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSuaSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDongY;
    private javax.swing.JButton btDonglai;
    private javax.swing.ButtonGroup btgGioitinh;
    private javax.swing.JButton btnChonanh;
    private javax.swing.JComboBox<String> cbLophoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblHinhanh;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHinhanh;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMaSV;
    // End of variables declaration//GEN-END:variables
}
