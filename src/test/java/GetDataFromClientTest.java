
import Example.Service.GetDataFromClientService;
import Example.Service.TransformerForData1;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest(classes = GetDataFromClientTest.class)
@ContextConfiguration
public class GetDataFromClientTest {

    @Mock
    private GetDataFromClientService getDataFromClientService;

    @Mock
    private TransformerForData1 TransformerForData1;


    @Test
    public void serviceTransformerTest() throws Exception {


       // ResponseEntity<Object> response=new ResponseEntity<>(HttpStatus.OK);
        Mockito.when(TransformerForData1.getDataFromClientData1()).thenReturn(returnData());

        String Uri="https://w349z3oss6.execute-api.eu-west-2.amazonaws.com/prod/data-1";


        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<Object> response = testRestTemplate.
                postForEntity(Uri,null ,Object.class);
        //List<Object> l=getDataFromClientService.callingData();
        Assertions.assertNotNull(response);
    }

    private List<Object> returnData(){
        List<Object> list=new ArrayList<>();
        list.add("Dummy-Data");
        return list;
    }
}
