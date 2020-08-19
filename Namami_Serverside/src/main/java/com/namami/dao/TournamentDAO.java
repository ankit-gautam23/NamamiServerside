package com.namami.dao;

import java.util.List;

import com.namami.model.Tournament;

public interface TournamentDAO {
	public List<Tournament> getDetails(String tdate)throws Exception;
}
