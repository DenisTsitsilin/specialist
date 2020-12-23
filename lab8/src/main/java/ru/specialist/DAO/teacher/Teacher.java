package ru.specialist.DAO.teacher;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "teachers")
public class Teacher {
    private int id;
    private String name;
    private String addr;
    private String phone;
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column (name = "id")
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    @Column (name = "name")
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    @Column (name = "addr")
    public String getAddr() { return addr; }
    public void setAddr(String addr) { this.addr = addr; }
    @Column (name = "phone")
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
