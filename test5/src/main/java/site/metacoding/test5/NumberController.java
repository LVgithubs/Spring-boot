@RestController
public class NumberController {

    @GetMapping("/number")
    public Integer number(){
        return 1;
    }
    
    
}
