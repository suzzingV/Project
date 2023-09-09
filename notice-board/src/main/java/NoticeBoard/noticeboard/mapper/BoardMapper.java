package NoticeBoard.noticeboard.mapper;

import NoticeBoard.noticeboard.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount(); //곧 생성할 BoardMapper.xml 첫번째 sql문의 id와 같음
    List<Board> getList();
    Board getBoard(Long boardId);

    void uploadBoard(Board board);
}
