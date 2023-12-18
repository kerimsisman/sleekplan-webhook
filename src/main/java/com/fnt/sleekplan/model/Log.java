package com.fnt.sleekplan.model;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Log {

	@Id
	private UUID id = UUID.randomUUID();

	@Column
	private String key;

	@Column
	private String data;

	@Column
	private Instant createdAt;

}
