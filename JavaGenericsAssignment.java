package javagenericsassignment;
import java.util.*;
public class JavaGenericsAssignment {
    static class Box<T> {
        private T value;
        Box(T value){ this.value = value ; }
        T get(){ return value ; } 
    }
static void addNumbers(List<? super Number> list){
    list.add(10);
    list.add(3.5);
}
public static void main(String[] args) {
         Box<String> box = new Box <> (" * Hello Generisc * ");
         System.out.println(" --- Generic Class --- ");
        System.out.println(box.get());
        
        List<Number> nums = new ArrayList<>();
        List<Object> objs = new ArrayList<>();
        
        addNumbers(nums);
        addNumbers(objs);
        
        System.out.println(" --- Lower Bound < ? Super Number > --- ");
        System.out.println(" nums : " + nums );
        System.out.println(" objs : " + objs );
}
}
 