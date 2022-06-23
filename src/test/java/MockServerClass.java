import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.TimeUnit;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.matchers.Times.exactly;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.model.StringBody.exact;

public class MockServerClass {

    private static ClientAndServer mockServer;

    @Before
    public void startSpringBoot(){

        mockServer = startClientAndServer(1081);
    }


    @After
    public void stopServer() {
        if (mockServer != null) {
            mockServer.stop();
        }
    }



//    @Test
//    public void mockServer() {
////        String s="""{
////        {
////            "first_name": "Elsy",
////             "last_name": "Chmarny",
////                "email": "echmarny0@posterous.com",
////                "gender": "Female"
////        }}""";
////
//        ResponseEntity response=new ResponseEntity<>(HttpStatus.OK);
//
//        new MockServerClient("127.0.0.1", 1081).
//                when(request().
//                                withMethod("Get").
//                                withPath("/getDataFromClient/getData").
//                                withBody(exact(null)),
//                        exactly(1)).
//                respond(response().
//                        withStatusCode(200));
//
//
//        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
//
//    }

}