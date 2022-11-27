public class Main {
    public static void main(String[] args) {

        Uczen uczen = new Uczen("Janek","Kowalski","865456","5","6c","Bardzo dobry");
        Nauczyciel nauczyciel = new Nauczyciel("Zbigniew","Trabka","333","Geografia","8lat","TAK");
        Dyrekcja dyrektor = new Dyrekcja("Basia","Kracz","666","12lat","4","Zagnańska 27", "Kielce");

        System.out.println(nauczyciel.getInfo());
        System.out.println(uczen.getInfo());
        System.out.println(dyrektor.getInfo());






    }
}