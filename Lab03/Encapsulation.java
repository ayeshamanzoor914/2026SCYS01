class Info{
    private String name;
    private int age;
    private long CNIC;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCNIC() {
        return CNIC;
    }

    public void setCNIC(long CNIC) {
        this.CNIC = CNIC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class  Encapsulation{
    public static void main(String[]args){
        Info i =new Info();
        i.setName("Ayesha");
        i.setAge(19);
        i.setCNIC(3650105578990L);
        System.out.println("Name:"+i.getName());
        System.out.println("Age:"+i.getAge());
        System.out.println("CNIC:"+i.getCNIC());
    }
}
