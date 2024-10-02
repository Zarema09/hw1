public class Main {
    public static void main(String[] args) {
        Father objectA = new Father("Aleksandr",38,"FEMALE");
        System.out.println(objectA.getAge());
        System.out.println(objectA.getName());
        System.out.println(objectA.getGender());
        System.out.println("--------------------");
    Son objectB = new Son ("Dim",15,"FEMALE");
    System.out.println(objectB.getAge());
    System.out.println(objectB.getName());
    System.out.println(objectB.getGender());
        System.out.println("-----------------------");
    Son objectC = new Son ("Bred",17,"FEMALE");
    System.out.println(objectC.getAge());
    System.out.println(objectC.getName());
    System.out.println(objectC.getGender());
    objectC.makeSay();
    objectC.makeSay("HELLO!");

    }
}
