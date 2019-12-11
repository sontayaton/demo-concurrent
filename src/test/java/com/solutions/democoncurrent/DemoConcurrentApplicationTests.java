package com.solutions.democoncurrent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class DemoConcurrentApplicationTests {

	@Autowired
	private MockMvc mockMvc;



	@Test
	void contextLoads() throws Exception {


		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i =0 ; i<10;i++) {
			executorService.submit(new Callable<String>() {
				@Override
				public String call() throws Exception {
					try {

						mockMvc.perform(get("/getProcessNumber"));
						return "OK";
					} catch (Exception e) {
						e.printStackTrace();
						return e.getMessage();
					}
				}


			});
			Thread.sleep(100);
		}
		executorService.awaitTermination(10, TimeUnit.SECONDS);


	}

}
