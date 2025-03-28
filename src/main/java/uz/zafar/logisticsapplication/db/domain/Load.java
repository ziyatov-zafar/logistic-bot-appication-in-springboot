package uz.zafar.logisticsapplication.db.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "load11")
@Entity
@Getter
@Setter
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "to_address_and_from_address")
    private String toAddressAndFromAddress;

    private String name;
    private String weight;
    private String price;

    @Column(name = "car_count")
    private Integer carCount;

    @Column(name = "full_name")
    private String fullName;

    private String advance;
    private Boolean isAdvance;

    @Column(name = "payment_type")
    private String paymentType;

    private String phone;

/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
*/
    private Long userId;

    private Boolean active;
    private String status;
}
