package org.andy.springboot.project.common.advice;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class ExceptionData {

    @Singular
    private final List<Object> errors;

}