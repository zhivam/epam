import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = GetDataFromClientTest.class)
@ContextConfiguration

public class GetData2FromClientTest {


    @Mock
    private Example.Service.TransformerForData2 transformerForData2;

    @Test
    public void data2ClientSuccessfullyReturns() throws Exception  {

        String Uri="https://w349z3oss6.execute-api.eu-west-2.amazonaws.com/prod/data-2";

        Mockito.when(transformerForData2.getDataFromClientData2()).thenReturn(returnData());
        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<Object> response = testRestTemplate.
                postForEntity(Uri, null, Object.class);

        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }
    private List<Object> returnData(){
        List<Object> list=new ArrayList<>();
        list.add("Dummy-Data");
        return list;
    }
}
