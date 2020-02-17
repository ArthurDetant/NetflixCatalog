package dao;

import java.util.ArrayList;
import java.util.List;

import dos.SerieDO;

public class SerieDAO {
	public List<SerieDO> findAll(){
		List<SerieDO> series = new ArrayList<>();
		series.add(new SerieDO(1,"La casa de papel",true ,2017));
		series.add(new SerieDO(2,"The 100",false ,2017));
		series.add(new SerieDO(3,"Black Mirror",true ,2017));
		return series;
		
	}
}
