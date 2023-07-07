/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion6162023.Controller;
import dion6162023.Model.*;
import java.util.*;
import dion6162023.View.*;
import dion6162023.Dao.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
/**
 *
 * @author LAB-MM
 */
public class AnggotaController {
    formAnggota view;
    anggota Anggota;
    AnggotaDao dao;
    
    public AnggotaController(formAnggota view){
        this.view = view;
        dao = new AnggotaDaoImpl();
    }
    
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJeniskelamin().removeAllItems();
        view.getCboJeniskelamin().addItem("L");
        view.getCboJeniskelamin().addItem("P");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<anggota> list = dao.getAll();
        for(anggota a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }          
    }
    public void insert(){
        Anggota = new anggota();
        Anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        Anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        Anggota.setAlamat(view.getTxtAlamat().getText());
        Anggota.setJenisKelamin(view.getCboJeniskelamin().getSelectedItem().toString());
        dao.insert(Anggota);
        JOptionPane.showMessageDialog(view, "Entri data OK");
    }
    public void update(){
        int index = view.getTabelAnggota().getSelectedRow();
        Anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        Anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        Anggota.setAlamat(view.getTxtAlamat().getText());
        Anggota.setJenisKelamin(view.getCboJeniskelamin().getSelectedItem().toString());
        dao.update(index, Anggota);
        JOptionPane.showMessageDialog(view, "Entri data OK");
    }
    public void delete(){
        int index = view.getTabelAnggota().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Entri data OK");
    }
    public void getAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        Anggota = dao.getAnggota(index);
        view.getTxtKodeAnggota().setText(Anggota.getKodeAnggota());
        view.getTxtNamaAnggota().setText(Anggota.getNamaAnggota());
        view.getTxtAlamat().setText(Anggota.getAlamat());
        view.getCboJeniskelamin().setSelectedItem(Anggota.getJenisKelamin());
    }
}
