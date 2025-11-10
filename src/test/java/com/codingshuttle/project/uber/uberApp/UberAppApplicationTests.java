package com.codingshuttle.project.uber.uberApp;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.codingshuttle.project.uber.uberApp.services.EmailSenderService;

@SpringBootTest
class UberAppApplicationTests {
@MockBean
    private EmailSenderService emailSenderService;

    @Test
    void contextLoads() {
        emailSenderService.sendEmail(
                "test@example.com",
                "Subject",
                "Body"
        );
        verify(emailSenderService, times(1)).sendEmail(anyString(), anyString(), anyString());
    }




	@Test
	void sendEmailMultiple() {
		String emails[] = {
				"xijafe6055@apifan.com",
				"amansinghgautam786786@gmail.com"
		};
		emailSenderService.sendEmail(emails, "Hello from the UBER Application demo",
				"This is a good body, Keep coding!");
	}

}
