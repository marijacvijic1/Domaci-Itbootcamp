package Sportista;

public class Sportista {

    private String imeIPrezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String imeIPrezime, String sport, String klub, int brojDresa) {
        this.imeIPrezime = imeIPrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojDresa = brojDresa;
    }

    public Sportista(String imeIPrezime, String sport, int brojDresa) {
        this.imeIPrezime = imeIPrezime;
        this.sport = sport;
        this.brojDresa = brojDresa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime i prezime je: ");
        sb.append(imeIPrezime);
        sb.append("\n");

        sb.append("Sport kojim se bavi je: ");
        sb.append(sport);
        sb.append("\n");

        if (klub == null) {
            System.out.println("Sportista trenutno nema klub");
        } else {
            sb.append("Klub za koji igra je: ");
            sb.append(klub);
            sb.append("\n");
        }

        sb.append("Broj dresa je: ");
        sb.append(brojDresa);
        sb.append("\n");

        return sb.toString();


    }
}


