package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmPort extends BaseVO {

	
	private static final long serialVersionUID = -6600394654137044786L;
	
	/**
	 * 名称：所属网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String nermUID;
	/**
	 * 名称：所属板卡rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、当端口归属在板卡下时,此项必填；当端口归属在网元下时，无需填写
	 * 数据示例：
	 * */
	String cardrmUID="";
	/**
	 * 名称：板卡所属容器rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、当端口归属在板卡下时,此项必填；当端口归属在网元下时，无需填写
	 * 数据示例：
	 * */
	String holderrmUID="";
	/**
	 * 名称：端口序号
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：1、当端口归属在板卡下时,相同“端口分类|端口类型|端口子类型”的端口在板卡下唯一；
       2、当端口归属在网元下时，相同“端口分类|端口类型|端口子类型”的端口在网元下唯一。
       3、十进制
	 * 数据示例：1
	 * */
	String portNo;
	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明：OMC上显示的端口名称
	 * 数据示例：PORT1
	 * */
	String nativeName="";
	/**
	 * 名称：端口分类
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：描述端口是物理口还是逻辑口
                        枚举值包括：
       ptp：物理端口；
       ftp：逻辑端口
	 * 数据示例：PTP
	 * */
	String physicalOrLogical;
	/**
	 * 名称：端口类型
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：ETH、TDM、LAG、L2VE、L3VE、other。
                         当“端口分类”是ptp时，该项取值只能为ETH、TDM、other；
                         当“端口分类”是ftp时，该项取值只能为LAG、L2VE、L3VE、other。
	 * 数据示例：ETH
	 */
	String portType;
	/**
	 * 名称：端口子类型
	 * 最大长度:19
	 * 是否必填：是
	 * 取值范围及说明：当某个类型端口下不再区分子类型时，该项填值与“端口类型”属性的填值一致
	 * 数据示例：OptiX PTN 3900
	 */
	String portSubType;
	/**
	 * 名称：端口光电属性
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		optical：光口；electrical：电口；invalid：无效。
		当“端口分类”是ptp时，必须指定是optical或electrical；
		当“端口分类”是ftp时，必须指定为invalid。
	 * 数据示例：electrical
	 */
	String signalType;
	/**
	 * 名称：端口速率
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：见字典表
	 * 数据示例：GE
	 */
	String portRate;
	/**
	 * 名称：方向
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		D_BIDIRECTIONAL：双向；
		D_SOURCE：源；
		D_SINK：宿；
		DIR_NA：未知
	 * 数据示例：D_BIDIRECTIONAL
	 */
	String direction;
	/**
	 * 名称：端口角色
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		Master：主用；
		Backup：备用；
		NA：无主备端口
	 * 数据示例：Master
	 */
	String role;
	/**
	 * 名称：端口IP
	 * 最大长度:40
	 * 是否必填：否
	 * 取值范围及说明：当三层端口上配置时此项必填：
	 * 数据示例：10.77.66.11
	 */
	String IPAddress="";
	/**
	 * 名称：子网掩码
	 * 最大长度:40
	 * 是否必填：否
	 * 取值范围及说明：当三层端口上配置时此项必填
	 * 数据示例：
	 */
	String IPMask="";
	/**
	 * 名称：是否overlay端口
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：标识端口是否是overlay方式
		枚举值包括：
		true：overlay方式；false：非overlay方式
	 * 数据示例：true
	 */
	String isOverLay;
        
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
                  
	public String getNermUID() {
		return nermUID;
	}
	public void setNermUID(String nermUID) {
		if( StringUtils.isEmpty(nermUID)  )
			Asserter.fail(this.getClass(),"nermUID");
		this.nermUID = nermUID;
	}
	public String getCardrmUID() {
		return cardrmUID;
	}
	public void setCardrmUID(String cardrmUID) {
                                    if (StringUtils.isEmpty(cardrmUID)){
                                                      cardrmUID = "";
                                    }
//		if( StringUtils.isEmpty(cardrmUID)  )
//			Asserter.fail(this.getClass(),"cardrmUID");
		this.cardrmUID = cardrmUID;
	}
	public String getHolderrmUID() {
		return holderrmUID;
	}
	public void setHolderrmUID(String holderrmUID) {
                                    if (StringUtils.isEmpty(holderrmUID)){
                                                      holderrmUID = "";
                                    }
//		if( StringUtils.isEmpty(holderrmUID)  )
//			Asserter.fail(this.getClass(),"holderrmUID");
		this.holderrmUID = holderrmUID;
	}
	public String getPortNo() {
		return portNo;
	}
	public void setPortNo(String portNo) {
		if( StringUtils.isEmpty(portNo)  )
			Asserter.fail(this.getClass(),"portNo");
		this.portNo = portNo;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
                                    if (StringUtils.isEmpty(nativeName)){
                                                      nativeName = "";
                                    }
//		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
		if( nativeName.length()>255 )
			Asserter.fail(this.getClass(),"nativeName");
		this.nativeName = nativeName;
	}
	public String getPhysicalOrLogical() {
		return physicalOrLogical;
	}
	public void setPhysicalOrLogical(String physicalOrLogical) {
		if( StringUtils.isEmpty(physicalOrLogical)  )
			Asserter.fail(this.getClass(),"physicalOrLogical");
		this.physicalOrLogical = physicalOrLogical;
	}
	public String getPortType() {
		return portType;
	}
	public void setPortType(String portType) {
		if( StringUtils.isEmpty(portType)  )
			Asserter.fail(this.getClass(),"portType");
		this.portType = portType;
	}
	public String getPortSubType() {
		return portSubType;
	}
	public void setPortSubType(String portSubType) {
		if( StringUtils.isEmpty(portSubType) || portSubType.length()>19 )
			Asserter.fail(this.getClass(),"portSubType");
		this.portSubType = portSubType;
	}
	public String getSignalType() {
		return signalType;
	}
	public void setSignalType(String signalType) {
		if( StringUtils.isEmpty(signalType)  )
			Asserter.fail(this.getClass(),"signalType");
		this.signalType = signalType;
	}
	public String getPortRate() {
		return portRate;
	}
	public void setPortRate(String portRate) {
		if( StringUtils.isEmpty(portRate)  )
			Asserter.fail(this.getClass(),"portRate");
		this.portRate = portRate;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		if( StringUtils.isEmpty(direction)  )
			Asserter.fail(this.getClass(),"direction");
		this.direction = direction;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if( StringUtils.isEmpty(role)  )
			Asserter.fail(this.getClass(),"role");
		this.role = role;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
                                    if (StringUtils.isEmpty(iPAddress)){
                                                      iPAddress = "";
                                    }
//		if( StringUtils.isEmpty(iPAddress) || iPAddress.length()>40 )
		if(iPAddress.length()>40 )
			Asserter.fail(this.getClass(),"iPAddress");
		IPAddress = iPAddress;
	}
	public String getIPMask() {
		return IPMask;
	}
	public void setIPMask(String iPMask) {
                                    if (StringUtils.isEmpty(iPMask)){
                                                      iPMask = "";
                                    }
//		if( StringUtils.isEmpty(iPMask) || iPMask.length()>40 )
		if(iPMask.length()>40 )
			Asserter.fail(this.getClass(),"iPMask");
		IPMask = iPMask;
	}
	public String getIsOverLay() {
		return isOverLay;
	}
	public void setIsOverLay(String isOverLay) {
		if( StringUtils.isEmpty(isOverLay)  )
			Asserter.fail(this.getClass(),"isOverLay");
		this.isOverLay = isOverLay;
	}
	@Override
	public String getResType() {
		return "PRT";
	}
	

}
