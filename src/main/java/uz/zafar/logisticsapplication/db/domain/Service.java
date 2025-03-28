package uz.zafar.logisticsapplication.db.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "services")
@Entity
@Getter
@Setter
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nameUz;
    @Column(unique = true)
    private String nameRu;
    private String status;
    private Boolean active;
}
