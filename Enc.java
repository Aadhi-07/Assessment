class employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
        else {
            System.out.println("not eligible");
        }
    }
}
public class Enc {
    public static void main(String[] args) {
        employee myObj = new employee();
        myObj.setAge(34);
        System.out.println(myObj.getAge());
    }
}