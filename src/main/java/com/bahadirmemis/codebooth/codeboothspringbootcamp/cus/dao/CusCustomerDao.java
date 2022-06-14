package com.bahadirmemis.codebooth.codeboothspringbootcamp.cus.dao;

import com.bahadirmemis.codebooth.codeboothspringbootcamp.cus.entity.CusCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public interface CusCustomerDao extends JpaRepository<CusCustomer, Long> {

}
