package com.dropdown.controller;


	// DropDownController.java

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.dropdown.entity.DropDown;
import com.dropdown.service.DropDownService;

import java.util.List;

	@RestController
	@RequestMapping("/api/dropdowns")
	@CrossOrigin("*")
	public class DropDownController {

	    @Autowired
	    private DropDownService dropDownService;

	    // Get all DropDown items
	    @GetMapping
	    public List<DropDown> getAllDropDowns() {
	        return dropDownService.getAllDropDowns();
	    }
	}

	


