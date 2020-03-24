package com.target.phoneservice.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "samaia", name = "phone")
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", columnDefinition = "BIGINT", nullable = false, updatable = false)
    private Long id;

    @Column(name = "number", columnDefinition = "BIGINT", nullable = false)
    private Long number;

    @Column(name = "area_code", columnDefinition = "VARCHAR", length = 3, nullable = false)
    private String areaCode;
}
