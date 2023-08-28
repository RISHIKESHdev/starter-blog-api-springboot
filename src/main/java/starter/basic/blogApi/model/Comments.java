package starter.basic.blogApi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="COMMENTS_INFO")
public class Comments {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="COMMENT_ID")
    private Integer id;
    private Integer postId;
    private Integer parentId;
    private Integer userId;
    private Date createdAt;
    private Date updatedAt;
    private String content;

}
