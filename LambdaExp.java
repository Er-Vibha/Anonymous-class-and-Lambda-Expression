//Ex1
//interface Lamb{
//    void a();
//}
//public class LambdaExp {
//    public static void main(String[] args) {
//        Lamb ob=()->{
//            System.out.println("I am method from Lambda");
//        };
//        ob.a();
//    }
//}

//Ex2
//@FunctionalInterface
//interface Lam{
//    void abc();
////    void ab();   // We can have only one interface to execute anonymous class and lambda
//}
//class LambdaExp{
//    public static void main(String[] args) {
//        Lam l=()->{
//            System.out.println("abcdef");
//        };
//        l.abc();
//    }
//}

//Ex3
@FunctionalInterface
interface Length{
    int getLen(String str);
}
class Lamb{
    public static void main(String[] args) {
        Length l = str -> str.length();
        System.out.println(l.getLen("Ring"));
    }
    }
