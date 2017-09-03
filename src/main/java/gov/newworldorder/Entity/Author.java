package gov.newworldorder.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authors")
public class Author implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
