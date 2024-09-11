package kg.mega.mega_taxi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private String color;

    @Column(name = "number_plate")
    private String numberPlate;

    @OneToOne
    @JoinColumn(name = "id_users")
    private Users user;

}
