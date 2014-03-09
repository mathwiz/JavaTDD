package tdd.templates;

import tdd.model.GolfClub;

import java.util.List;

/**
 * Created by Yohan on 3/9/14.
 */
public interface GolfClubDao {
    List<GolfClub> findAll();
}
