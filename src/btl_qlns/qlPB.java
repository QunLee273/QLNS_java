/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlns;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class qlPB extends javax.swing.JFrame {

    ConnectDB cn = new ConnectDB();
    public qlPB() {
        initComponents();
        
        TablePB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ht_pb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_MPB = new javax.swing.JTextField();
        txt_tenPb = new javax.swing.JTextField();
        btn_themPB = new javax.swing.JButton();
        btn_suaPB = new javax.swing.JButton();
        btn_xoaPB = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        txt_tkPb = new javax.swing.JTextField();
        btn_tkob = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý phòng ban");

        ht_pb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaPB", "Tên PB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ht_pb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ht_pbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ht_pb);

        jLabel2.setText("MaPB:");

        jLabel3.setText("Tên PB:");

        btn_themPB.setText("Thêm");
        btn_themPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themPBActionPerformed(evt);
            }
        });

        btn_suaPB.setText("Sửa");
        btn_suaPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaPBActionPerformed(evt);
            }
        });

        btn_xoaPB.setText("Xóa");
        btn_xoaPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaPBActionPerformed(evt);
            }
        });

        btn_thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_thoat.setText("Quay lại");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        txt_tkPb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tkPbKeyReleased(evt);
            }
        });

        btn_tkob.setText("Tìm kiếm");
        btn_tkob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tkobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_MPB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addComponent(txt_tenPb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_themPB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_suaPB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_xoaPB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btn_thoat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_tkPb)
                        .addGap(18, 18, 18)
                        .addComponent(btn_tkob))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tkPb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tkob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_MPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tenPb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themPB)
                            .addComponent(btn_suaPB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_xoaPB)
                        .addGap(50, 50, 50)
                        .addComponent(btn_thoat)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablePB(){
        // Xóa dữ liệu hiện có trong bảng
        DefaultTableModel model = (DefaultTableModel) ht_pb.getModel();
        model.setRowCount(0);

        // Thực hiện truy vấn lấy dữ liệu từ cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Thay đổi câu truy vấn
            String query = "SELECT * FROM phongban;";
            rs = stmt.executeQuery(query);

            // Đổ dữ liệu từ ResultSet vào bảng
            while (rs.next()) {
                String maNV = rs.getString("MaPB");
                String tenPB = rs.getString("TenPB");

                // Thêm dữ liệu vào bảng
                model.addRow(new Object[]{maNV, tenPB});
            }

            // Đóng ResultSet, câu lệnh và kết nối
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btn_themPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themPBActionPerformed
        String mapb = txt_MPB.getText();
        String ten = txt_tenPb.getText();
        
        if (mapb.isEmpty() || ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống bất kỳ thông tin nào!", "Thông báo!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Thực hiện chèn dữ liệu vào cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Tạo và thực hiện câu truy vấn
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS SoLuong FROM PHONGBAN WHERE MaPB = '" + mapb + "'");
            
            // Lấy kết quả
            rs.next();
            int soLuong = rs.getInt("SoLuong");

            // Nếu mã phòng ban không tồn tại thì hiển thị thông báo
            if (soLuong != 0) {
                JOptionPane.showMessageDialog(this, "Mã phòng ban đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Tạo câu truy vấn chèn dữ liệu
            String query = "INSERT INTO phongban (MaPB, TenPB) "
                    + "VALUES ('" + mapb + "', '" + ten + "')";

            // Thực hiện câu truy vấn chèn dữ liệu
            stmt.executeUpdate(query);

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
            txt_MPB.setText("");
            txt_tenPb.setText("");
            
            // Đóng câu lệnh và kết nối
            stmt.close();
            conn.close();
            
            // Tải lại dữ liệu và hiển thị trong bảng
            TablePB();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_themPBActionPerformed

    private void displayDataFromTable(int row) {
        // Lấy dữ liệu từ bảng theo hàng được chọn
        String mapb = ht_pb.getValueAt(row, 0).toString();
        String ten = ht_pb.getValueAt(row, 1).toString();
        
        // Hiển thị dữ liệu lên các ô nhập liệu
        txt_MPB.setText(mapb);
        txt_tenPb.setText(ten);
    }
    
    private void ht_pbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht_pbMouseClicked
        ht_pb.setDefaultEditor(Object.class, null);
        ht_pb.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Lấy chỉ mục hàng được chọn
                int selectedRow = ht_pb.getSelectedRow();
                
                // Hiển thị dữ liệu từ hàng được chọn vào các ô nhập liệu
                displayDataFromTable(selectedRow);
            }
        });
    }//GEN-LAST:event_ht_pbMouseClicked

    private void btn_suaPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaPBActionPerformed
        // Lấy chỉ mục hàng được chọn trong bảng
        int selectedRow = ht_pb.getSelectedRow();

        // Kiểm tra xem có hàng nào được chọn không
        if (selectedRow == -1) {
            // Hiển thị thông báo lỗi nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy dữ liệu từ các thành phần trên form để sửa
        String mapb = txt_MPB.getText();
        String ten = txt_tenPb.getText();

        // Thực hiện cập nhật dữ liệu vào cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();
            
            if (mapb.isEmpty() || ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống bất kỳ thông tin nào!", "Thông báo!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }

            if (mapb.equals(ht_pb.getValueAt(selectedRow, 0))) {
                // MaNV không bị sửa
                
                // Tạo và thực hiện câu truy vấn
                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS SoLuong FROM PHONGBAN WHERE MaPB = '" + mapb + "'");

                // Lấy kết quả
                rs.next();
                int soLuong = rs.getInt("SoLuong");

                // Nếu mã phòng ban không tồn tại thì hiển thị thông báo
                if (soLuong == 0) {
                    JOptionPane.showMessageDialog(this, "Mã phòng ban không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Tạo câu truy vấn cập nhật dữ liệu
                String query = "UPDATE phongban SET TenPB = '" + ten + "' " 
                                + "WHERE MaPB = '" + mapb + "'";

                // Thực hiện câu truy vấn cập nhật dữ liệu
                stmt.executeUpdate(query);

                // Hiển thị thông báo thành công
                JOptionPane.showMessageDialog(this, "Sửa dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
                txt_MPB.setText("");
                txt_tenPb.setText("");
                
            } else {
                // MaNV bị sửa
                JOptionPane.showMessageDialog(this, "Không thể sửa MaPB !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
                   
            // Đóng câu lệnh và kết nối
            stmt.close();
            conn.close();
            
            // Tải lại dữ liệu và hiển thị trong bảng
            TablePB();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaPBActionPerformed

    private void btn_xoaPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaPBActionPerformed
        int selectedRow = ht_pb.getSelectedRow();

        // Kiểm tra xem có hàng nào được chọn không
        if (selectedRow == -1) {
            // Hiển thị thông báo lỗi nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy dữ liệu từ các thành phần trên form để xóa
        String mapb = txt_MPB.getText();

        // Thực hiện cập nhật dữ liệu vào cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Tạo câu truy vấn cập nhật dữ liệu
            String query = "DELETE FROM phongban WHERE MaPB = '" + mapb + "'";

            // Thực hiện câu truy vấn cập nhật dữ liệu
            stmt.executeUpdate(query);

            // Đóng câu lệnh và kết nối
            stmt.close();
            conn.close();

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
            txt_MPB.setText("");
            txt_tenPb.setText("");
            
            // Tải lại dữ liệu và hiển thị trong bảng
            TablePB();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_xoaPBActionPerformed

    private void txt_tkPbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tkPbKeyReleased
        // Kiểm tra xem ô tìm kiếm có trống hay không
        if (txt_tkPb.getText().isEmpty()) {
            // Load lại bảng
            TablePB();
        }
    }//GEN-LAST:event_txt_tkPbKeyReleased

    private void btn_tkobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tkobActionPerformed
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Nhập từ khóa tìm kiếm từ người dùng
            String keyword = txt_tkPb.getText();

            // Tạo một câu lệnh truy vấn SQL với điều kiện tìm kiếm
            String query = "SELECT * FROM PHONGBAN "
            + "WHERE MaPB LIKE '%" + keyword + "%' OR TenPB LIKE '%" + keyword + "%'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn tìm kiếm trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Kiểm tra xem có kết quả tìm kiếm hay không
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("MaPB");
                model.addColumn("Tên PB");

                // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
                while (rs.next()) {
                    String mapb = rs.getString("MaPB");
                    String ten = rs.getString("TenPB");

                    Object[] rowData = {mapb, ten};
                    model.addRow(rowData);
                }

                // Hiển thị dữ liệu từ DefaultTableModel vào JTable
                ht_pb.setModel(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_tkobActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Chắc chắn muốn thoát không!", "Thông báo!!!", JOptionPane.YES_NO_OPTION);
        if (tb != JOptionPane.YES_OPTION){
            return;
        }
        qlPB.this.setVisible(false);
        new MainF().setVisible(true);
    }//GEN-LAST:event_btn_thoatActionPerformed

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
            java.util.logging.Logger.getLogger(qlPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlPB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suaPB;
    private javax.swing.JButton btn_themPB;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_tkob;
    private javax.swing.JButton btn_xoaPB;
    private javax.swing.JTable ht_pb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_MPB;
    private javax.swing.JTextField txt_tenPb;
    private javax.swing.JTextField txt_tkPb;
    // End of variables declaration//GEN-END:variables
}
