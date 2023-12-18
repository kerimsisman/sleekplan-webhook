package com.fnt.sleekplan.service.impl;

import java.time.Instant;

import com.fnt.sleekplan.model.Log;
import com.fnt.sleekplan.repository.LogRepository;
import com.fnt.sleekplan.service.LogService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class LogServiceImpl implements LogService {

	@Inject
	LogRepository repository;

	@Override
	@Transactional
	public void save(String key,String data) {
		log.info("save started");
		Log record = new Log();
		record.setKey(key);
		record.setData(data);
		record.setCreatedAt(Instant.now());
		repository.persist(record);
		log.info("save completed id:{}", record.getId());

	}

}
