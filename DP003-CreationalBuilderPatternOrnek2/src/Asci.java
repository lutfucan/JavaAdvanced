public class Asci {

   private PideBuilder pideBuilder;

   public void setPideBuilder( final PideBuilder pideBuilder ) {
      this.pideBuilder = pideBuilder;
   }

   public Pide getPide() {
      return pideBuilder.pideAl();
   }

   public void pideBuild() {
      // Pideyi aşama aşama kur.
      pideBuilder.pideYarat();
      pideBuilder.hamurKur();
      pideBuilder.malzemeKur();
      pideBuilder.baharatKur();
   }
}