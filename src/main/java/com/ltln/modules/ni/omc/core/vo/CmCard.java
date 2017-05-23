package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmCard extends BaseVO {

	
	private static final long serialVersionUID = 4385487329317766402L;

	/**
	 * 名称：所属网元rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明: 
	 * 数据示例:
	 */
	String nermUID;
	/**
	 * 名称：所属容器rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明: 
	 * 数据示例:
	 */
	String holderrmUID;
	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明： OMC上显示的板卡名称
	 * 数据示例:D1EM8F
	 */
	String nativeName="";
	/**
	 * 名称：板卡型号
	 * 最大长度:255
	 * 是否必填否
	 * 取值范围及说明： 
	 * 数据示例:D1EM8F
	 */
	String cardType;
	/**
	 * 名称：板卡子类型
	 * 最大长度:50
	 * 是否必填否
	 * 取值范围及说明： 有则必填
	 * 数据示例:
	 */
	String cardSubType="";
	/**
	 * 名称：软件版本
	 * 最大长度:255
	 * 是否必填是
	 * 取值范围及说明： 
	 * 数据示例:V1R2C00
	 */
	String softwareVersion;
	/**
	 * 名称：硬件版本
	 * 最大长度:255
	 * 是否必填是
	 * 取值范围及说明 
	 * 数据示例:
	 */
	String hardwareVersion;
	/**
	 * 名称：序列号
	 * 最大长度:255
	 * 是否必填否
	 * 取值范围及说明： 有则必填；如果单板没有序列号但有条形码时，该属性填报条形码信息
	 * 数据示例:020PRR10AB000071
	 */
	String serialNumber="";
	/**
	 * 名称：单板状态
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 ：枚举值包括：
       IN_SERVICE：单板处于正常工作状态；
       OUT_OF_SERVICE：单板无法正常工作；
       OUT_OF_SERVICE_BY_MAINTENANCE：单板由于维护性操作无法正常工作。例如更换单板等；
       SERV_NA：单板状态无法获知
	 * 数据示例:IN_SERVICE
	 */
	String serviceState;
	/**
	 * 名称：板卡角色
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 ：枚举值包括：
       Master：主用；
       Backup：备用；
       NA：无主备板卡
	 * 数据示例:Master
	 */
	String role;
        
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
		if( StringUtils.isEmpty(nermUID))
			Asserter.fail(this.getClass(),"nermUID");
		this.nermUID = nermUID;
	}
	public String getHolderrmUID() {
		return holderrmUID;
	}
	public void setHolderrmUID(String holderrmUID) {
		if( StringUtils.isEmpty(holderrmUID))
			Asserter.fail(this.getClass(),"holderrmUID");
		this.holderrmUID = holderrmUID;
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
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		if( StringUtils.isEmpty(cardType) || cardType.length()>255 )
			Asserter.fail(this.getClass(),"cardType");
		this.cardType = cardType;
	}
	public String getCardSubType() {
		return cardSubType;
	}
	public void setCardSubType(String cardSubType) {
                                    if (StringUtils.isEmpty(cardSubType)){
                                                      cardSubType = "";
                                    }
//		if( StringUtils.isEmpty(cardSubType) || cardSubType.length()>50 )
//                                    if(cardSubType.length()>50)
//			Asserter.fail(this.getClass(),"cardSubType");
		this.cardSubType = cardSubType;
	}
	public String getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		if( StringUtils.isEmpty(softwareVersion) || softwareVersion.length()>255 )
			Asserter.fail(this.getClass(),"softwareVersion");
		this.softwareVersion = softwareVersion;
	}
	public String getHardwareVersion() {
		return hardwareVersion;
	}
	public void setHardwareVersion(String hardwareVersion) {
		if( StringUtils.isEmpty(hardwareVersion) || hardwareVersion.length()>255 )
			Asserter.fail(this.getClass(),"hardwareVersion");
		this.hardwareVersion = hardwareVersion;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
                                    if (StringUtils.isEmpty(serialNumber)){
                                                      serialNumber = "";
                                    }
//		if( StringUtils.isEmpty(serialNumber) || serialNumber.length()>255 )
		if( serialNumber.length()>255 )
			Asserter.fail(this.getClass(),"serialNumber");
		this.serialNumber = serialNumber;
	}
	public String getServiceState() {
		return serviceState;
	}
	public void setServiceState(String serviceState) {
		if( StringUtils.isEmpty(serviceState))
			Asserter.fail(this.getClass(),"serviceState");
		this.serviceState = serviceState;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if( StringUtils.isEmpty(role))
			Asserter.fail(this.getClass(),"role");
		this.role = role;
	}
	@Override
	public String getResType() {
		return "CRD";
	}

}
