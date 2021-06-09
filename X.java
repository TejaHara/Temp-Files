class X{
    public static void main(String[] args) {
        /*A a = new A();
        B b = new B();
        C c = new C();*/
        init(A.class, B.class, C.class);
        execute(A.class, B.class, C.class);
        shutdown(A.class, B.class, C.class);
    }
    public static void init(Class A, Class B, Class C){
        System.out.println("\nThis is in init");
        A a = new A();
        B b = new B();
        C c = new C();
    }
    public static void execute(Class A, Class B, Class C){
        System.out.println("\nThis is in execute");
        A a = new A();
        B b = new B();
        C c = new C();
    }
    public static void shutdown(Class A, Class B, Class C){
        System.out.println("\nThis is in shutdown");
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
//this.getClass().getSimpleName()
class A{
    public A(){
        System.out.println("This is class "+this.getClass().getSimpleName()+"'s implementation");
    }
}

class B{
    public B(){
        System.out.println("This is class "+this.getClass().getSimpleName()+"'s implementation");
    }
}

class C{
    public C(){
        System.out.println("This is class "+this.getClass().getSimpleName()+"'s implementation");
    }
}