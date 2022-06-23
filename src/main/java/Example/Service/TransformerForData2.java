package Example.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class TransformerForData2 {
    @Autowired
    private RestTemplate restTemplate;

    Logger logger =LoggerFactory.getLogger(TransformerForData2.class);
    public List<Object> getDataFromClientData2() {
        //   Object[] data=new Object[]
        Object data2     =restTemplate.
                postForObject("https://w349z3oss6.execute-api.eu-west-2.amazonaws.com/prod/data-2",
                        null , Object.class);

        return List.of(Objects.requireNonNull(data2));
    }

}
