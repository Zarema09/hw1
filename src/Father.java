public class Father extends Grandfather{
    private String name;
    private int age;
    private String gender;
    public Father() {}
    public Father(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getName() {
        return name;
    }
    public void makeSay () {
        System.out.println("Hi");
    }
    final public void makeSay (String Say) {
        System.out.println(Say);

    }
}
