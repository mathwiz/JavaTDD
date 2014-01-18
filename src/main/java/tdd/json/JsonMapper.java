package tdd.json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import tdd.model.GolfBall;

import java.io.IOException;
import java.util.List;

/**
 * Created by Yohan on 1/16/14.
 */
public class JsonMapper {
    public List<GolfBall> deserialize(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<GolfBall>(){});
    }

    public String serialize(List<GolfBall> objects) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(objects);
    }
}
