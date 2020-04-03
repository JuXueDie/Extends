class Father {
    public int money = 1000000;
    public String name;
    public int age;
    
    public void undertaking() {
        System.out.println("父親的事業");
    }
}
class Son extends Father {
    Son(String n, int a) { // 建構子
        name = n;
        age = a;
    }
}
public class Extends {
    public static void main(String[] args) {
        Son son = new Son("Kevin", 23);
        son.undertaking();
        System.out.println("金額: " + son.money + " 名字: " + son.name + " 年齡: " + son.age);
    }
}