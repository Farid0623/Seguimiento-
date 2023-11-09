package map;

public class Employees {
    public String name;
    public int age;
    public int phone;
    public String business;
    public int salary;

    public Employees(String name, int age, int phone, String business, int salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.business = business;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


