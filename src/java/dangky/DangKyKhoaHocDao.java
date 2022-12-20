/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangky;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

public class DangKyKhoaHocDao extends BaseDao {
    public boolean add(KhoaHoc kh, HocVien hocVien) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = getConnection();
            StringBuilder sql = new StringBuilder("INSERT INTO DANGKY(MaHV, MaKH, NgayDK) VALUES (?, ?, ?)");
            ps = connection.prepareStatement(sql.toString());
            ps.setString(1, hocVien.getMaHV());
            ps.setString(2, kh.getMaKhoaHoc());
            ps.setDate(3, new java.sql.Date(new Date().getTime()));
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection, ps, null);
        }
        return false;
    }
}
