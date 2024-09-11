package kg.mega.mega_taxi.contoller;


import kg.mega.mega_taxi.model.Users;
import kg.mega.mega_taxi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create_user")
    public void createUser(@RequestBody Users user){
        // Todo
    }

    @DeleteMapping("/delete_user")
    public void deleteUser(@RequestParam Long id){
        // Todo
    }

    @PutMapping("/update_user_{id}")
    public void updateUser(@RequestBody Users user, @PathVariable Long id){
        // TODO
    }

    @GetMapping("/get_user")
    public void getUser(@RequestParam Long id){
        // Todo
    }
}
