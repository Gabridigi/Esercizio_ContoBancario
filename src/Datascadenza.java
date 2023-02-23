import java.time.LocalDate;

public class Datascadenza {

  private int anno;
  private int mese;
  private int giorno;

  public Datascadenza(int newanno, int mewmese, int newgiorno) {
    this.anno = newanno;
    this.mese = mewmese;
    this.giorno = newgiorno;
  }

  public int getAnno() {
    return this.anno;
  }

  public void setAnno(int newAnno) {
    this.anno = newAnno;
  }

  public int getMese() {
    return this.mese;
  }

  public void setMese(int newMese) {
    this.mese = newMese;
  }

  public int getGiorno() {
    return this.giorno;
  }

  public void setGiorno(int newGiorno) {
    this.giorno = newGiorno;
  }

  public String toString(){
    return Integer.toString(this.anno) + "/" +  Integer.toString(this.mese) + "/" + Integer.toString(this.giorno);
  }
  LocalDate oggi = LocalDate.now();
}
