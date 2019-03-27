package ba.unsa.etf.rma.VJ_17749;

public class Muzicar {
    private String imePrezime;
    private String zanr;
    private String webStranica;
    private String biografija;
    private String image;

    public Muzicar(String imePrezime, String zanr, String webStranica, String biografija,String image) {
        this.imePrezime = imePrezime;
        this.zanr = zanr;
        this.webStranica = webStranica;
        this.biografija = biografija;
        this.image=image;
    }

    public Muzicar(){

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getWebStranica() {
        return webStranica;
    }

    public void setWebStranica(String webStranica) {
        this.webStranica = webStranica;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }
}
