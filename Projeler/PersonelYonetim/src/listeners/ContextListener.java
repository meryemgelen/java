package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import util.Util;

@WebListener
public class ContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
//amaç sunucu ayaða kalktýðýnda bunu anlamak ve parametreli yükliyen kodu çalýþtýrmak
		// ilk bu class çalþýyor
	}

	public void contextInitialized(ServletContextEvent sce) {
		Util.init();
	}

}
