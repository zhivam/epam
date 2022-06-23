package Example.Controller;

import Example.Service.GetDataFromClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getDataFromClient")
public class GetDataFromClientController {

    private static final Logger logger =  LoggerFactory.getLogger(GetDataFromClientController.class);
    @Autowired
    private GetDataFromClientService getDataFromClientService;


    @GetMapping("/getData")
    public Object getDataFromClient()throws Exception{
        logger.info("in controller GetDataFromClientController class... ");
      return getDataFromClientService.callingData();
    }


}
