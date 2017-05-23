package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmTunnelPGBackupInfo extends BaseVO {

	
	private static final long serialVersionUID = 6268609444014392541L;
	
	/**
	 * 名称：隧道保护组rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String tunnelGrouprmUID;
	/**
	 * 名称：关联隧道rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String tunnelrmUID;
	/**
	 * 名称：隧道角色
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		Master：主用；
		Backup：备用
	 * 数据示例1：Master
	 * 数据示例2：Master
	 * */
	String role;              

                  @Override
                  public String getFileRmUID() {
                      //excel中无，但样例中与tunnelrmUID一致
                      return this.tunnelrmUID;
                  }
                  
	public String getTunnelGrouprmUID() {
		return tunnelGrouprmUID;
	}
	public void setTunnelGrouprmUID(String tunnelGrouprmUID) {
		if( StringUtils.isEmpty(tunnelGrouprmUID) )
			Asserter.fail(this.getClass(),"tunnelGrouprmUID");
		this.tunnelGrouprmUID = tunnelGrouprmUID;
	}
	public String getTunnelrmUID() {
		return tunnelrmUID;
	}
	public void setTunnelrmUID(String tunnelrmUID) {
		if( StringUtils.isEmpty(tunnelrmUID) )
			Asserter.fail(this.getClass(),"tunnelrmUID");
		this.tunnelrmUID = tunnelrmUID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if( StringUtils.isEmpty(role) )
			Asserter.fail(this.getClass(),"role");
		this.role = role;
	}
	@Override
	public String getResType() {
		return "TPB";
	}

}
