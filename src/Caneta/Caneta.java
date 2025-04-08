package Caneta;

public class Caneta {

  //Esses são referências à atributos:

  public String modelo;
  public String cor;
  public float ponta;
  public int carga;
  public boolean tampada;

  //Essa é uma referência ao método
  //OBS: MÉTODO SEM TEM ()
  //this. é para chamar o objeto, nesse caso quem tá chamando é c1

    public void status() {
        System.out.println("Uma caneta, " + this.cor + ";");
        System.out.println("Ponta, " + this.ponta + ";");
        System.out.println("Tampada? " + this.tampada + ";");
        System.out.println("Modelo, " + this.modelo + ";");
        System.out.println("Carga, " + this.carga + "%.");
    }

   public void tampar(){
      this.tampada = true;
    }

   public void destampar() {
      this.tampada = false;

  }
   public void rabiscar() {

      if (this.tampada == true) {
        System.out.println("Pode riscar!");
      }
      else if (this.tampada == false){
        System.out.println("Não pode riscar, caneta tampada");
      }

    }
}


