package poly.book.dao.impl;

import poly.book.entity.SanPham;
import java.sql.*;
import java.util.*;

public class SanPhamDAOImpI extends BaseDAO {

    public void insert(SanPham sp) {
        String sql = "INSERT INTO SanPham VALUES (?,?,?,?,?)";
        update(sql, sp.maSanPham, sp.tenSanPham, sp.donGia, sp.soLuongTon, sp.maLoai);
    }

    public void updateSP(SanPham sp) {
        String sql = "UPDATE SanPham SET TenSanPham=?,DonGia=?,SoLuongTon=?,MaLoai=? WHERE MaSanPham=?";
        update(sql, sp.tenSanPham, sp.donGia, sp.soLuongTon, sp.maLoai, sp.maSanPham);
    }

    public void delete(String id) {
        update("DELETE FROM SanPham WHERE MaSanPham=?", id);
    }

    public List<SanPham> selectAll() {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = query("SELECT * FROM SanPham");
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.maSanPham = rs.getString(1);
                sp.tenSanPham = rs.getString(2);
                sp.donGia = rs.getDouble(3);
                sp.soLuongTon = rs.getInt(4);
                sp.maLoai = rs.getString(5);
                list.add(sp);
            }
        } catch (Exception e) {}
        return list;
    }
}