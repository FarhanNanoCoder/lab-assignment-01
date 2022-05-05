public class Test2 {
    private String id;
    private  String email;
    private float cgpa;

    public Test2(String id, String email, float cgpa) {
        this.id = id;
        this.email = email;
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
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
