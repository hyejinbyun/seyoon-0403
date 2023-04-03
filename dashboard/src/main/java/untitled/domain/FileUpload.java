package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileUpload extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private Integer size;
}
