public class Test2 {
    private String id;
    private  String email;
    private int courses;

    public Test2(String id, String email,int courses) {
        this.id = id;
        this.email = email;
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }
    
    public void setCourses(int courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
