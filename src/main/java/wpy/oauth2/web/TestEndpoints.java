package wpy.oauth2.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author 徐靖峰
 * Date 2018-04-19
 */
@Controller
public class TestEndpoints {

//    @GetMapping("/product/{id}")
//    public String getProduct(@PathVariable String id) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return "product id : " + id;
//    }
//
    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + id;
    }
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String home() {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            return "index";
            }

    @GetMapping("/hello")
    public String welcome(Model model){
        model.addAttribute("name", "小伙伴");
        return "hello";
    }


}
