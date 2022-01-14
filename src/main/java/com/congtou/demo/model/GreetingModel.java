package com.congtou.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GreetingModel {

    private final long id;
    private final String content;
}
