package net.officina_hide.zk.zkwebapp;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.metainfo.PageDefinition;
import org.zkoss.zul.Borderlayout;
import org.zkoss.zul.East;
import org.zkoss.zul.Window;

public class AdempiereWebUI extends Window implements EventListener<Event> {

	private static final long serialVersionUID = 4804976343428006387L;
	
	private static boolean eventThreadEnabled = false;
	
	private LoginWindow loginWindow;	
	
	public AdempiereWebUI() {
//		this.setTitle("KACOMS");
	}

	/**
	 * 画面の初期設定
	 */
	public void onCreate() {
		System.out.println("onCreate");
		this.getPage().setTitle(ThemeManager.getBrowserTitle());

		PageDefinition pageDefintion = Executions.getCurrent().getPageDefinition(ThemeManager.getThemeResource("zul/login/login.zul"));
		Component loginPage = Executions.createComponents(pageDefintion, this, null);
		Borderlayout desktop = (Borderlayout) loginPage.getFellow("layout");
		
		 loginWindow = (LoginWindow) loginPage.getFellow("loginWindow");
		 loginWindow.init(this);
		 
//		East east = desktop.getEast();
//		east.setVisible(true);
		
		Executions.getCurrent().getDesktop().enableServerPush(true);
		
		eventThreadEnabled = Executions.getCurrent().getDesktop().getWebApp().getConfiguration().isEventThreadEnabled();	
	}
	
	@Override
	public void onEvent(Event event) throws Exception {
		System.out.println("AdempiereWebUI : onEvent");
	}
	
	public static boolean isEventThreadEnabled() {
		return eventThreadEnabled;
	}

}
