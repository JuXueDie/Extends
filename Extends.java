class Father {
    public int money = 1000000;
    public String name;
    public int age;
    
    public void undertaking() {
        System.out.println("���˪��Ʒ~");
    }
}
class Son extends Father {
    Son(String n, int a) { // �غc�l
        name = n;
        age = a;
    }
}
public class Extends {
    public static void main(String[] args) {
        Son son = new Son("Kevin", 23);
        son.undertaking();
        System.out.println("���B: " + son.money + " �W�r: " + son.name + " �~��: " + son.age);
    }
}