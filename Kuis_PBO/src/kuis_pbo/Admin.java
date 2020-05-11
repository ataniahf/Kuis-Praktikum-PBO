package kuis_pbo;

/**
 *
 * @author ATANIA
 */
public class Admin extends Pendaftar implements Penilaian{
    private int tes_praktek_jaringan;
    protected double hasil_rata2;
    
    public Admin(String nama, int nim, int tes_tulis, int tes_praktek_coding, int tes_wawancara, int tes_praktek_jaringan) {
        super(nama, nim, tes_tulis, tes_praktek_coding, tes_wawancara);
        this.tes_praktek_jaringan = tes_praktek_jaringan;
        HitungNilai();
    }

    @Override
    public void HitungNilai() {
        hasil_rata2 = (super.tes_praktek_coding + super.tes_tulis + super.tes_wawancara + tes_praktek_jaringan)/4;
    }
    
} 

