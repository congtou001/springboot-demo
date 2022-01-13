package com.congtou.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.congtou.demo.model.GreetingModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/greeting")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value="/")
	public GreetingModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingModel(counter.incrementAndGet(), String.format(template, name));
	}
}
