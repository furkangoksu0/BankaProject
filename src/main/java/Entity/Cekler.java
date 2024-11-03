package Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Cekler")
public class Cekler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cekId;

    @ManyToOne
    @JoinColumn(name = "HesapID")
    private Hesaplar hesap;

    private double tutar;
    private Date tarih;

    @Column(name = "Cek_Numara")
    private String cekNumara;

    public Long getCekId() {
        return cekId;
    }

    public void setCekId(Long cekId) {
        this.cekId = cekId;
    }

    public Hesaplar getHesap() {
        return hesap;
    }

    public void setHesap(Hesaplar hesap) {
        this.hesap = hesap;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getCekNumara() {
        return cekNumara;
    }

    public void setCekNumara(String cekNumara) {
        this.cekNumara = cekNumara;
    }
}


