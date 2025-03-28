package uz.zafar.logisticsapplication.db.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "countries1")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameUz;
    private String nameRu;
    private Boolean active;
    private String status;
    private Long serviceId;
}
