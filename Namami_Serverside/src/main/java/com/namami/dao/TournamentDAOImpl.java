package com.namami.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.TournamentEntity;
import com.namami.model.Tournament;

@Repository(value = "tournamentDAO")
public class TournamentDAOImpl implements TournamentDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Tournament> getDetails(String tdate) throws Exception {
		Query query = entityManager.createQuery("select t from TournamentEntity t where rdate = :tdate");
		query.setParameter("tdate", tdate);
		List<Tournament> tournaments = new ArrayList<Tournament>();
		List<TournamentEntity> tournamentEntities = query.getResultList();
		
		if(!tournamentEntities.isEmpty()) {
			for(TournamentEntity tournamentEntity:tournamentEntities) {
				Tournament tournament = new Tournament();
				tournament.setEmail(tournamentEntity.getEmail());
				tournament.setImageurl(tournamentEntity.getImageurl());
				tournament.setRdate(tournamentEntity.getRdate());
				tournaments.add(tournament);
			}
		}
		return tournaments;
	}
	
}
