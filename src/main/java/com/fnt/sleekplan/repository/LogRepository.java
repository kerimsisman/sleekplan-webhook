package com.fnt.sleekplan.repository;

import java.util.UUID;

import com.fnt.sleekplan.model.Log;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LogRepository implements PanacheRepositoryBase<Log, UUID> {

}
