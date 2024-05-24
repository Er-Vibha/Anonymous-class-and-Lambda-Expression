interface Ano{
   void a1();
   void a2();
}

public class AnonymousClass {
   public static void main(String[] args) {
Ano ob=new Ano() {
   @Override
   public void a1() {
       System.out.println("a1");
   }

   @Override
   public void a2() {
       System.out.println("a2");
   }
};
ob.a1();
ob.a2();
   }
}


//interface  Hello{
//    void a(int b);
//    }
//class AnonymousClass{
//    public static void main(String[] args) {
//        Hello h=new Hello() {
//            @Override
//            public void a(int b) {
//                System.out.println("b");
//            }
//        };
//        h.a(23);
//    }
//}
