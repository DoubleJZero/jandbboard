package jandbboard.api.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
public class BoardService {

    public String getTestBoard(){
        log.debug("##############################################");
        log.debug("test :: getTestBoard() :: {}","hello");
        log.debug("##############################################");

        return "hello JandB!";
    }
}
