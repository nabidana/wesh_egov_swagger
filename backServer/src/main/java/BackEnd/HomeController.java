package BackEnd;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String index(){
        return "BackEnd Server is Alive";
    }
    
}
