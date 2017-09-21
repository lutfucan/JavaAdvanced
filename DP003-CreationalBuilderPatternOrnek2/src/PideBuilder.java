public abstract class PideBuilder {

   protected Pide   pide;

   public void pideYarat() {
      pide = new Pide();
   }

   public Pide pideAl() {
      return pide;
   }

   public abstract void malzemeKur();

   public abstract void hamurKur();

   public abstract void baharatKur();
}