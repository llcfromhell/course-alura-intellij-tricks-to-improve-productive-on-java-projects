package br.com.alura.bytebank;

import java.time.LocalDate;

public class Employee {

    private String name;
    private int subscription;
    private LocalDate birthday;

    public Employee(String name, int subscription, LocalDate birthday) {
        this.name = name;
        this.subscription = subscription;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", subscription=" + subscription +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
