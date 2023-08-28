package starter.basic.blogApi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="TAGS_INFO")
public class Tags {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="TAG_ID")
    private Integer id;
    private String title;
    private String description;

    @OneToMany
    @JoinTable
            (
                    name="TAG_POST",
                    joinColumns={ @JoinColumn(name="TAG_ID", referencedColumnName="TAG_ID") },
                    inverseJoinColumns={ @JoinColumn(name="POST_ID", referencedColumnName="POST_ID", unique=true) }
            )
    private List<Posts> posts;

}
