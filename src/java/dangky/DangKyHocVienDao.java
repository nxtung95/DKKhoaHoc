package dangky;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DangKyHocVienDao extends BaseDao {
    public String getNextHocVienId() {
        String lastHocVienId = getLastHocVienId();
        if (lastHocVienId == null) {
            return "HV01";
        }

        Matcher matcher = Pattern.compile("\\d+").matcher(lastHocVienId);
        if (!matcher.find()) {
            return "HV01";
        }
        int lastId = Integer.parseInt(matcher.group());

        return "HV" + String.format("%2d", (lastId + 1));
    }

    private String getLastHocVienId() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = getConnection();
            StringBuilder sql = new StringBuilder("SELECT TOP 1 MaHV FROM HOCVIEN ORDER BY CAST(STUFF(MaHV, 1, 2, '') AS int) DESC ");
            ps = connection.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString("MaHV");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection, ps, null);
        }
        return null;
    }
    
    
    public boolean add(HocVien hocVien) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = getConnection();
            StringBuilder sql = new StringBuilder("INSERT INTO HOCVIEN(MaHV, HoTenHV, NgaySinhHV, GioiTinhHV, DiaChiHV, SoDtHV, MaLop) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps = connection.prepareStatement(sql.toString());
            ps.setString(1, hocVien.getMaHV());
            ps.setString(2, hocVien.getHoTenHV());
            ps.setDate(3, new java.sql.Date(hocVien.getNgaySinh().getTime()));
            ps.setString(4, hocVien.getGioiTinh());
            ps.setString(5, hocVien.getDiaChi());
            ps.setString(6, hocVien.getSoDt());
            ps.setString(7, hocVien.getMaLop());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection, ps, null);
        }
        return false;
    }
}
