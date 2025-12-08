package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean
 * Data class που εχει
 * -private πεδία
 * -default constructor
 * -getters & setters με συμβάσεις
 */
public class Student {
    private static int studentsCount;

    //static block - δεν χρησιμοποίητε ιδιαίτερα- μόνο σε περιπτώσεις που υπάρχει if etc
    static {
        studentsCount = 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    //default constructor
    public Student() {
        studentsCount++;
    }
    //overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

}
