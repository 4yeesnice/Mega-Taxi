package kg.mega.mega_taxi.model;

import jakarta.persistence.*;

public class OrdersHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "source_point")
    private String sourcePoint;

    @Column(name = "destination_point")
    private String destinationPoint;

    @OneToOne
    @JoinColumn(name = "client")
    private Users client;

    @OneToOne
    @JoinColumn(name = "driver")
    private Users driver;

    @Column(name = "price")
    private double price;

    @OneToOne
    @JoinColumn(name = "status_order")
    private OrderStatus statusOrder;

}
