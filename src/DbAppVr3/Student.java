package DbAppVr3;

public class Student {

        private Integer id;
        private String firstname;
        private String lastname;
        private Integer year_of_birth;
        private Float average_mark;

    public Student(Integer id, String firstname, String lastname, Integer year_of_birth, Float average_mark) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.year_of_birth = year_of_birth;
        this.average_mark = average_mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public Float getAverage_mark() {
        return average_mark;
    }

    public void setAverage_mark(Float average_mark) {
        this.average_mark = average_mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year_of_birth=" + year_of_birth +
                ", average_mark=" + average_mark +
                '}';
    }

}
