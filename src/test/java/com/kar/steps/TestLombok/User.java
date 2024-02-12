package com.kar.steps.TestLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate lastUpdated;
    private boolean active;

}