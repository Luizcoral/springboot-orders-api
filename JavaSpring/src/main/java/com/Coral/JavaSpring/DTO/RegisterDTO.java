package com.Coral.JavaSpring.DTO;

import com.Coral.JavaSpring.entities.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
