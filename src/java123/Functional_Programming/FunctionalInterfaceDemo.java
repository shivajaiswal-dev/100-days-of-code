package java123.Functional_Programming;
@FunctionalInterface
interface BookAction{
    void perform();
}// Functional interface can have only one abstract method
//eg runnable callable actionlistner
// Lambda expression () -> {}

interface Operations{
    int add(int a, int b);

}
public class FunctionalInterfaceDemo {
      static void main(String args[]){
//BookAction action=new BookAction(){
//    public void perform(){
//        System.out.println("Action performed World");
//    }
//};
          // below is lambda  expression
          BookAction action=() -> {

                  System.out.println("Action performed World");

          };
          BookAction action1=() -> System.out.println("Action performed World");
action.perform();
action1.perform();

//Functional interface with parameters

Operations op=(a,b) -> {
    return  a+b;
   //  System.out.println("Operation performed World"+(a+b));
};
System.out.println(op.add(1,2));

new  Thread(() -> System.out.println("Thread created")).start();

    }
}
