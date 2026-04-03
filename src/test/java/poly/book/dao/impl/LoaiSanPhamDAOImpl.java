/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.dao.impl;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamDAOImpl extends BaseDAO {
    public void insert(LoaiSanPham l){
        update("INSERT INTO LoaiSanPham VALUES (?,?,?)", l.maLoai, l.tenLoai, l.ghiChu);
    }
}