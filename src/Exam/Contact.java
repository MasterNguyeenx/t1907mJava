package Exam;

public class Contact {
    String name;
    String company;
    String mail;
    String number;

    public Contact() {
    }

    public Contact(String name, String company, String mail, String number) {
        this.name = name;
        this.company = company;
        this.mail = mail;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", mail='" + mail + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
