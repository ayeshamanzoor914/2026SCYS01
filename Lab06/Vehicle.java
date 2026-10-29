class Car1{
    String car1;
    String car2;
    String car3;

    @Override
    public String toString() {
        return "Car1{" +
                "car1='" + car1 + '\'' +
                ", car2='" + car2 + '\'' +
                ", car3='" + car3 + '\'' +
                '}';
    }
}
class Brand{
    Car1 c;
    void display(){
        System.out.println(c);
    }
}
public class Vehicle {
    public static void main(String[] args) {
      Car1 c1=new Car1();
      Car1 c2=new Car1();
      Car1 c3=new Car1();
      c1.car1="Toyata";
      c2.car1="Scotry";
      c3.car1="BMW";
      Brand b= new Brand();
      b.c=c1;
      b.display();
      b.c=c2;
      b.display();
      b.c=c3;
      b.display();
    }
}
