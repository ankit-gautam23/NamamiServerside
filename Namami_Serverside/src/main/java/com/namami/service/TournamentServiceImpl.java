package com.namami.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.TournamentDAO;
import com.namami.model.Tournament;

@Service(value = "tournamentService")
@Transactional
public class TournamentServiceImpl implements TournamentService {

	@Autowired
	private TournamentDAO tournamentDAO;
	
	@Override
	public List<Tournament> getDetails(String tdate) throws Exception {
		List<Tournament> tour = tournamentDAO.getDetails(tdate);
		return tour;
	}
	
}
