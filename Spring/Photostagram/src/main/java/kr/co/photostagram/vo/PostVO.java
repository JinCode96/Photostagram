package kr.co.photostagram.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostVO {

    private int no;
    private String content;
    private int user_no;
    private String rdate;
    private List<MultipartFile> files;
    private String urls[];
}
