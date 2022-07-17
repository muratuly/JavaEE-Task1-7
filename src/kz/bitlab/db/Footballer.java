package kz.bitlab.db;

public class Footballer {
    private String name;
    private String surname;
    private int salary;
    private String club;
    private int transferPrice;

    public Footballer(){

    }

    public Footballer(String name, String surname, int salary, String club, int transferPrice) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.club = club;
        this.transferPrice = transferPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(int transferPrice) {
        this.transferPrice = transferPrice;
    }
}
