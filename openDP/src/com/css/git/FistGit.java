package com.css.git;

public class FistGit {
	  protected final static long serialVersionUID = -7882200810131008L;
	  public FistGit() {}

	  public FistGit(FistGit server)
	  {
	    if(null == server)
	      return;
	    this.guid            = server.getGuid();
	    this.superServerGuid = server.getSuperServerGuid();
	    this.name            = server.getName();
	    this.registerTime    = server.getRegisterTime();
	    this.isAudit         = server.isAudit();
	    this.autidTime       = server.getAuditTime();
	    this.zoneCode        = server.getZoneCode();
	    this.zoneName        = server.getZoneName();
	    this.unitCode        = server.getUnitCode();
	    this.unitName        = server.getUnitName();
	    this.isOnLine        = server.isOnLine();
	    this.onLineState     = server.getOnLineState();
	  }

	  private String guid = "";

	  //得到Guid 号
	  public String getGuid()
	  {
	    return this.guid;
	  }
	  public void setGuid(String guid)
	  {
	    this.guid = guid;
	  }

	  private String superServerGuid = "";
	  public void setSuperServerGuid(String guid)
	  {
	    this.superServerGuid = guid;
	  }
	  public String getSuperServerGuid()
	  {
	    return this.superServerGuid;
	  }

	  private String name = "";
	  public String getName() //得到名称
	  {
	    return this.name;
	  }
	  public void setName(String name)
	  {
	    this.name = name;
	  }

	  private long registerTime = 0;
	  public long getRegisterTime() //注册时间
	  {
	    return this.registerTime;
	  }
	  public void setRegisterTime(long t)
	  {
	    this.registerTime = t;
	  }

	  private boolean isAudit = false;
	  public void setIsAudit(boolean b)
	  {
	    this.isAudit = b;
	  }
	  public boolean isAudit()
	  {
	    return this.isAudit;
	  }

	  private long autidTime = 0;
	  public long getAuditTime() //通过审核时间
	  {
	    return this.autidTime;
	  }
	  public void setAuditTime(long t)
	  {
	    this.autidTime = t;
	  }

	  private String unitName = "";
	  public String getUnitName() //得到单位名称
	  {
	    return this.unitName;
	  }
	  public void setUnitName(String name)
	  {
	    this.unitName = name;
	  }

	  private String unitCode = "";
	  public String getUnitCode() //得到单位编号
	  {
	    return this.unitCode;
	  }
	  public void setUnitCode(String code)
	  {
	    this.unitCode = code;
	  }

	  private String zoneName = "";
	  public String getZoneName() //得到地区名称
	  {
	    return this.zoneName;
	  }
	  public void setZoneName(String name)
	  {
	    this.zoneName = name;
	  }

	  private String zoneCode = "";
	  public String getZoneCode() //得到地区编号
	  {
	    return this.zoneCode;
	  }
	  public void setZoneCode(String code)
	  {
	    this.zoneCode = code;
	  }

	  private boolean isOnLine = false;
	  public boolean isOnLine()
	  {
	    return this.isOnLine;
	  }
	  public void setIsOnLine(boolean b)
	  {
	    this.isOnLine = b;
	  }

	  //在线状态
	  public final static int ON_LINE_STATE_YES    = 0;
	  public final static int ON_LINE_STATE_NO     = 1;
	  public final static int ON_LINE_STATE_UNKNOW = 2;

	  private int onLineState = this.ON_LINE_STATE_YES;
	  public void setOnLineState(int state)
	  {
	    this.onLineState = state;
	  }
	  public int getOnLineState()
	  {
	    return this.onLineState;
	  }

	  public String toString()
	  {
	    return this.getName();
	  }

	  // 供界面使用
	  private boolean isSelected = false;
	  public boolean isSelected() {
		return isSelected;
	  }
	  public void setSelected(boolean isSelected) {
		this.isSelected=isSelected;
	  }
	  private String serverIp = null;

		public String getServerIp() {
			return serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}
}
