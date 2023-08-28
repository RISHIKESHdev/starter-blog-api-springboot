package starter.basic.blogApi.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity@Table(name="POST_INFO")
public class Posts {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="POST_ID")
    private Integer id;
    private Integer tagId;
    private Integer categoryId;
    private String userID;
    private String title;
    private String summary;
    private Date createdAt;
    private Date publishedAt;
    private Date updatedAt;
    private String content;
}

