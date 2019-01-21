package com.example.demo.domain;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class Dummy implements Serializable {

   
	private static final long serialVersionUID = 3049262379491824566L;

	private Long id;

    private String value;

    public Dummy() {
        // Default constructor is required for JPA
    }

    public Dummy(String value) {
        if (StringUtils.isEmpty(value)) {
            throw new InvalidDummmyException("value cannot be null or empty");
        }
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
