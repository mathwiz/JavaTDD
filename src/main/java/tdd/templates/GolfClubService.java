package tdd.templates;

import tdd.model.ClubNumber;
import tdd.model.GolfClub;
import tdd.util.Function;
import tdd.util.Maps;

import java.util.List;
import java.util.Map;

/**
 * Created by Yohan on 3/9/14.
 */
public class GolfClubService extends EquipmentService<GolfClub> {
    private GolfClubDao dao;

    public GolfClubService() {
    }

    public GolfClubService(GolfClubDao dao) {
        this.dao = dao;
    }

    public Map<String, List<GolfClub>> indexByBrand() {
        return Maps.multimap(dao.findAll(), new Function<GolfClub, String>() {
            @Override
            public String apply(GolfClub input) {
                return input.getBrand();
            }
        });
    }

    public Map<ClubNumber, List<GolfClub>> indexByClubNumber() {
        return Maps.multimap(dao.findAll(), new Function<GolfClub, ClubNumber>() {
            @Override
            public ClubNumber apply(GolfClub input) {
                return input.getNumber();
            }
        });
    }
}
