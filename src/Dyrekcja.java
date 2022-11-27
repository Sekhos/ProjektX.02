public class Dyrekcja extends Person{

    String dlugoscPracy;
    String zrealizowaneProjekty;
    String adres;

    String miejscowosc;


    public Dyrekcja(String imie, String nazwisko, String pesel, String dlugoscPracy, String zrealizowaneProjekty, String adres, String miejscowosc) {
        super(imie, nazwisko, pesel);
        this.dlugoscPracy=dlugoscPracy;
        this.zrealizowaneProjekty=zrealizowaneProjekty;
        this.adres=adres;
        this.miejscowosc=miejscowosc;
    }

    public String getDlugoscPracy() {
        return dlugoscPracy;
    }

    public void setDlugoscPracy(String dlugoscPracy) {
        this.dlugoscPracy = dlugoscPracy;
    }

    public String getZrealizowaneProjekty() {
        return zrealizowaneProjekty;
    }

    public void setZrealizowaneProjekty(String zrealizowaneProjekty) {
        this.zrealizowaneProjekty = zrealizowaneProjekty;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }




    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getInfo() {
        return "Imię dyrektora: " + imie + " Nazwisko: " + nazwisko + " Pesel: " + pesel + " Długość pracy: " + dlugoscPracy +
                " Zrealizowane projekty: " + zrealizowaneProjekty + " Miejscowość: " + miejscowosc + " Adres: " + adres;
    }
}
