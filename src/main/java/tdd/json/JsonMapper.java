package tdd.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import tdd.model.GolfBall;

import java.util.List;

/**
 * Created by Yohan on 1/16/14.
 */
public class JsonMapper {
    public List<GolfBall> deserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        return null;
    }

    public String serialize(List<GolfBall> objects) {
        return null;
    }
}
