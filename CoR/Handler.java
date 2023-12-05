

package assignment4.solution.CoR;

public abstract class Handler {


 protected Handler successor;

 public void SetSuccessor(Handler successor)
 {
 this.successor = successor;
 }
 public abstract String handleRequest(String msg, double value);
}