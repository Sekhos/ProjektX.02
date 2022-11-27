public class Uczen extends Person{

    String ocena;
    String klasa;
    String opisOceny;


    public Uczen(String imie, String nazwisko, String pesel, String ocena, String klasa, String opisOceny) {
        super(imie, nazwisko, pesel);
        this.ocena=ocena;
        this.klasa=klasa;
        this.opisOceny=opisOceny;
    }

    public String getOcena() {
        return ocena;
    }

    public void setOcena(String ocena) {
        this.ocena = ocena;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public String getOpisOceny() {
        return opisOceny;
    }

    public void setOpisOceny(String opisOceny) {
        this.opisOceny = opisOceny;
    }



    public String getInfo() {
        return "Imię ucznia: " + imie + " Nazwisko: " + nazwisko + " Pesel: " + pesel + " Ocena: " + ocena +
                " Klasa: " + klasa + " Opis oceny: " + opisOceny ;
    }
}
