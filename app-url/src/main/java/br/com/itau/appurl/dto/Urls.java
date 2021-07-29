package br.com.itau.appurl.dto;

public class Urls {
	
	private String id;
	private String urlName;
	private String configName;
	private String log;
	private String lastscan;
	private String loglastmodified;
	private String unused;
	private Binds binds;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getLastscan() {
		return lastscan;
	}
	public void setLastscan(String lastscan) {
		this.lastscan = lastscan;
	}
	public String getLoglastmodified() {
		return loglastmodified;
	}
	public void setLoglastmodified(String loglastmodified) {
		this.loglastmodified = loglastmodified;
	}
	public String getUnused() {
		return unused;
	}
	public void setUnused(String unused) {
		this.unused = unused;
	}
	public Binds getBinds() {
		return binds;
	}
	public void setBinds(Binds binds) {
		this.binds = binds;
	}
}