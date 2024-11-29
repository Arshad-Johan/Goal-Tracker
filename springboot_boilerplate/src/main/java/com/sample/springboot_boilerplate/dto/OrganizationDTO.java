package com.sample.springboot_boilerplate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDTO {
    private Integer id;
    private String name;
    private String description;
}
