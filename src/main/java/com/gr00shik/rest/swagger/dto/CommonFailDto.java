package com.gr00shik.rest.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonFailDto {
    @Schema(example = "400", description = "String representation of error code")
    @NotNull
    private String code;
    @Schema(example = "get by id", description = "operation that throws error")
    private String operation;
    private String message;
}
