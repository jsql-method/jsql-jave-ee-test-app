package it.jsql.rest;

import it.jsql.connector.controller.JSQLController;
import it.jsql.connector.service.IJSQLService;
import it.jsql.connector.service.JSQLService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Path;

@Path("/example")
public class ExampleRestService extends JSQLController {

    @PersistenceContext(unitName = "primary")
    private EntityManager entityManager;

    protected final String API_KEY = "==iSqF8rKvVeSgqudKDOXpjiFgGMJh1PbeouIz9IW/YQ==9CI8ox66gogpoSXm6yrU";
    protected final String DEV_KEY = "Z6kEovODxAv2I5hKekMyUw==";

    @Override
    public IJSQLService getJsqlService() {
        return new JSQLService(entityManager, API_KEY, DEV_KEY);
    }

}