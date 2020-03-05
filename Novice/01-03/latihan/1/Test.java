import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation{
    String Developer() default "Imam";
    String CreateDate();
}
/**
* @Author : Imam
* 
* di bawah ini adalah class Test
*/
public class Test{
    @TestAnnotation(Developer="Imam", CreateDate = "05-03-2020")
        void fun1(){
            System.out.println("Test method 1");
        }
        @TestAnnotation(Developer="Buhori", CreateDate = "05-03-2020")
        void fun2(){
            System.out.println("Test method 2");
        }
         
        public static void main(String args[]){
            System.out.println("Hello Praxis Academy");
         
        } 
}