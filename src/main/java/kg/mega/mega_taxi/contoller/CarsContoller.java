package kg.mega.mega_taxi.contoller;

import kg.mega.mega_taxi.model.Cars;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/cars")
public class CarsContoller {

    @PostMapping("/create_car")
    public void createUser(@RequestBody Cars car){
        // Todo
    }

    @DeleteMapping("/delete_car")
    public void deleteUser(@RequestParam int id){
        // Todo
    }

    @PutMapping("/update_car_{id}")
    public void updateUser(@RequestBody Cars car, @PathVariable int id){
        // TODO
    }

    @GetMapping("/get_car")
    public void getUser(@RequestParam int id){
        // Todo
    }
}
