/**
 * Created by AlinAdmin on 11/4/2015.
 */
public aspect MainAspect {
    pointcut mainMethod() : execution(public static void main(String[]));

    before():mainMethod(){
        System.out.println("Before HelloWorld");
    }
    after() returning : mainMethod(){
        System.out.println("After HelloWorld");
    }
}
