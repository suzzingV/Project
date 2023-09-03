package NoticeBoard.noticeboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "NoticeBoard.noticeboard")
public class NoticeBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticeBoardApplication.class, args);
	}

}
