package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmLabelSwitch extends BaseVO{

	
	private static final long serialVersionUID = 3689355558386963690L;
	
	
	/**
	 * 名称：隧道rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String tunnelrmUID;
	/**
	 * 名称：方向
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		CD_UNI：单向；CD_BI：双向
	 * 数据示例：CD_BI
	 * */
	String direction;
	/**
	 * 名称：归属路由组
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：当隧道是双向而路由中的标签交换是单向时，需要分两组分别描述隧道经过的所有标签交换信息
		取值只能为1或2。
		1、当隧道和路由中的各标签交换都是双向或单向时，此项固定填数字1
		2、当隧道是双向，而路由中的各标签是单向时，需要按方向将所有标签交换顺序划分到2个路由组中，
		此项取值数字1和2来分别描述2个路由组。取值为1时描述信号从隧道源网元到宿网元时顺序经过的各标签交换信息；
		取值为2时描述信号从隧道宿网元到源网元时顺序经过的各标签交换信息

	 * 数据示例：1
	 * */
	String routingGroup;
	/**
	 * 名称：路由组中的序号
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明从1开始，十进制
	 * 数据示例：2
	 * */
	String routingNo;
	/**
	 * 名称：源端端口rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明1、对于路由的第1个节点，此项不填
		2、当源端是MPLS保护环时，此项不填
		3、所有其他节点，此项必填
	 * 数据示例：
	 * */
	String aEndPortrmUID="";
	/**
	 * 名称：源端rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：源端的唯一标识，可能是网元TP点rmUID也可能是MPLS环rmUID
		1、当源端是网元中的TP点，此项填写TP点rmUID；当源端是MPLS环时，此项填写MPLS环rmUID
		2、对于路由的第1个节点，此项不填；所有其他节点，此项必填
	 * 数据示例：
	 * */
	String aEndTprmUID="";
	/**
	 * 名称：源端出标签
	 * 最大长度:20
	 * 是否必填：否
	 * 取值范围及说明：1、对于路由的第1个节点，此项不填
		2、所有其他网元节点：
		（1）标签交换方向是双向时，此项必填
		（2）标签交换方向是单向时，此项不填
		3、当源端是MPLS保护环时，此项不填
	 * 数据示例：148
	 * */
	String aEndOutLabel="";
	/**
	 * 名称：源端入标签
	 * 最大长度:20
	 * 是否必填：否
	 * 取值范围及说明：1、对于路由的第1个节点，此项不填
		2、所有其他网元节点，此项必填
		3、当源端是MPLS保护环时，此项不填
		
	 * 数据示例：17
	 * */
	String aEndRevInLabel="";
	/**
	 * 名称：宿端端口rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明1、对于路由的最后1个节点，此项不填
		2、当宿端是MPLS保护环时，此项不填
		3、所有其他节点，此项必填
		
	 * 数据示例：
	 * */
	String zEndPortrmUID="";
	/**
	 * 名称：源端VLAN
	 * 最大长度:8
	 * 是否必填：否
	 * 取值范围及说明a侧端口的VLANID
		在隧道为Overlay模式下填写
	 * 数据示例：
	 * */
	String aUVID="";
	/**
	 * 名称：宿端rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明宿端的唯一标识，可能是网元TP点rmUID也可能是MPLS环rmUID

		1、当宿端是网元中的TP点，此项填写TP点rmUID；当宿端是MPLS环时，此项填写MPLS环rmUID
		2、对于路由的最后1个节点，此项不填；所有其他节点，此项必填
	 * 数据示例：
	 * */
	String zEndTprmUID="";
	/**
	 * 名称：宿端入标签
	 * 最大长度:20
	 * 是否必填：否
	 * 取值范围及说明1、对于路由的最后1个节点，此项不填
		2、所有其他网元节点：
		（1）标签交换方向都是双向时，此项必填
		（2）标签交换方向是单向时，此项不填
		3、当宿端是MPLS保护环时，此项不填
	 * 数据示例：26
	 * */
	String zEndInLabel="";
	/**
	 * 名称：宿端出标签
	 * 最大长度:20
	 * 是否必填：否
	 * 取值范围及说明1、对于路由的最后1个网元节点，此项不填
		2、所有其他网元节点，此项必填
		3、当宿端是MPLS保护环时，此项不填
	 * 数据示例：32
	 * */
	String zEndRevOutLabel="";
	/**
	 * 名称：所属网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明1、当源端或宿端是网元上TP点时，填写其所属的网元rmUID
	 * 数据示例：
	 * */
	String nermUID;
	/**
	 * 名称：宿端VLAN
	 * 最大长度:8
	 * 是否必填：否
	 * 取值范围及说明z侧端口的VLANID
		在隧道为Overlay模式下填写
	 * 数据示例：
	 * */
	String zUVID="";
	                  
                  String rmUID;

	public void setRmUID(String rmUID) {
		if( StringUtils.isEmpty(rmUID) )
			Asserter.fail(this.getClass(),"rmUID");
		this.rmUID = rmUID;
	}
        
                  @Override
                  public String getFileRmUID() {
                      return this.rmUID;
                  }
                  
	public String getTunnelrmUID() {
		return tunnelrmUID;
	}
	public void setTunnelrmUID(String tunnelrmUID) {
		if( StringUtils.isEmpty(tunnelrmUID)  )
			Asserter.fail(this.getClass(),"tunnelrmUID");
		this.tunnelrmUID = tunnelrmUID;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		if( StringUtils.isEmpty(direction)  )
			Asserter.fail(this.getClass(),"direction");
		this.direction = direction;
	}
	public String getRoutingGroup() {
		return routingGroup;
	}
	public void setRoutingGroup(String routingGroup) {
		if( StringUtils.isEmpty(routingGroup)  )
			Asserter.fail(this.getClass(),"routingGroup");
		this.routingGroup = routingGroup;
	}
	public String getRoutingNo() {
		return routingNo;
	}
	public void setRoutingNo(String routingNo) {
		if( StringUtils.isEmpty(routingNo)  )
			Asserter.fail(this.getClass(),"routingNo");
		this.routingNo = routingNo;
	}
	public String getaEndPortrmUID() {
		return aEndPortrmUID;
	}
	public void setaEndPortrmUID(String aEndPortrmUID) {
                                    if (StringUtils.isEmpty(aEndPortrmUID)){
                                                      aEndPortrmUID = "";
                                    }
//		if( StringUtils.isEmpty(aEndPortrmUID)  )
//			Asserter.fail(this.getClass(),"aEndPortrmUID");
		this.aEndPortrmUID = aEndPortrmUID;
	}
	public String getaEndTprmUID() {
		return aEndTprmUID;
	}
	public void setaEndTprmUID(String aEndTprmUID) {
                                    if (StringUtils.isEmpty(aEndTprmUID)){
                                                      aEndTprmUID = "";
                                    }
//		if( StringUtils.isEmpty(aEndTprmUID)  )
//			Asserter.fail(this.getClass(),"aEndTprmUID");
		this.aEndTprmUID = aEndTprmUID;
	}
	public String getaEndOutLabel() {
		return aEndOutLabel;
	}
	public void setaEndOutLabel(String aEndOutLabel) {
                                    if (StringUtils.isEmpty(aEndOutLabel)){
                                                      aEndOutLabel = "";
                                    }
//		if( StringUtils.isEmpty(aEndOutLabel) || aEndOutLabel.length()>20 )
		if( aEndOutLabel.length()>20 )
			Asserter.fail(this.getClass(),"aEndOutLabel");
		this.aEndOutLabel = aEndOutLabel;
	}
	public String getaEndRevInLabel() {
		return aEndRevInLabel;
	}
	public void setaEndRevInLabel(String aEndRevInLabel) {
                                    if (StringUtils.isEmpty(aEndRevInLabel)){
                                                      aEndRevInLabel = "";
                                    }
//		if( StringUtils.isEmpty(aEndRevInLabel) || aEndRevInLabel.length()>20 )
		if( aEndRevInLabel.length()>20 )
			Asserter.fail(this.getClass(),"aEndRevInLabel");
		this.aEndRevInLabel = aEndRevInLabel;
	}
	public String getzEndPortrmUID() {
		return zEndPortrmUID;
	}
	public void setzEndPortrmUID(String zEndPortrmUID) {
                                    if (StringUtils.isEmpty(zEndPortrmUID)){
                                                      zEndPortrmUID = "";
                                    }
//		if( StringUtils.isEmpty(zEndPortrmUID)  )
//			Asserter.fail(this.getClass(),"zEndPortrmUID");
		this.zEndPortrmUID = zEndPortrmUID;
	}
	public String getaUVID() {
		return aUVID;
	}
	public void setaUVID(String aUVID) {
                                    if (StringUtils.isEmpty(aUVID)){
                                                      aUVID = "";
                                    }
//		if( StringUtils.isEmpty(aUVID) || aUVID.length()>8 )
		if( aUVID.length()>8 )
			Asserter.fail(this.getClass(),"aUVID");
		this.aUVID = aUVID;
	}
	public String getzEndTprmUID() {
		return zEndTprmUID;
	}
	public void setzEndTprmUID(String zEndTprmUID) {
                                    if (StringUtils.isEmpty(zEndTprmUID)){
                                                      zEndTprmUID = "";
                                    }
//		if( StringUtils.isEmpty(zEndTprmUID)  )
//			Asserter.fail(this.getClass(),"zEndTprmUID");
		this.zEndTprmUID = zEndTprmUID;
	}
	public String getzEndInLabel() {
		return zEndInLabel;
	}
	public void setzEndInLabel(String zEndInLabel) {
                                    if (StringUtils.isEmpty(zEndInLabel)){
                                                      zEndInLabel = "";
                                    }
//		if( StringUtils.isEmpty(zEndInLabel) || zEndInLabel.length()>20 )
		if( zEndInLabel.length()>20 )
			Asserter.fail(this.getClass(),"zEndInLabel");
		this.zEndInLabel = zEndInLabel;
	}
	public String getzEndRevOutLabel() {
		return zEndRevOutLabel;
	}
	public void setzEndRevOutLabel(String zEndRevOutLabel) {
                                    if (StringUtils.isEmpty(zEndRevOutLabel)){
                                                      zEndRevOutLabel = "";
                                    }
//		if( StringUtils.isEmpty(zEndRevOutLabel) || zEndRevOutLabel.length()>20 )
		if( zEndRevOutLabel.length()>20 )
			Asserter.fail(this.getClass(),"zEndRevOutLabel");
		this.zEndRevOutLabel = zEndRevOutLabel;
	}
	public String getNermUID() {
		return nermUID;
	}
	public void setNermUID(String nermUID) {
		if( StringUtils.isEmpty(nermUID)  )
			Asserter.fail(this.getClass(),"nermUID");
		this.nermUID = nermUID;
	}
	public String getzUVID() {
		return zUVID;
	}
	public void setzUVID(String zUVID) {
                                    if (StringUtils.isEmpty(zUVID)){
                                                      zUVID = "";
                                    }
//		if( StringUtils.isEmpty(zUVID) || zUVID.length()>8 )
		if( zUVID.length()>8 )
			Asserter.fail(this.getClass(),"zUVID");
		this.zUVID = zUVID;
	}
	@Override
	public String getResType() {
		return "LBS";
	}

}
