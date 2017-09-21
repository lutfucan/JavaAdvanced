public class KusbasiliPideBuilder extends PideBuilder {

   @Override
   public void baharatKur() {
      pide.baharatKoy( "kimyon" );
   }

   @Override
   public void hamurKur() {
      pide.hamurKoy( "kalın hamur" );
   }

   @Override
   public void malzemeKur() {
      pide.malzemeKoy( "kuşbaşı et" );
   }
}