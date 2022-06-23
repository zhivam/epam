package Example.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Component
public class TransformerForData1 {

    private static final Logger logger =  LoggerFactory.getLogger(TransformerForData1.class);
    @Autowired
    private RestTemplate restTemplate;
    public List<Object> getDataFromClientData1() {
        logger.info("calling data-1 via Rest..");
        Object data1     = restTemplate.
                postForObject("https://w349z3oss6.execute-api.eu-west-2.amazonaws.com/prod/data-1",
                        null,Object.class);

        return List.of(Objects.requireNonNull(data1));
    }



}
