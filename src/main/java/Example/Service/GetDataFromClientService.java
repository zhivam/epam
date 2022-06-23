package Example.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class GetDataFromClientService {

   private static final Logger logger = LoggerFactory.getLogger(GetDataFromClientService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    TransformerForData1 transformerForData1;
    @Autowired TransformerForData2 transformerForData2;

public Object callingData() throws Exception {

    logger.info("in GetDataFromClientService service class... ");
  // calling transformerForData1 to get list of data-1
    logger.info("fetching data from transformer layer-1..");
    try {
        List<Object> list=new ArrayList<>();
        List<Object> list1 = transformerForData1.getDataFromClientData1();

        // calling transformerForData2 to get list of data-2
        logger.info("fetching data from transformer layer-2..");
        List<Object> list2 = transformerForData2.getDataFromClientData2();
        list.add(list1);
        list.add(list2);
        logger.info("adding data..");
//        ObjectMapper objectMapper=new ObjectMapper();
//      String parsedList1 =  objectMapper.writeValueAsString(list1);
//      String parsedList2 =  objectMapper.writeValueAsString(list2);
//        String merged = parsedList1.substring(0, parsedList1.length() - 1) + "," +
//                parsedList2.substring(1);
//        JSONObject mergedJson = new JSONObject(merged);

//        JSONObject jsonObject = (JSONObject) JSONValue.parse(new ObjectMapper().writeValueAsString(JavaObject))
////        logger.info("adding data..");
//        logger.info("adding data..12");
//            JSONObject mergedJSON = new JSONObject();
//
//                // getNames(): Get an array of field names from a JSONObject.
//                logger.info("adding data55..");
//                mergedJSON = new JSONObject(mJSONObject, JSONObject.getNames(mJSONObject));
//
//                for (String crunchifyKey : JSONObject.getNames(mJSONObject2)) {
//
//                    // get(): Get the value object associated with a key.
//
//                    mergedJSON.put(crunchifyKey, mJSONObject2.get(crunchifyKey));
//
//                }

        // Collections.addAll(list1,list2);
     // list1.addAll(list2);
        logger.info("adding data.2.");

    return  list;
    }
    catch (Exception e) {
        logger.error("error occured while calling transformer..");
    }
    return null;
}

}
