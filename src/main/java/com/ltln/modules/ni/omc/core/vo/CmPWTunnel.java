package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmPWTunnel extends BaseVO {

	private static final long serialVersionUID = 1100351990691116625L;
	

	/**
	 * 名称：伪线rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String pwrmUID;

	/**
	 * 名称：承载隧道rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String tunnelrmUID;

	/**
	 * 名称：归属路由组编号
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：考虑单向隧道承载双向伪线的情况，标识路由节点归属的路由组。
		取值只能为1或2。
		1、当伪线和承载隧道都是双向或单向时，此项固定填数字1
		2、当伪线是双向，而承载隧道是单向时，需要按方向将所有承载隧道顺序划分到2个路由组中，
		此项取值数字1和2来分别描述2个路由组。取值为1时描述信号从伪线源网元到宿网元时顺序经过的各承载隧道信息；
		取值为2时描述信号从伪线宿网元到源网元时顺序经过的各承载信息

	 * 数据示例：1
	 * */
	String routingGroup;
	/**
	 * 名称：路由组中的序号
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：隧道在归属路由组中的序号。
		从1开始，十进制方式
	 * 数据示例：1
	 * */
	String number;
        
                                    
                  String rmUID;

	public void setRmUID(String rmUID) {
		if( StringUtils.isEmpty(rmUID)  )
			Asserter.fail(this.getClass(),"rmUID");
		this.rmUID = rmUID;
	}
        
                  @Override
                  public String getFileRmUID() {
                      return this.rmUID;
                  }
                  
	public String getPwrmUID() {
		return pwrmUID;
	}
	public void setPwrmUID(String pwrmUID) {
		if( StringUtils.isEmpty(pwrmUID)  )
			Asserter.fail(this.getClass(),"pwrmUID");
		this.pwrmUID = pwrmUID;
	}
	public String getTunnelrmUID() {
		return tunnelrmUID;
	}
	public void setTunnelrmUID(String tunnelrmUID) {
		if( StringUtils.isEmpty(tunnelrmUID)  )
			Asserter.fail(this.getClass(),"tunnelrmUID");
		this.tunnelrmUID = tunnelrmUID;
	}
	public String getRoutingGroup() {
		return routingGroup;
	}
	public void setRoutingGroup(String routingGroup) {
		if( StringUtils.isEmpty(routingGroup)  )
			Asserter.fail(this.getClass(),"routingGroup");
		this.routingGroup = routingGroup;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		if( StringUtils.isEmpty(number)  )
			Asserter.fail(this.getClass(),"number");
		this.number = number;
	}
	@Override
	public String getResType() {
		return "PWT";
	}

}
