public class Student {
    private String name;
    private int age;
    private boolean isStudent;

    public Student(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }
}
