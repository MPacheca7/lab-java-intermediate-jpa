package com.example.demo.models;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("INTERNAL")
public class InternalTask {
    public InternalTask() {
    }
}
