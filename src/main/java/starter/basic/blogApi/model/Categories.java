package starter.basic.blogApi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="CATEGORIES_INFO")
public class Categories {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="CATEGORY_ID")
    private Integer id;
    private String title;
    private String description;
    @OneToMany
    @JoinTable
            (
                    name="TAG_POST",
                    joinColumns={ @JoinColumn(name="CATEGORY_ID", referencedColumnName="CATEGORY_ID") },
                    inverseJoinColumns={ @JoinColumn(name="POST_ID", referencedColumnName="POST_ID", unique=true) }
            )
    private List<Posts> posts;
}
