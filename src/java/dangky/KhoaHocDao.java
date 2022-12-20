/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangky;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class KhoaHocDao extends BaseDao {
    
    public List<KhoaHoc> findAll() {
        List<KhoaHoc> khoaHocs = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        try {
                connection = getConnection();
                StringBuilder sql = new StringBuilder("SELECT * FROM KHOAHOC ");
                ps = connection.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String maKH = rs.getString("MaKH");
                    String tenKH = rs.getString("TenKH");
                    String nienKhoa = rs.getString("NienKhoa");
                    khoaHocs.add(new KhoaHoc(maKH != null ? maKH.trim() : maKH, tenKH, nienKhoa));
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection, ps, null);
        }
        return khoaHocs;
    }
   
}
