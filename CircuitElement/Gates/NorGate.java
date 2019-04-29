/**
 * Auto Generated Java Class.
 */
public class NorGate extends Gates {
   
   public NorGate( boolean a, boolean b) { 
      super( a,b);
   }
   
     public boolean logicOperation(){
      return !(input1 || input2);   
   }
   
}
