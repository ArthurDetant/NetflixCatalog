package bo;

import java.util.ArrayList;
import java.util.List;

import dao.SeasonDAO;
import dao.SerieDAO;
import dos.SeasonDO;
import dos.SerieDO;
import dto.SerieDTO;

public class NetflixService {

	private SeasonDAO daoSeason;
	private SerieDAO daoSerie;

	public NetflixService() {
		daoSeason = new SeasonDAO();
		daoSerie = new SerieDAO();
	}

	/**
	 * CRUD classic
	 * @return
	 */
	public List<SerieDTO> findAll() {
		final List<SerieDO> series = daoSerie.findAll();
		final List<SeasonDO> seasons = daoSeason.findAll();
		final List<SerieDTO> seriesDTO = new ArrayList<>();
		for (SerieDO serie : series) {
			SerieDTO s = new SerieDTO();
			s.setNom(serie.getNom());
			int nbSeasons = 0;
			int nbEpisodes = 0;
			for (SeasonDO season : seasons) {
				if (season.getFk_serie() == serie.getId()) {
					nbSeasons++;
					nbEpisodes += season.getNb_episodes();
				}
			}
			s.setSaisons(nbSeasons);
			s.setTotal_episodes(nbEpisodes);
			seriesDTO.add(s);
		}

		return seriesDTO;

	}

}
