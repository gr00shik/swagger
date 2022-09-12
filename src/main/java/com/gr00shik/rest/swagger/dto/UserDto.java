package com.gr00shik.rest.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserDto {
    private Long id;
    @NotNull
    private String name;
    @Schema(example = "key:value; key2:value2", description = "Key - value pairs, split by ;")
    private String someProp;
}
