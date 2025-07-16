package com.packt.aws.books.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import software.amazon.codeguruprofilerjavaagent.Profiler;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Profiler.builder().profilingGroupName("testetete").withHeapSummary(true) // optional - to start without heap
																					// profiling, set to false or remove
																					// line
				.build().start();

		SpringApplication.run(DemoApplication.class, args);
	}

}
