import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 46275 on 2018/12/12.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.github.pig.declare","com.github.pig.common.bean"})
public class DaclareApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(DaclareApplication.class,args);
    }
}
