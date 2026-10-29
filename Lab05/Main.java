 class Student{
   private  String name;
    private int roll;

     public Student(int roll, String name) {
         this.roll = roll;
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getRoll() {
         return roll;
     }

     public void setRoll(int roll) {
         this.roll = roll;
     }
 }
 public class Main{
    public static void main(String[]args){
        Student s1=new Student(1,"Ayesha");
//        s1.setName("Ayesha");
        System.out.println(s1.getName());
        s1.setRoll(1);
        System.out.println(s1.getRoll());

     }
 }