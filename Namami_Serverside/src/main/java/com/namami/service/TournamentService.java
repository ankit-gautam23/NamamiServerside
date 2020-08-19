package com.namami.service;

import java.util.List;

import com.namami.model.Tournament;

public interface TournamentService {
	public List<Tournament> getDetails(String tdate)throws Exception;
}
