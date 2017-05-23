package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmTDM extends BaseVO {

	
	private static final long serialVersionUID = 4624022581460183928L;
	

	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明：在OMC上显示的TDM业务名称
	 * 数据示例：2053-武汉钟家村/3900-9005-WHMD(DC)-1-PTN6-TDM-1
	 * */
	String nativeName="";
	/**
	 * 名称：业务速率
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：2M、34M、155M
	 * 数据示例：2M
	 * */
	String rate;
	/**
	 * 名称：方向
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		CD_UNI：单向；
		CD_BI：双向
	 * 数据示例：D_BIDIRECTIONAL
	 * */
	String direction;
	/**
	 * 名称：激活标识
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		ACTIVE：激活；
		PARTIAL（部分激活）；
		PENDING（去激活）
	 * 数据示例：ACTIVE
	 * */
	String activeState;
	/**
	 * 名称：用户名称
	 * 最大长度:64
	 * 是否必填：否
	 * 取值范围及说明：在OMC上显示的TDM业务名称
	 * 数据示例：
	 * */
	String owner="";
	/**
	 * 名称：客户业务类型
	 * 最大长度:64
	 * 是否必填：否
	 * 取值范围及说明：OMC上设置的客户业务类型。
		如果是集客业务，需要细化明确是跨省集客、跨地市集客、本地集客
	 * 数据示例：
	 * */
	String owneSserviceType="";
	/**
	 * 名称：源端rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String aEndTprmUID;
	/**
	 * 名称：源端网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String aEndNermUID;
	/**
	 * 名称：源端端口rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String aEndPortrmUID;
	/**
	 * 名称：源端CTP
	 * 最大长度:50
	 * 是否必填：否
	 * 取值范围及说明：当业务速率低于占用的端口速率时，此项必填，
	 * 格式：VC4=<VC4Number>或VC4=<VC4Number>/VC3=<VC3Number>或VC4=<VC4Number>/VC12=<VC12Number>。VC3Number的取值范围是1-3；VC12Number的取值范围是1-63
	 * 数据示例：VC4=1/VC12=15
	 * */
	String aEndCTPID="";
	/**
	 * 名称：宿端1rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEnd1TprmUID;
	/**
	 * 名称：宿端1网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEnd1NermUID;
	/**
	 * 名称：宿端1端口rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEnd1PortrmUID;
	/**
	 * 名称：宿端1CTP
	 * 最大长度:50
	 * 是否必填：否
	 * 取值范围及说明：当业务速率低于占用的端口速率时，此项必填，格式：VC4=<VC4Number>或VC4=<VC4Number>/VC3=<VC3Number>或
	 * VC4=<VC4Number>/VC12=<VC12Number>。VC3Number的取值范围是1-3；VC12Number的取值范围是1-63
	 * 数据示例：VC4=1/VC12=15
	 * */
	String aEnd1CTPID="";
	/**
	 * 名称：宿端2rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、当业务是一源两宿时，此项必填
	 * 数据示例：
	 * */
	String zEnd2TprmUID="";
	/**
	 * 名称：宿端2网元rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、当业务是一源两宿时，此项必填
	 * 数据示例：
	 * */
	String zEnd2NermUID="";
	/**
	 * 名称：宿端2端口rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、当业务是一源两宿时，此项必填
	 * 数据示例：
	 * */
	String zEnd2PortrmUID="";
	/**
	 * 名称：宿端2CTP
	 * 最大长度:50
	 * 是否必填：否
	 * 取值范围及说明：当业务是一源两宿并且业务速率低于占用的端口速率时，此项必填，格式：VC4=<VC4Number>或VC4=<VC4Number>/VC3=<VC3Number>或
	 * VC4=<VC4Number>/VC12=<VC12Number>。VC3Number的取值范围是1-3；VC12Number的取值范围是1-63。
	 * 数据示例：
	 * */
	String aEnd2CTPID="";
	/**
	 * 名称：承载的伪线1 rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String PW1rmUID;
	/**
	 * 名称：承载的伪线2 rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、当业务是一源两宿时，此项必填
	 * 数据示例：
	 * */
	String PW2rmUID="";
	                  
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
                  
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
			Asserter.fail(this.getClass(),"nativeName");
		this.nativeName = nativeName;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		if( StringUtils.isEmpty(rate)  )
			Asserter.fail(this.getClass(),"rate");
		this.rate = rate;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		if( StringUtils.isEmpty(direction)  )
			Asserter.fail(this.getClass(),"direction");
		this.direction = direction;
	}
	public String getActiveState() {
		return activeState;
	}
	public void setActiveState(String activeState) {
		if( StringUtils.isEmpty(activeState)  )
			Asserter.fail(this.getClass(),"activeState");
		this.activeState = activeState;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
//		if( StringUtils.isEmpty(owner) || owner.length()>64 )
                                    if (owner.isEmpty()) {
                                        owner = "";
                                    }
		if( owner.length()>64 )
			Asserter.fail(this.getClass(),"owner");
		this.owner = owner;
	}
	public String getOwneSserviceType() {
		return owneSserviceType;
	}
	public void setOwneSserviceType(String owneSserviceType) {
//		if( StringUtils.isEmpty(owneSserviceType) || owneSserviceType.length()>64 )
                                    if (owneSserviceType.isEmpty()) {
                                        owneSserviceType = "";
                                    }
		if( owneSserviceType.length()>64 )
			Asserter.fail(this.getClass(),"owneSserviceType");
		this.owneSserviceType = owneSserviceType;
	}
	public String getaEndTprmUID() {
		return aEndTprmUID;
	}
	public void setaEndTprmUID(String aEndTprmUID) {
		if( StringUtils.isEmpty(aEndTprmUID)  )
			Asserter.fail(this.getClass(),"aEndTprmUID");
		this.aEndTprmUID = aEndTprmUID;
	}
	public String getaEndNermUID() {
		return aEndNermUID;
	}
	public void setaEndNermUID(String aEndNermUID) {
		if( StringUtils.isEmpty(aEndNermUID)  )
			Asserter.fail(this.getClass(),"aEndNermUID");
		this.aEndNermUID = aEndNermUID;
	}
	public String getaEndPortrmUID() {
		return aEndPortrmUID;
	}
	public void setaEndPortrmUID(String aEndPortrmUID) {
		if( StringUtils.isEmpty(aEndPortrmUID)  )
			Asserter.fail(this.getClass(),"aEndPortrmUID");
		this.aEndPortrmUID = aEndPortrmUID;
	}
	public String getaEndCTPID() {
		return aEndCTPID;
	}
	public void setaEndCTPID(String aEndCTPID) {
                                    if (aEndCTPID.isEmpty()) {
                                        aEndCTPID = "";
                                    }
//		if( StringUtils.isEmpty(aEndCTPID) || aEndCTPID.length()>50 )
		if( aEndCTPID.length()>50 )
			Asserter.fail(this.getClass(),"aEndCTPID");
		this.aEndCTPID = aEndCTPID;
	}
	public String getzEnd1TprmUID() {
		return zEnd1TprmUID;
	}
	public void setzEnd1TprmUID(String zEnd1TprmUID) {
		if( StringUtils.isEmpty(zEnd1TprmUID)  )
			Asserter.fail(this.getClass(),"zEnd1TprmUID");
		this.zEnd1TprmUID = zEnd1TprmUID;
	}
	public String getzEnd1NermUID() {
		return zEnd1NermUID;
	}
	public void setzEnd1NermUID(String zEnd1NermUID) {
		if( StringUtils.isEmpty(zEnd1NermUID)  )
			Asserter.fail(this.getClass(),"zEnd1NermUID");
		this.zEnd1NermUID = zEnd1NermUID;
	}
	public String getzEnd1PortrmUID() {
		return zEnd1PortrmUID;
	}
	public void setzEnd1PortrmUID(String zEnd1PortrmUID) {
		if( StringUtils.isEmpty(zEnd1PortrmUID)  )
			Asserter.fail(this.getClass(),"zEnd1PortrmUID");
		this.zEnd1PortrmUID = zEnd1PortrmUID;
	}
	public String getaEnd1CTPID() {
		return aEnd1CTPID;
	}
	public void setaEnd1CTPID(String aEnd1CTPID) {
                                    if (aEnd1CTPID.isEmpty()) {
                                        aEnd1CTPID = "";
                                    }
//		if( StringUtils.isEmpty(aEnd1CTPID) || aEnd1CTPID.length()>50 )
		if( aEnd1CTPID.length()>50 )
			Asserter.fail(this.getClass(),"aEnd1CTPID");
		this.aEnd1CTPID = aEnd1CTPID;
	}
	public String getzEnd2TprmUID() {
		return zEnd2TprmUID;
	}
	public void setzEnd2TprmUID(String zEnd2TprmUID) {
                                    if (zEnd2TprmUID.isEmpty()) {
                                        zEnd2TprmUID = "";
                                    }
//		if( StringUtils.isEmpty(zEnd2TprmUID)  )
//			Asserter.fail(this.getClass(),"zEnd2TprmUID");
		this.zEnd2TprmUID = zEnd2TprmUID;
	}
	public String getzEnd2NermUID() {
		return zEnd2NermUID;
	}
	public void setzEnd2NermUID(String zEnd2NermUID) {
                                    if (zEnd2NermUID.isEmpty()) {
                                        zEnd2NermUID = "";
                                    }
//		if( StringUtils.isEmpty(zEnd2NermUID)  )
//			Asserter.fail(this.getClass(),"zEnd2NermUID");
		this.zEnd2NermUID = zEnd2NermUID;
	}
	public String getzEnd2PortrmUID() {
		return zEnd2PortrmUID;
	}
	public void setzEnd2PortrmUID(String zEnd2PortrmUID) {
                                    if (zEnd2PortrmUID.isEmpty()) {
                                        zEnd2PortrmUID = "";
                                    }
//		if( StringUtils.isEmpty(zEnd2PortrmUID)  )
//			Asserter.fail(this.getClass(),"zEnd2PortrmUID");
		this.zEnd2PortrmUID = zEnd2PortrmUID;
	}
	public String getaEnd2CTPID() {
		return aEnd2CTPID;
	}
	public void setaEnd2CTPID(String aEnd2CTPID) {
                                    if (aEnd2CTPID.isEmpty()) {
                                        aEnd2CTPID = "";
                                    }
//		if( StringUtils.isEmpty(aEnd2CTPID) || aEnd2CTPID.length()>50 )
		if( aEnd2CTPID.length()>50 )
			Asserter.fail(this.getClass(),"aEnd2CTPID");
		this.aEnd2CTPID = aEnd2CTPID;
	}
	public String getPW1rmUID() {
		return PW1rmUID;
	}
	public void setPW1rmUID(String pW1rmUID) {
		if( StringUtils.isEmpty(pW1rmUID)  )
			Asserter.fail(this.getClass(),"pW1rmUID");
		PW1rmUID = pW1rmUID;
	}
	public String getPW2rmUID() {
		return PW2rmUID;
	}
	public void setPW2rmUID(String pW2rmUID) {
                                    if (pW2rmUID.isEmpty()) {
                                        pW2rmUID = "";
                                    }
//		if( StringUtils.isEmpty(pW2rmUID)  )
//			Asserter.fail(this.getClass(),"pW2rmUID");
		PW2rmUID = pW2rmUID;
	}
	@Override
	public String getResType() {
		return "TDM";
	}

}
