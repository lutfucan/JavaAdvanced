public class LahmacunPideBuilder extends PideBuilder {

   @Override
   public void baharatKur() {
      pide.baharatKoy( "acı biber" );
   }

   @Override
   public void hamurKur() {
      pide.hamurKoy( "ince hamur" );
   }

   @Override
   public void malzemeKur() {
      pide.malzemeKoy( "kıyma" );
   }
}