/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion6162023.Dao;
import dion6162023.Model.anggota;
import java.util.List;
/**
 *
 * @author LAB-MM
 */
public interface AnggotaDao {
    void insert(anggota Anggota);
    void update(int index, anggota Anggota);
    void delete(int index);
    anggota getAnggota(int index);
    List<anggota>getAll();
}
