/**
 * Auto Generated Java Class.
 */
public class ComputationUnit extends CircuitElement {
   //properties
   String op1;
   String op2;
   String result;
   
   //constructors
   public ComputationUnit(String op1, String op2) { 
      setOp1(op1);
      setOp2(op2);
   }
   
   public String getOp1(){
      return op1;
   }
   
   public String getOp2(){
      return op2;
   }
   
   public void setOp1( String op1){
      this.op1 = op1;
   }
   
   public void setOp2( String op2){
      this.op2 = op2;
   }
   
   public String operation( String result){
      this.result = result;   
      return result;
   }
   
   public String setResult( String result) {
      this.result = result;
      return result;
   }
   
   
}
