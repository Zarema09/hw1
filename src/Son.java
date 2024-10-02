public final class Son extends Father {
    private String name;
    private int age;
    private String gender;
    public Son() {

    }
    public Son(String name, int age, String gender) {
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
    public void makeSay(){
        System.out.println("Hi");
    }
}