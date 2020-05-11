/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_pbo;

/**
 *
 * @author ATANIA
 */
public class Pendaftar {

    protected String nama;
    protected int nim,tes_tulis,tes_praktek_coding,tes_wawancara;

    public Pendaftar(String nama,int nim,int tes_tulis,int tes_praktek_coding,int tes_wawancara) {
        this.nama = nama;
        this.nim = nim;
        this.tes_tulis = tes_tulis;
        this.tes_praktek_coding = tes_praktek_coding;
        this.tes_wawancara = tes_wawancara;
    }
}

