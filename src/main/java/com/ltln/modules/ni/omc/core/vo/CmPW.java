package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmPW extends BaseVO {

	private static final long serialVersionUID = -1677130243180190482L;
	
	
	/**
	 * 名称：方向
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		CD_UNI：单向；
		CD_BI：双向
	 * 数据示例1：D_BIDIRECTIONAL
	 * 数据示例2：D_BIDIRECTIONAL
	 * */
	String direction;
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
	 * 名称：宿端rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEndTprmUID;
	/**
	 * 名称：宿端网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEndNermUID;
	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明：OMC上显示的伪线名称
	 * 数据示例1：pwtrail1
	 * 数据示例2：pwtrail1
	 * */
	String nativeName="";
	/**
	 * 名称：源端端口rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：如果伪线源端点归属于端口，则必填
	 * 数据示例：
	 * */
	String aEndPortrmUID="";
	/**
	 * 名称：宿端端口rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：如果伪线宿端点归属于端口，则必填
	 * 数据示例：
	 * */
	String zEndPortrmUID="";
	/**
	 * 名称：激活标识
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：枚举值包括：
		ACTIVE：激活；
		PARTIAL（部分激活）；
		PENDING（去激活）
	 * 数据示例1：ACTIVE
	 * 数据示例2：ACTIVE
	 * */
	String activeState="";
	/**
	 * 名称：CIR
	 * 最大长度:20
	 * 是否必填：否
	 * 取值范围及说明：有则必填，单位：kbit/s
	 * 数据示例：
	 * */
	String CIR="";
	/**
	 * 名称：PIR
	 * 最大长度:20
	 * 是否必填：否
	 * 取值范围及说明：有则必填，单位：kbit/s
	 * 数据示例：
	 * */
	String PIR="";
	                  
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
                  
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		if( StringUtils.isEmpty(direction)  )
			Asserter.fail(this.getClass(),"direction");
		this.direction = direction;
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
	public String getzEndTprmUID() {
		return zEndTprmUID;
	}
	public void setzEndTprmUID(String zEndTprmUID) {
		if( StringUtils.isEmpty(zEndTprmUID)  )
			Asserter.fail(this.getClass(),"zEndTprmUID");
		this.zEndTprmUID = zEndTprmUID;
	}
	public String getzEndNermUID() {
		return zEndNermUID;
	}
	public void setzEndNermUID(String zEndNermUID) {
		if( StringUtils.isEmpty(zEndNermUID)  )
			Asserter.fail(this.getClass(),"zEndNermUID");
		this.zEndNermUID = zEndNermUID;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
                                    if (StringUtils.isEmpty(nativeName)){
                                                      nativeName = "";
                                    }
//		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
		if(nativeName.length()>255 )
			Asserter.fail(this.getClass(),"nativeName");
		this.nativeName = nativeName;
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
	public String getActiveState() {
		return activeState;
	}
	public void setActiveState(String activeState) {
                                    if (StringUtils.isEmpty(activeState)){
                                                      activeState = "";
                                    }
//		if( StringUtils.isEmpty(activeState)  )
//			Asserter.fail(this.getClass(),"activeState");
		this.activeState = activeState;
	}
	public String getCIR() {
		return CIR;
	}
	public void setCIR(String cIR) {
                                    if (StringUtils.isEmpty(cIR)){
                                                      cIR = "";
                                    }
//		if( StringUtils.isEmpty(cIR) || cIR.length()>20)
		if(cIR.length()>20)
			Asserter.fail(this.getClass(),"cIR");
		CIR = cIR;
	}
	public String getPIR() {
		return PIR;
	}
	public void setPIR(String pIR) {
                                    if (StringUtils.isEmpty(pIR)){
                                                      pIR = "";
                                    }
//		if( StringUtils.isEmpty(pIR) || pIR.length()>20)
		if(pIR.length()>20)
			Asserter.fail(this.getClass(),"pIR");
		PIR = pIR;
	}
	@Override
	public String getResType() {
		return "PSW";
	}

}
