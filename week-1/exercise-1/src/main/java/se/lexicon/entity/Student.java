package se.lexicon.entity;

public class Student {

    private String firstName;
    private String lastName;

    public Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString(){
        return firstName;
    }

    public static class StudentBuilder {

        private String firstName;
        private String lastName;

        public StudentBuilder() {}

        public StudentBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Student build() {
            return new Student (this);
        }

    }
}
