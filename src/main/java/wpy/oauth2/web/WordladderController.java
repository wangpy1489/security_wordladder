package wpy.oauth2.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wpy.oauth2.WordLadder;


import java.util.ArrayList;
import java.util.List;

@Controller
public class WordladderController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value="/solver")
    @ResponseBody
    public List<String> func(String begin, String end) {
        WordLadder wl = new WordLadder();
        wl.createLadder(begin, end);
        logger.info("begin",begin,"end:",end);
        List<String> ladder1;
        int length = wl.getLadderStep();
        if (length > 0) {
            ladder1=new ArrayList<>(wl.getLadderStack());
        } else {
            ladder1=null;
        }
        logger.info("ladder:{}",ladder1);
        return ladder1;
    }
}
