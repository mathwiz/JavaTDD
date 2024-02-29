package tdd.templates;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import tdd.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Yohan on 3/9/14.
 */
@Ignore
public class GolfClubServiceTest {
    GolfClubService service;

    @Before
    public void setUp() throws Exception {
        service = new GolfClubService(new GolfClubDao() {
            @Override
            public List<GolfClub> findAll() {
                return Arrays.asList(
                        new Putter("Ping", "Anser"),
                        new Driver("Callaway", "Big Bertha"),
                        new Driver("Callaway", "Warbird"),
                        new Driver("Taylor Made", "Jetspeed"),
                        new Putter("Titleist", "Scotty Cameron"),
                        new PitchingWedge("Cleveland", "588"),
                        new SandWedge("Cleveland", "588"),
                        new ThreeIron("Nike", "VR"),
                        new ThreeIron("Mizuno", "MP-69"),
                        new ThreeIron("Callaway", "X Hot")
                );
            }
        });
    }

    @Test
    public void testIndexByBrand() throws Exception {
        Map<String, List<GolfClub>> map = service.indexByBrand();
        Assert.assertEquals(3, map.get("Callaway").size());
        Assert.assertEquals(2, map.get("Cleveland").size());
        Assert.assertEquals(1, map.get("Titleist").size());
    }

    @Test
    public void testIndexByClubNumber() throws Exception {
        Map<ClubNumber, List<GolfClub>> map = service.indexByClubNumber();
        Assert.assertEquals(3, map.get(ClubNumber.Driver).size());
        Assert.assertEquals(2, map.get(ClubNumber.Putter).size());
        Assert.assertEquals(3, map.get(ClubNumber.ThreeIron).size());
    }
}
