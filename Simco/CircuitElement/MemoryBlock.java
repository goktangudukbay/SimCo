public class MemoryBlock extends CircuitElement {
   //properties
   String memoryValue;
   //constants
   
   //constructors
   public MemoryBlock() { 
      memoryValue = "";
   }
   
   public void setMemoryValue( String memoryValue) {
      this.memoryValue = memoryValue;
   }
   
   public String getMemoryValue() {
      return memoryValue;
   }
}
