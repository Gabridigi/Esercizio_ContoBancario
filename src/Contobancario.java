public class Contobancario {

  private float conto;
  private String intestatario;
  private Datascadenza scadenzaconto;

  public Contobancario(float newconto, String newintestatario, String newscadenza) {
    int newanno = Integer.parseInt(newscadenza.substring(0, 4));
    int newmese = Integer.parseInt(newscadenza.substring(5, 7));                //YYYY/MM/DD
    int newgiorno = Integer.parseInt(newscadenza.substring(9)); 

    this.conto = newconto;
    this.intestatario = newintestatario;
    this.scadenzaconto = new Datascadenza(newanno, newmese, newgiorno);
  }

  public float getConto() {
    return this.conto;
  }

  public void setConto(float newConto) {
    this.conto = newConto;
  }

  public String getIntestatario() {
    return this.intestatario;
  }

  public void setIntestatario(String newIntestatario) {
    this.intestatario = newIntestatario;
  }

  public void accredita(float accredito) {
    this.conto += accredito;
  }

  public String getDataScadenza(){
    return this.scadenzaconto.toString(); //metodo per restituire tutta la data di scadenza
  }


  public String toString(){
    return "INTESTATARIO: " + this.getIntestatario() + "\n" +
    "CONTO: " + Float.toString(this.getConto()) + "\n" +
    "DATA DI SCADENZA: " + this.scadenzaconto;
  }
}
