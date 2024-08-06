package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping(value = "/getRestaurant")
    public String getRestaurant(){
        return "get";
    }
    @PostMapping(value = "/addRestaurant")
    public String addRestaurant(){
        return "post";
    }
    @PutMapping(value = "/updateRestaurant")
    public String updateRestaurant(){
        return "put";
    }
    @DeleteMapping(value = "/deleteRestaurant")
    public String deleteRestaurant(){
        return "delete";
    }


}
