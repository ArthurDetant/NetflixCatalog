package dao;
import dos.SeasonDO;

import java.util.ArrayList;
import java.util.List;

public class SeasonDAO {

	/**
	 * Javadoc
	 * @return
	 */
	public List<SeasonDO> findAll(){
		List<SeasonDO> seasons = new ArrayList<>();
		seasons.add(new SeasonDO(1,1,1,13));
		seasons.add(new SeasonDO(2,1,2,9));
		seasons.add(new SeasonDO(3,2,1,13));
		seasons.add(new SeasonDO(4,2,2,16));
		seasons.add(new SeasonDO(5,2,3,16));
		seasons.add(new SeasonDO(6,2,4,13));
		seasons.add(new SeasonDO(7,3,1,3));
		seasons.add(new SeasonDO(8,3,2,4));
		seasons.add(new SeasonDO(9,3,3,6));
		seasons.add(new SeasonDO(10,3,4,6));
		return seasons;
		
		
	}
}
