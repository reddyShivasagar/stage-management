package com.dropdown.repositary;

//DropDownRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

import com.dropdown.entity.DropDown;

public interface DropDownRepository extends JpaRepository<DropDown, Long> {
 // No need to add additional methods if only GET mapping is required
}

