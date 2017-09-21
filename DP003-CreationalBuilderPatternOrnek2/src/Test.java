public class Test {

   public static void main( final String[] args ) {
      final Asci aşçı = new Asci();

      final LahmacunPideBuilder lahmacunPideBuilder = new LahmacunPideBuilder();

      aşçı.setPideBuilder( lahmacunPideBuilder );

      aşçı.pideBuild();

      final Pide pide = aşçı.getPide();

      System.out.println( "Pide kuruldu : " + pide );
   }
}