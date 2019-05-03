/**
 * Auto Generated Java Class.
 */
public abstract class Gates extends ComputationUnit {
   
   //properties
   private boolean input1;
   private boolean input2;
   private boolean output;
   
   public Gates( boolean a, boolean b) { 
      input1 = a;
      input2 = b;
   }
   
   public Gates( boolean a){
      input1 = a;
   }

   //getMethods
   public boolean getInput1(){
      return input1;
   }
   
   public boolean getInput2(){
      return input2;
   }
   
   //abstract output method
   public abstract boolean logicOperation();
   
}
