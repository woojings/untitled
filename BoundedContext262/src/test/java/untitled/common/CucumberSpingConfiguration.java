package untitled.common;


import untitled.BoundedContext262Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext262Application.class })
public class CucumberSpingConfiguration {
    
}
