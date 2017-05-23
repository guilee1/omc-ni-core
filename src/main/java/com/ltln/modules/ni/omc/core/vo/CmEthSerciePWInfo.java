package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmEthSerciePWInfo extends BaseVO {

	
	private static final long serialVersionUID = 6396604449178381756L;
	
	/**
	 * 名称：以太网业务rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String servicermUID;
	/**
	 * 名称：承载伪线rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String pwrmUID;
	/**
	 * 名称：承载伪线源端网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：1、源端网元要求是以太网业务中的接入点网元之一
	 * 数据示例：
	 * */
	String aEndNermUID;
	/**
	 * 名称：承载伪线宿端网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：1、宿端网元要求是以太网业务中的接入点网元之一
	 * 数据示例：
	 * */
	String zEndNermUID;
	/**
	 * 名称：承载伪线角色
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		Master：主用；
		Backup：备用；
		NA：无主备；
		IDI：华为在LTE业务中两个二转三节点网元间配置的伪线
	 * 数据示例：
	 * */
	String role;        

                  @Override
                  public String getFileRmUID() {
                      //excel中无，但样例中与pwrmUID一致
                           return this.pwrmUID;
                  }
        
	public String getServicermUID() {
		return servicermUID;
	}
	public void setServicermUID(String servicermUID) {
		if( StringUtils.isEmpty(servicermUID)  )
			Asserter.fail(this.getClass(),"servicermUID");
		this.servicermUID = servicermUID;
	}
	public String getPwrmUID() {
		return pwrmUID;
	}
	public void setPwrmUID(String pwrmUID) {
		if( StringUtils.isEmpty(pwrmUID)  )
			Asserter.fail(this.getClass(),"pwrmUID");
		this.pwrmUID = pwrmUID;
	}
	public String getaEndNermUID() {
		return aEndNermUID;
	}
	public void setaEndNermUID(String aEndNermUID) {
		if( StringUtils.isEmpty(aEndNermUID)  )
			Asserter.fail(this.getClass(),"aEndNermUID");
		this.aEndNermUID = aEndNermUID;
	}
	public String getzEndNermUID() {
		return zEndNermUID;
	}
	public void setzEndNermUID(String zEndNermUID) {
		if( StringUtils.isEmpty(zEndNermUID)  )
			Asserter.fail(this.getClass(),"zEndNermUID");
		this.zEndNermUID = zEndNermUID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if( StringUtils.isEmpty(role)  )
		Asserter.fail(this.getClass(),"role");
		this.role = role;
	}
	@Override
	public String getResType() {
		return "ESI";
	}

}
