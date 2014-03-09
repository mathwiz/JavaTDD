package tdd.templates;

import tdd.model.GolfBall;

import java.util.List;

/**
 * Created by Yohan on 3/9/14.
 */
public interface GolfBallDao {
    List<GolfBall> findAll();
}
