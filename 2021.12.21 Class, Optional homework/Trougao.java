package Klase;

public class Trougao {

    //Klasa trougao ima 3 polja koji predstavljaju stranice: stranicaA, stranicaB, stranicaC.
    // Vrednost stranica je tipa double. Napisati konstruktor,
    // getter i setter metode za sve stranice i metode za racunanje obima i povrsine.

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;
    private boolean daLiJeTrougaoValidan(){
        if(stranicaA+stranicaB<stranicaC){
            return false;
        }else if (stranicaA+stranicaC<stranicaB){
            return false;
        } else if (stranicaB+stranicaC<stranicaA){
            return false;
        }else{
            return true;
        }
    }

    public Trougao(double stranicaA, double stranicaB, double stranicaC){
this.stranicaA=stranicaA;
this.stranicaB=stranicaB;
this.stranicaC=stranicaC;
boolean validan = daLiJeTrougaoValidan();
if(validan==false){
    System.out.println("Pokusavate kreirati nevalidan trougao!");
}
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }
    public double obim(){
        double o=stranicaA+stranicaB+stranicaC;
        return o;
    }
    public double povrsina(){
      /*  double s= (stranicaA+stranicaB+stranicaC)/2;  ---> 1 nacin */
        double s= obim() /2;   //2 nacin i laksi jer vec imamo obim

        double podKorenaVrednost= s * (s-stranicaA) * (s-stranicaB) * (s-stranicaC);
        double p= Math.sqrt (podKorenaVrednost);
        return p;
    }
   public String toString(){
     /*   String stringKojiVracam;
        stringKojiVracam = "Duzina stranice A je: " + stranicaA + "\n";
    stringKojiVracam += "Duzina stranice B je: " + stranicaB + "\n";
        stringKojiVracam += "Duzina stranice C je: " + stranicaC + "\n";
        stringKojiVracam +="Obim trougla je: " + obim()+ "\n";
        stringKojiVracam += "Povrsina trougla je: " + povrsina() + "\n";
        return stringKojiVracam;
*/

  StringBuilder sb= new StringBuilder();
  sb.append("Duzina stranice A je: ");
  sb.append( stranicaA);
  sb.append ( "\n");
  sb.append("Duzina stranice B je: ");
   sb.append (stranicaB);
   sb.append ( "\n");
  sb.append("Duzina stranice C je: ");
  sb.append (stranicaC);
  sb.append ( "\n");

  return sb.toString();


}}



