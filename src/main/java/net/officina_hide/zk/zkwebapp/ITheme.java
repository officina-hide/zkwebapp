package net.officina_hide.zk.zkwebapp;

/**
 * テーマ用
 * @author officina-hide.net
 * @version Ver 1.00 新規作成[New create]
 * @since 2022/12/03 Ver. 1.00
 */
public interface ITheme {
	
	//theme resource url prefix
	public static final String THEME_PATH_PREFIX = "/theme/";
	//stylesheet url
	public static final String THEME_STYLESHEET = "/css/theme.css.dsp";
	//theme preference
	public static final String THEME_PREFERENCE = "/preference.zul";
	//logo
//	public static final String LOGIN_LOGO_IMAGE = "/images/login-logo.png";
//	public static final String HEADER_LOGO_IMAGE = "/images/header-logo.png";
	public static final String BROWSER_ICON_IMAGE= "/images/icon.png";
	
	//css for login window and box
	public static final String LOGIN_WINDOW_CLASS = "login-window";
	public static final String LOGIN_BOX_HEADER_CLASS = "login-box-header";
	public static final String LOGIN_BOX_HEADER_TXT_CLASS = "login-box-header-txt";
	public static final String LOGIN_BOX_HEADER_LOGO_CLASS = "login-box-header-logo";
	public static final String LOGIN_BOX_BODY_CLASS = "login-box-body";
	public static final String LOGIN_BOX_FOOTER_CLASS = "login-box-footer";
	public static final String LOGIN_BOX_FOOTER_PANEL_CLASS = "login-box-footer-pnl";
	
	//css for login control
	public static final String LOGIN_BUTTON_CLASS = "login-btn";
	public static final String LOGIN_LABEL_CLASS = "login-label";
	public static final String LOGIN_FIELD_CLASS = "login-field";

}
