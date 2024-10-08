package kg.mega.mega_taxi.services;


import kg.mega.mega_taxi.model.Users;
import kg.mega.mega_taxi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Consumer;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(Users user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public boolean updateUser(Users user, Long id){
        Users userToUpdate = userRepository.findById(id).orElse(null);
        if(userToUpdate != null){
            userToUpdate.setFirstName(user.getFirstName());
            userToUpdate.setLastName(user.getLastName());
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setPhoneNumber(user.getPhoneNumber());
            userRepository.save(userToUpdate);
            return true;
        }else{
            return false;
        }
    }

    public Users getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }


}
