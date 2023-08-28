package starter.basic.blogApi.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="USERS_INFO")
public class Users {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="USER_ID")
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer mobile;
    private String email;
    private String password;
    private Date registeredAt;
    private Date lastLogin;
    private String userName;
    private String Proffession;
    @OneToMany
    @JoinTable
            (
                    name="USER_POST",
                    joinColumns={ @JoinColumn(name="USER_ID", referencedColumnName="USER_ID") },
                    inverseJoinColumns={ @JoinColumn(name="POST_ID", referencedColumnName="POST_ID", unique=true) }
            )
    private List<Posts> posts;

}
