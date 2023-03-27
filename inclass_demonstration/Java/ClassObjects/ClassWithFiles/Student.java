class Student {
    protected String name;
    protected int age;
    protected String major;

    Student() {
        this.name = "";
        this.age = -1;
        this.major = "Undecided";
    }

    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getMajor() {
        return this.major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return this.name + " is a " + this.major + " with age " + this.age;
    }
}