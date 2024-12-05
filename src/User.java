import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private transient String password;
    private String email;
    private String username;
    private static final long serialVersionUID = 1L;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name, String password, String email, String username) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
