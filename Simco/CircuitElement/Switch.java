/**
 * Auto Generated Java Class.
 */
public class Switch extends CircuitElement {
       //properties
   boolean state;
   //constants
   
   //constructors
   public Switch( boolean state) { 
      this.state = state;
   }

   
   //methods
   
   public void setSwitch( boolean state){
      this.state = state;
   }
   
   public boolean switchState(){
      return state;
   }
   
}
