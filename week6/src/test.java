public class test {
    public static class ClassA {

        public ClassA() {}
        public void method1() { System.out.println("class A"); }
    }

    public static class ClassB extends ClassA {
        public ClassB() {}
        public void method1() { System.out.println("class B"); }
    }

    public static class ClassC extends ClassB {
        public ClassC() {}
        public void method1() { System.out.println("class c"); }
    }

    public static void main(String[] args) {
        ClassB item1 = new ClassA();
        item1.method1();
    }
}
