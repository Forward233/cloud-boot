package com.cloud.service;

import com.consumer.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ServiceApplicationTests.class)
@RunWith(MockitoJUnitRunner.class)
class ServiceApplicationTests {


    @Mock
    private UserService userService;
    
    @Test
    void contextLoads() {
    }

    @Test
    void mockTest() {
        OngoingStubbing<String> test_mock_prop = Mockito.when(userService.testNacosDynamicProp()).thenReturn("test mock prop");
    }



}
