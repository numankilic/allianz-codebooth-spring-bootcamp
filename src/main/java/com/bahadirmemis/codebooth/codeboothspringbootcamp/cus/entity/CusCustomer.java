package com.bahadirmemis.codebooth.codeboothspringbootcamp.cus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Table(name = "CUS_CUSTOMER")
@Getter
@Setter
public class CusCustomer implements Serializable {

    @Id
    @SequenceGenerator(name = "CusCustomer", sequenceName = "CUS_CUSTOMER_ID_SEQ")
    @GeneratedValue(generator = "CusCustomer")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surname;

    @Column(name = "IDENTITY_NO", nullable = false)
    private Long identityNo;

    @Column(name = "PASSWORD", nullable = false)
    private String password;
}
