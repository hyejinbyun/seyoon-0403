package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Boolean isIndexed;
    private Boolean isUploaded;
    private String videoUrl;
    private String path;
    private Integer size;
    private String name;
}
