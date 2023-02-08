package com.food.ordering.system.application.handler;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private final String code;
    private final String message;
}
