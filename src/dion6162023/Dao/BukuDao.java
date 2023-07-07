/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dion6162023.Dao;
import dion6162023.Model.Buku;
import java.util.List;

/**
 *
 * @author LAB-MM
 */
public interface BukuDao {
    void insert(Buku buku);
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku>getAll();
}
