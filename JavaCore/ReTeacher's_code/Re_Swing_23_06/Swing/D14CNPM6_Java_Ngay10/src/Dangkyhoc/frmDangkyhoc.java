/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dangkyhoc;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tran Manh Truong
 */
public class frmDangkyhoc extends javax.swing.JFrame {

    /**
     * Creates new form frmDangkyhoc
     */
    public frmDangkyhoc() {
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
        btgGiohoc = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdSang = new javax.swing.JRadioButton();
        rdChieu = new javax.swing.JRadioButton();
        rdToi = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        ckTiengAnh = new javax.swing.JCheckBox();
        ckKyNangmem = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cbNganhHoc = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG KÝ HỌC");

        jLabel2.setText("Họ tên:");

        txtHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHotenActionPerformed(evt);
            }
        });

        jLabel3.setText("Giới tính:");

        btgGioitinh.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        btgGioitinh.add(rdNu);
        rdNu.setText("Nữ");

        jLabel4.setText("Giờ học:");

        btgGiohoc.add(rdSang);
        rdSang.setSelected(true);
        rdSang.setText("Sáng");
        rdSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSangActionPerformed(evt);
            }
        });

        btgGiohoc.add(rdChieu);
        rdChieu.setText("Chiều");

        btgGiohoc.add(rdToi);
        rdToi.setText("Tối");

        jLabel5.setText("Môn bổ sung:");

        ckTiengAnh.setText("Tiếng Anh");

        ckKyNangmem.setText("Kỹ năng mềm");

        jLabel6.setText("Ngành học:");

        cbNganhHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Ngành học", "Lập trình", "Đồ họa", "Quản trị mạng" }));

        btnThem.setText("THÊM VÀO DANH SÁCH");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Giới tính", "Giờ học", "Môn bổ sung", "Ngành học"
            }
        ));
        jScrollPane1.setViewportView(tblDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdNam)
                                    .addComponent(rdSang))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdNu)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdChieu)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdToi))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbNganhHoc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ckTiengAnh)
                                    .addGap(27, 27, 27)
                                    .addComponent(ckKyNangmem)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdNam)
                        .addComponent(rdNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSang)
                        .addComponent(rdChieu)
                        .addComponent(rdToi)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckTiengAnh)
                        .addComponent(ckKyNangmem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHotenActionPerformed

    private void rdSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSangActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String hoten = txtHoten.getText();
        if(hoten.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Chưa nhập họ tên");
            return;
        }
        String gioitinh = "Nam";
        if(rdNu.isSelected())
            gioitinh = "Nữ";
        String giohoc="";
        if(rdSang.isSelected())
            giohoc = "Sáng";
        else if(rdChieu.isSelected())
            giohoc = "Chiều";
        else
            giohoc = "Tối";
        String monbosung="";
        if(ckTiengAnh.isSelected())
            monbosung = "Tiếng Anh";
        if(ckKyNangmem.isSelected())
        {
            if(monbosung.equals(""))
                monbosung = "Kỹ năng mềm";
            else
                monbosung += ", Kỹ năng mềm";
        }
        //lấy mục chọn của ComboBox
        int i = cbNganhHoc.getSelectedIndex();
        if(i==0)//nếu chọn dòng đầu tiên
        {
            JOptionPane.showMessageDialog(this, "Chưa chọn Ngành học");
            return;
        }
        String nganhhoc = cbNganhHoc.getItemAt(i);
        //chèn 1 dòng chứa các thông tin trên vào JTable
        DefaultTableModel tbm = 
                (DefaultTableModel)tblDanhSach.getModel();
        //Object[] row = new Object[]{hoten,gioitinh,
        //                        giohoc,monbosung,nganhhoc};
        Vector row = new Vector();
        row.add(hoten); row.add(gioitinh);row.add(giohoc);
        row.add(monbosung);row.add(nganhhoc);
        tbm.addRow(row);
        //tbm.addRow(new Object[]{hoten,gioitinh,
        //                        giohoc,monbosung,nganhhoc});
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(frmDangkyhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangkyhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangkyhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangkyhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangkyhoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGiohoc;
    private javax.swing.ButtonGroup btgGioitinh;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbNganhHoc;
    private javax.swing.JCheckBox ckKyNangmem;
    private javax.swing.JCheckBox ckTiengAnh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdChieu;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JRadioButton rdSang;
    private javax.swing.JRadioButton rdToi;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtHoten;
    // End of variables declaration//GEN-END:variables
}
