package jandbboard.api.controller;

import jandbboard.api.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/test")
    public String getTestBoard(){
        log.debug("##############################################");
        log.debug("test :: getTestBoard() :: {}","hi");
        log.debug("##############################################");
        return boardService.getTestBoard();
    }
}
