package geekbrains.vido;

public class Collaborator {
    private String fio;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Collaborator(String fio, String post, String email, String phone, int salary, int age){
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + this.fio + ", должность: " + this.post + ", почта: " + this.email + ", телефон: " + this.phone + ", зарплата: " + this.salary + ", возраст: " + this.age);
    }

    public String getFio() {
        return fio;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
