package com.client.one.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.one.model.FTTIssueBase;

@Repository
public interface FTTIssueBaseRepository extends JpaRepository<FTTIssueBase,String> {

}
