package com.fullcycle.catalog.admin.microservice.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {


    @Test
    public void newUseCaseTest() {
        Assertions.assertNotNull(new CreateCategoryUseCase());
    }
}
