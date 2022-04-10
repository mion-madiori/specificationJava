package fr.madiori.specification.entity;

public class Person {
    private String firstname;
    private String lastname;
    private Integer age;
    private Boolean isMale;

    public Person(String firstname, String lastname, Integer age, Boolean isMale){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.isMale = isMale;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Boolean getMale() {
        return isMale;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
