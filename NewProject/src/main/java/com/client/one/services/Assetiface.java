package com.client.one.services;

import java.util.Optional;

import com.client.one.model.FTTIssueBase;

public interface Assetiface {
	public Optional<FTTIssueBase> findById(String id);
}
