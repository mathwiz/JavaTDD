package tdd.templates;

import tdd.model.GolfBall;
import tdd.util.Function;
import tdd.util.Maps;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * Created by Yohan on 3/9/14.
 */
public class GolfBallService extends EquipmentService<GolfBall> {
    private GolfBallDao dao;

    public GolfBallService() {
    }

    public GolfBallService(GolfBallDao dao) {
        this.dao = dao;
    }

    public Map<String, List<GolfBall>> indexByBrand() {
        return super.indexByBrand(dao.findAll());
    }

    public Map<Integer, List<GolfBall>> indexByCompression() {
        Method m = getMethod(GolfBall.class, "getCompression");
        return super.index(dao.findAll(), m);
    }
}
