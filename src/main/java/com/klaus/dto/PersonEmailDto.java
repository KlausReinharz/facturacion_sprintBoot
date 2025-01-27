package com.klaus.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class PersonEmailDto {
    private String name;
    private String lastName;
}
