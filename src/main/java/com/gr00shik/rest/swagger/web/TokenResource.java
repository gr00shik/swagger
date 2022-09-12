package com.gr00shik.rest.swagger.web;

import com.gr00shik.rest.swagger.dto.TokenResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user/token")
public class TokenResource {

    @GetMapping
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "return token by username", content = @Content(schema = @Schema(implementation = TokenResponse.class))),
            @ApiResponse(responseCode = "400", description = "user not found", content = @Content(schema = @Schema(implementation = TokenResponse.class))),
    })
    @Tag(name = "Token operation", description = "all operation for Token")
    public ResponseEntity<TokenResponse> get(@Parameter(name = "username", description = "user name as email", example = "test@test.com") @RequestParam String username) {
        return ResponseEntity.ok(new TokenResponse("test token"));
    }

}
