package entity;


public class Student extends Person {

    private String batch;
    private boolean active;

    // Constructor overloading (WITHOUT email)
    public Student(int id, String firstName, String lastName, String batch) {
        super(id, firstName, lastName, null);
        this.batch = batch;
        this.active = true;
    }

    // Constructor overloading (WITH email)
    public Student(int id, String firstName, String lastName, String email, String batch) {
        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = true;
    }

    @Override
    public String getDisplayName() {
        return "Student: " + super.getDisplayName();
    }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
