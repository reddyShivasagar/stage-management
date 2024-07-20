package com.dropdown.service;

//DropDownService.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dropdown.entity.DropDown;
import com.dropdown.repositary.DropDownRepository;

import java.util.List;

@Service
public class DropDownService {

 @Autowired
 private DropDownRepository dropDownRepository;

 public List<DropDown> getAllDropDowns() {
     return dropDownRepository.findAll();
 }
}



