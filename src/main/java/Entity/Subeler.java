package Entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Subeler")
public class Subeler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subeId;

    @Column(name = "Sube_Adi")
    private String subeAdi;
    @Column(name = "Sube_Kodu")
    private String subeKodu;
    private String adres;

    @OneToMany(mappedBy = "sube")
    private Set<Islemler> islemler;

    public Long getSubeId() {
        return subeId;
    }

    public void setSubeId(Long subeId) {
        this.subeId = subeId;
    }

    public String getSubeAdi() {
        return subeAdi;
    }

    public void setSubeAdi(String subeAdi) {
        this.subeAdi = subeAdi;
    }

    public String getSubeKodu() {
        return subeKodu;
    }

    public void setSubeKodu(String subeKodu) {
        this.subeKodu = subeKodu;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Set<Islemler> getIslemler() {
        return islemler;
    }

    public void setIslemler(Set<Islemler> islemler) {
        this.islemler = islemler;
    }
}




