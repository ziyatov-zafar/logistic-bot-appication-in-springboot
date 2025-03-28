package uz.zafar.logisticsapplication.db.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private Long userId;
    private Long serviceId ;
    private Long countryId ;
    private String phone ;
    private Boolean active;
    private String status ;

}
