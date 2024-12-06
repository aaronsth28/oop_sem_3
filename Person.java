public class Person {
    String name="Harry Potter";
    int age=18;
    String gender="Male";
    String pet="Rock";

    class Man{
        String name="Himamshu";
        int age=18;
        String gender="Male";
        String pet="Rock";
    }

    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.gender);
        System.out.println(obj.pet);


        Man obj1 = obj.new Man();
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.gender);
        System.out.println(obj1.pet);
    }
}
