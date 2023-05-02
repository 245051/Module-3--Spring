package com.client.one.serviceimpl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.one.model.FTTIssueBase;
import com.client.one.repositories.FTTIssueBaseRepository;
import com.client.one.services.Assetiface;

@Service
public class AssetImpl implements Assetiface {

	@Autowired
	FTTIssueBaseRepository repo;
	
	@Override
	public Optional<FTTIssueBase> findById(String id) {

		return repo.findById(id);
	}

	
}

