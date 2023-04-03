package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileUpload extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private Integer size;

    public FileUpload(File aggregate) {
        super(aggregate);
    }

    public FileUpload() {
        super();
    }
}
