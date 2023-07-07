/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion6162023.Dao;
import java.util.List;
import java.util.ArrayList;
import dion6162023.Model.anggota;
/**
 *
 * @author LAB-MM
 */
public class AnggotaDaoImpl implements AnggotaDao {
    private List<anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data.add(new anggota("A001", "Dion", "Payakumbuh", "L"));
        data.add(new anggota("A002", "Irfan", "Payakumbuh", "L"));
        
    }
    
    public void insert(anggota Anggota){
    data.add( Anggota);
}
    
    public void update(int index, anggota Anggota){
        data.add(index, Anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<anggota>getAll(){
        return data;
    }
}
