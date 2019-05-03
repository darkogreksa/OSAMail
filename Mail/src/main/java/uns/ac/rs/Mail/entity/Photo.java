package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "photo")
public class Photo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "path", unique = false, nullable = false)
    private String path;

//    @Column(name = "bitmap", unique = false, nullable = false)
//    private Bitmap path;


    public Photo() {
    }

    public Photo(Integer id, String path) {
        this.id = id;
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
