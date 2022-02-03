package Automobil2;

public class Automobil2 {
    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;

    //sa vlasnikom
    public Automobil2(String marka, String model, int serijskiBroj, String vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public Automobil2(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je: ");
        sb.append(marka);
        sb.append("\n");

        sb.append("Model automobila je: ");
        sb.append(model);
        sb.append("\n");

        sb.append("Serijski broj automobila je: ");
        sb.append(serijskiBroj);
        sb.append("\n");

        if (vlasnik == null) {
            sb.append("Vlasnik ne postoji");
        }else{
            sb.append("Ime vlasnika je: ");
            sb.append(vlasnik);
        }
        sb.append("\n");

        return sb.toString();
    }

}



