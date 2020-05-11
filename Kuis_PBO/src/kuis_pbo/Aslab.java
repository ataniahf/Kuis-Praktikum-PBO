package kuis_pbo;

/**
 *
 * @author ATANIA
 */
public class Aslab extends Pendaftar implements Penilaian {
    private int tes_microteaching;
    protected double hasil_rata2;
    
    public Aslab(String nama, int nim, int tes_tulis, int tes_praktek_coding, int tes_wawancara, int tes_microteaching) {
        super(nama, nim, tes_tulis, tes_praktek_coding, tes_wawancara);
        this.tes_microteaching = tes_microteaching;
        HitungNilai();
    }

    @Override
    public void HitungNilai() {
        hasil_rata2 = (super.tes_praktek_coding + super.tes_tulis + super.tes_wawancara + tes_microteaching)/4;
    }
} 

