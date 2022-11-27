public class Nauczyciel extends Person{

    String przedmiot;
    String staz;
    String wychowawstwo;


    public Nauczyciel(String imie, String nazwisko, String pesel, String przedmiot, String staz, String wychowawstwo) {
        super(imie, nazwisko, pesel);
        this.przedmiot=przedmiot;
        this.staz=staz;
        this.wychowawstwo=wychowawstwo;

    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getStaz() {
        return staz;
    }

    public void setStaz(String staz) {
        this.staz = staz;
    }

    public String getWychowawstwo() {
        return wychowawstwo;
    }

    public void setWychowawstwo(String wychowawstwo) {
        this.wychowawstwo = wychowawstwo;
    }


    public String getInfo() {
        return "Imię nauczyciela: " + imie + " Nazwisko: " + nazwisko + " Pesel: " + pesel + " Staż pracy: " + staz +
                " Przedmiot nauczany: " + przedmiot + " Wychowawstwo: " + wychowawstwo ;
    }
}
