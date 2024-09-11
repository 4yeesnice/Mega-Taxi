package kg.mega.mega_taxi.model;

import jakarta.persistence.*;

public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "number_plate")
    private String numberPlate;

    @OneToOne
    @JoinColumn(name = "id_users")
    private Users user;

}
