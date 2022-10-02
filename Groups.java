public class Groups {
    private int id;
    private String firstStudent;
    private String secondStudent;
    private String thirdStudent = "";

    public Groups(int id, String firstStudent, String secondStudent) {
        this.id = id;
        this.firstStudent = firstStudent;
        this.secondStudent = secondStudent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstStudent(String name) {
        this.firstStudent = name;
    }

    public String getFirstStudent() {
        return this.firstStudent;
    }

    public void setSecondStudent(String name) {
        this.secondStudent = name;
    }

    public String getSecondStudent() {
        return this.secondStudent;
    }

    public void setThridStudent(String name) {
        this.thirdStudent = name;
    }

    public String getThridStudent() {
        return this.thirdStudent;
    }

}