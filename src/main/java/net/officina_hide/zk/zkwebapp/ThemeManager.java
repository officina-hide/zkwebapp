package net.officina_hide.zk.zkwebapp;

/**
 * テーマ管理
 * @author officina-hide.net
 * @version 1.00 新規作成[New create]
 * @since 2022/12/03 Ver. 1.00
 * @use theme.zs
 */
public class ThemeManager {
	
	/**
	 * @return name of active theme
	 */
	public static String getTheme() {
//		String theme = System.getProperty(MSysConfig.ZK_THEME);
//		return Util.isEmpty(theme) ? MSysConfig.getValue(MSysConfig.ZK_THEME, ITheme.ZK_THEME_DEFAULT) : theme;
		return "kacoms"; 
	}
	
	/**
	 * @return url of theme stylesheet 
	 */
	public static String getStyleSheet() {
//		System.out.println(ITheme.THEME_PATH_PREFIX + getTheme() + ITheme.THEME_STYLESHEET);
		return ITheme.THEME_PATH_PREFIX + getTheme() + ITheme.THEME_STYLESHEET;
	}
	
	/**
	 * @return url of theme preference page
	 */
	public static String getPreference() {
//		System.out.println(ITheme.THEME_PATH_PREFIX + getTheme() + ITheme.THEME_PREFERENCE);
		return ITheme.THEME_PATH_PREFIX + getTheme() + ITheme.THEME_PREFERENCE;
	}
	
	/**
	 * @return url for browser icon
	 */
	public static String getBrowserIcon() {
		String theme = getTheme();
		String def = ITheme.THEME_PATH_PREFIX + theme + ITheme.BROWSER_ICON_IMAGE;
		System.out.println(def);
		return def;
//		return MSysConfig.getValue(MSysConfig.ZK_BROWSER_ICON, def);
	}
	
	/**
	 * @return title text for the browser window
	 */
	public static String getBrowserTitle() {
//		System.out.println(Executions.getCurrent().getDesktop().getWebApp().getAppName());
//		return Executions.getCurrent().getDesktop().getWebApp().getAppName();
//		return AEnv.getDesktop().getWebApp().getAppName();
		return "KACOMS";
	}
	
	/**
	 * Get theme resource url
	 * @param name relative resource name from theme root
	 * @return full resource url
	 */
	public static String getThemeResource(String name) {
		StringBuilder builder = new StringBuilder(ITheme.THEME_PATH_PREFIX);
		builder.append(getTheme());
		builder.append("/").append(name);
		String url = builder.toString().intern();
		System.out.println(url);
		return  url;
	}

}
