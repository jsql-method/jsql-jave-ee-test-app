package it.jsql.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import it.jsql.rest.ExampleRestService;

public class MessageApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public MessageApplication() {
		singletons.add(new ExampleRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
