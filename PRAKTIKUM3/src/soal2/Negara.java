package soal2;

public class Negara {
    private String NamaNegara;
    private String Kepemimpinan;
    private String NamaPemimpin;
    private  String Pemimpin;
    private Integer TanggalKemerdekaan;
    private Integer BulanKemerdekaan;
    private Integer TahunKemerdekaan;

    public Negara(String NamaNegara, String kepemimpinan, String NamaPemimpin, int TanggalKemerdekaan, int BulanKemerdekaan, int TahunKemerdekaan) {
        this.NamaNegara = NamaNegara;
        this.Kepemimpinan = kepemimpinan;
        this.NamaPemimpin = NamaPemimpin;
        this.TanggalKemerdekaan = TanggalKemerdekaan;
        this.BulanKemerdekaan = BulanKemerdekaan;
        this.TahunKemerdekaan = TahunKemerdekaan;

    }

    public String getNamaNegara() {
        return NamaNegara;
    }

    public String getKepemimpinan() {
        return Kepemimpinan;
    }

    public String getNamaPemimpin() {
        return NamaPemimpin;
    }

    public String getPemimpin() {
        return Pemimpin;
    }

    public Integer getTanggalKemerdekaan() {
        return TanggalKemerdekaan;
    }

    public Integer getBulanKemerdekaan() {
        return BulanKemerdekaan;
    }

    public Integer getTahunKemerdekaan() {
        return TahunKemerdekaan;
    }
}


