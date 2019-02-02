package io.jatoms.osgi.possiblebugs.scl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardListener;

@Component
@HttpWhiteboardListener
public class MySCL implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Initialized");
	}

}
