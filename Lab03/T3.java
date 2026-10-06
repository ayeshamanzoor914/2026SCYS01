class Hi{
    void sayhi(){
        System.out.println("hi,Ayesha");
    }
    void name(){
        System.out.println("Ayesha Manzoor");

    }
    void reg(){
        System.out.println("2026-S-CYS-01");
    }
}
class Friends{
    void Amna(){
        System.out.println("Amna");
    }
}
public class T3{
    public static void main(String[] args){
       Hi h=new Hi();
       h.name();
       h.reg();
       h.sayhi();

       Friends f=new Friends();
       f.Amna();
    }
}