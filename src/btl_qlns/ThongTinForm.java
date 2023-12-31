/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlns;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThongTinForm extends javax.swing.JFrame {

    ConnectDB cn = new ConnectDB();
    public ThongTinForm() {
        initComponents();
        
        populateTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMaPB = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTin = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Thông tin nhân viên");

        jLabel2.setText("MaNV:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Giới tính:");

        jLabel6.setText("Quê quán:");

        jLabel7.setText("Số điện thoại:");

        jLabel8.setText("Email:");

        jLabel9.setText("MaPB:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        cbGioiTinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGioiTinhItemStateChanged(evt);
            }
        });

        tbThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán", "SĐT", "Email", "MaPB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTin);
        if (tbThongTin.getColumnModel().getColumnCount() > 0) {
            tbThongTin.getColumnModel().getColumn(0).setMinWidth(50);
            tbThongTin.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbThongTin.getColumnModel().getColumn(0).setMaxWidth(50);
            tbThongTin.getColumnModel().getColumn(1).setMinWidth(0);
            tbThongTin.getColumnModel().getColumn(1).setPreferredWidth(2500);
            tbThongTin.getColumnModel().getColumn(1).setMaxWidth(3000);
            tbThongTin.getColumnModel().getColumn(2).setMinWidth(0);
            tbThongTin.getColumnModel().getColumn(2).setPreferredWidth(1000);
            tbThongTin.getColumnModel().getColumn(2).setMaxWidth(1500);
            tbThongTin.getColumnModel().getColumn(3).setMinWidth(0);
            tbThongTin.getColumnModel().getColumn(3).setPreferredWidth(1000);
            tbThongTin.getColumnModel().getColumn(3).setMaxWidth(1500);
            tbThongTin.getColumnModel().getColumn(4).setMinWidth(0);
            tbThongTin.getColumnModel().getColumn(4).setPreferredWidth(2000);
            tbThongTin.getColumnModel().getColumn(4).setMaxWidth(5000);
            tbThongTin.getColumnModel().getColumn(5).setMinWidth(0);
            tbThongTin.getColumnModel().getColumn(5).setPreferredWidth(1000);
            tbThongTin.getColumnModel().getColumn(5).setMaxWidth(1500);
            tbThongTin.getColumnModel().getColumn(6).setMinWidth(0);
            tbThongTin.getColumnModel().getColumn(6).setPreferredWidth(2500);
            tbThongTin.getColumnModel().getColumn(6).setMaxWidth(3000);
            tbThongTin.getColumnModel().getColumn(7).setMinWidth(50);
            tbThongTin.getColumnModel().getColumn(7).setPreferredWidth(50);
            tbThongTin.getColumnModel().getColumn(7).setMaxWidth(50);
        }

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 164, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaPB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(btnTimKiem)
                                                        .addGap(59, 59, 59)))))))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(269, 269, 269))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnQuayLai)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMaPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Chắc chắn muốn thoát không!", "Thông báo!!!", JOptionPane.YES_NO_OPTION);
        if (tb != JOptionPane.YES_OPTION){
            return;
        }
        ThongTinForm.this.setVisible(false);
        new TrangChu().setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // Lấy dữ liệu từ các thành phần trên form
        String maNV = txtMaNV.getText();
        String hoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        String gioiTinh = cbGioiTinh.getSelectedItem().toString();
        String diaChi = txtDiaChi.getText();
        String sdt = txtSDT.getText();
        String email = txtEmail.getText();
        String maPB = txtMaPB.getText();

        // Thực hiện chèn dữ liệu vào cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Tạo câu truy vấn chèn dữ liệu
            String query = "INSERT INTO NHANVIEN (MaNV, HoTen, NgaySinh, GioiTinh, DiaChi, SoDienThoai, Email, MaPB) "
                    + "VALUES ('" + maNV + "', '" + hoTen + "', '" + ngaySinh + "', '" + gioiTinh + "', '" + diaChi + "', '" + sdt + "', '" 
                    + email + "', '" + maPB + "')";

            // Thực hiện câu truy vấn chèn dữ liệu
            stmt.executeUpdate(query);

            // Đóng câu lệnh và kết nối
            stmt.close();
            conn.close();

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
            txtMaNV.setText("");
            txtHoTen.setText("");
            txtNgaySinh.setText("");
            cbGioiTinh.setSelectedIndex(0);
            txtDiaChi.setText("");
            txtSDT.setText("");
            txtEmail.setText("");
            txtMaPB.setText("");
            
            // Tải lại dữ liệu và hiển thị trong bảng
            populateTable();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed
    
    private void populateTable() {
        // Xóa dữ liệu hiện có trong bảng
        DefaultTableModel model = (DefaultTableModel) tbThongTin.getModel();
        model.setRowCount(0);

        // Thực hiện truy vấn lấy dữ liệu từ cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Thực hiện truy vấn SELECT để lấy dữ liệu từ bảng NHANVIEN
            String query = "SELECT * FROM NHANVIEN";
            rs = stmt.executeQuery(query);

            // Đổ dữ liệu từ ResultSet vào bảng
            while (rs.next()) {
                String maNV = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                String ngaySinh = rs.getString("NgaySinh");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("SoDienThoai");
                String email = rs.getString("Email");
                String maPB = rs.getString("MaPB");

                // Thêm dữ liệu vào bảng
                model.addRow(new Object[]{maNV, hoTen, ngaySinh, gioiTinh, diaChi, sdt, email, maPB}); 
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
    
    private void cbGioiTinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGioiTinhItemStateChanged
       // Tạo đối tượng combobox
        JComboBox<String> cbGioiTinh = new JComboBox<>();

        // Thêm hai mục "Nam" và "Nữ" vào combobox
        cbGioiTinh.addItem("Nam");
        cbGioiTinh.addItem("Nữ");
        cbGioiTinh.addItem("Khác");

        // Đặt giá trị mặc định của combobox là "Nam"
        cbGioiTinh.setSelectedIndex(0);
    }//GEN-LAST:event_cbGioiTinhItemStateChanged

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // Lấy chỉ mục hàng được chọn trong bảng
        int selectedRow = tbThongTin.getSelectedRow();

        // Kiểm tra xem có hàng nào được chọn không
        if (selectedRow == -1) {
            // Hiển thị thông báo lỗi nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy dữ liệu từ các thành phần trên form để sửa
        String maNV = txtMaNV.getText();
        String hoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        String gioiTinh = cbGioiTinh.getSelectedItem().toString();
        String diaChi = txtDiaChi.getText();
        String sdt = txtSDT.getText();
        String email = txtEmail.getText();
        String maPB = txtMaPB.getText();

        // Thực hiện cập nhật dữ liệu vào cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Tạo câu truy vấn cập nhật dữ liệu
            String query = "UPDATE NHANVIEN SET HoTen = '" + hoTen + "', NgaySinh = '" + ngaySinh + "', GioiTinh = '" + gioiTinh + "', DiaChi = '" 
                    + diaChi + "', SoDienThoai = '" + sdt + "', Email = '" + email + "', MaPB = '" + maPB + "' WHERE MaNV = '" + maNV + "'";

            // Thực hiện câu truy vấn cập nhật dữ liệu
            stmt.executeUpdate(query);

            // Đóng câu lệnh và kết nối
            stmt.close();
            conn.close();

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Sửa dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
            txtMaNV.setText("");
            txtHoTen.setText("");
            txtNgaySinh.setText("");
            cbGioiTinh.setSelectedIndex(0);
            txtDiaChi.setText("");
            txtSDT.setText("");
            txtEmail.setText("");
            txtMaPB.setText("");
            
            // Tải lại dữ liệu và hiển thị trong bảng
            populateTable();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void displayDataFromTable(int row) {
        // Lấy dữ liệu từ bảng theo hàng được chọn
        String maNV = tbThongTin.getValueAt(row, 0).toString();
        String hoTen = tbThongTin.getValueAt(row, 1).toString();
        String ngaySinh = tbThongTin.getValueAt(row, 2).toString();
        String gioiTinh = tbThongTin.getValueAt(row, 3).toString();
        String diaChi = tbThongTin.getValueAt(row, 4).toString();
        String soDienThoai = tbThongTin.getValueAt(row, 5).toString();
        String email = tbThongTin.getValueAt(row, 6).toString();
        String maPB = tbThongTin.getValueAt(row, 7).toString();

        // Hiển thị dữ liệu lên các ô nhập liệu
        txtMaNV.setText(maNV);
        txtHoTen.setText(hoTen);
        txtNgaySinh.setText(ngaySinh);
        cbGioiTinh.setSelectedItem(gioiTinh);
        txtDiaChi.setText(diaChi);
        txtSDT.setText(soDienThoai);
        txtEmail.setText(email);
        txtMaPB.setText(maPB);
    }
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = tbThongTin.getSelectedRow();

        // Kiểm tra xem có hàng nào được chọn không
        if (selectedRow == -1) {
            // Hiển thị thông báo lỗi nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy dữ liệu từ các thành phần trên form để xóa
        String maNV = txtMaNV.getText();

        // Thực hiện cập nhật dữ liệu vào cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;

        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Tạo câu truy vấn cập nhật dữ liệu
            String query = "DELETE FROM NHANVIEN WHERE MaNV = '" + maNV + "'";

            // Thực hiện câu truy vấn cập nhật dữ liệu
            stmt.executeUpdate(query);

            // Đóng câu lệnh và kết nối
            stmt.close();
            conn.close();

            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
            txtMaNV.setText("");
            txtHoTen.setText("");
            txtNgaySinh.setText("");
            cbGioiTinh.setSelectedIndex(0);
            txtDiaChi.setText("");
            txtSDT.setText("");
            txtEmail.setText("");
            txtMaPB.setText("");
            
            // Tải lại dữ liệu và hiển thị trong bảng
            populateTable();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Nhập từ khóa tìm kiếm từ người dùng
            String keyword = txtTimKiem.getText();

            // Tạo một câu lệnh truy vấn SQL với điều kiện tìm kiếm
            String query = "SELECT * FROM NHANVIEN WHERE HoTen LIKE '%" + keyword + "%' OR MaNV LIKE '%" + keyword + "%'"
                + " OR GioiTinh LIKE '%" + keyword + "%' OR NgaySinh LIKE '%" + keyword + "%'"
                + " OR DiaChi LIKE '%" + keyword + "%' OR SoDienThoai LIKE '%" + keyword + "%'"
                + " OR Email LIKE '%" + keyword + "%' OR MaPB LIKE '%" + keyword + "%'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn tìm kiếm trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã NV");
            model.addColumn("Họ tên");
            model.addColumn("Ngày sinh");
            model.addColumn("Giới tính");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Email");
            model.addColumn("Mã PB");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                String maNV = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String soDienThoai = rs.getString("SoDienThoai");
                String email = rs.getString("Email");
                String maPB = rs.getString("MaPB");

                Object[] rowData = {maNV, hoTen, ngaySinh, gioiTinh, diaChi, soDienThoai, email, maPB};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
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
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tbThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinMouseClicked
        tbThongTin.setDefaultEditor(Object.class, null);
        tbThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Lấy chỉ mục hàng được chọn
                int selectedRow = tbThongTin.getSelectedRow();
                
                // Hiển thị dữ liệu từ hàng được chọn vào các ô nhập liệu
                displayDataFromTable(selectedRow);
            }
        });
    }//GEN-LAST:event_tbThongTinMouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinForm().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbThongTin;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPB;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
