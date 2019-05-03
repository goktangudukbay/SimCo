/**
 * Creates the Switches for the circuit..
 * Every new Switch is set OPEN by default.
 * Last edited: 03.05.2019 10.20 by oguztuzgen
 */
public class Switch extends CircuitElement {
   //properties
   private boolean switchState;
   
   //constants
   private final boolean CLOSED = true;
   private final boolean OPEN = false;
   
   //constructors
   public Switch() { 
      switchState = OPEN;
   }
   
   // methods
   public void toggleSwitch() {
      switchState = !switchState;
   }
   
}
