package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmTunnel extends BaseVO {

	private static final long serialVersionUID = -7921787557199786572L;
	

	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填是
	 * 取值范围及说明 :OMC上显示的隧道名称
	 * 数据示例:2014-武汉冷冻六厂/39-9005-武汉东菜园L2/L3-静态CR-65P
	 */
	String nativeName;
	/**
	 * 名称：方向
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 :标识隧道是单向还是双向
		枚举值包括：
		CD_UNI：单向；CD_BI：双向
	 * 数据示例:D_BIDIRECTIONAL
	 */
	String direction;
	/**
	 * 名称：激活标识
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 :枚举值包括：
		ACTIVE：激活；
		PARTIAL（部分激活）；
		PENDING（去激活）
	 * 数据示例:ACTIVE
	 */
	String activeState;
	/**
	 * 名称：源端rmUID
	 * 最大长度:
	 * 是否必填否
	 * 取值范围及说明 :当源端是双向时必填
	 * 数据示例:
	 */
	String aEndTprmUID="";
	/**
	 * 名称：源端网元rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 :
	 * 数据示例:
	 */
	String aEndNermUID;
	/**
	 * 名称：源端端口rmUID
	 * 最大长度:
	 * 是否必填否
	 * 取值范围及说明 :当源端端口是双向时必填
	 * 数据示例:
	 */
	String aEndPortrmUID="";
	/**
	 * 名称：源端出标签
	 * 最大长度:20
	 * 是否必填否
	 * 取值范围及说明 :
	 * 数据示例:17
	 */
	String aEndOutLabel="";
	/**
	 * 名称：源端入标签
	 * 最大长度:20
	 * 是否必填否
	 * 取值范围及说明 :
	 * 数据示例:148
	 */
	String aEndRevInLabel="";
	/**
	 * 名称：宿端rmUID
	 * 最大长度:
	 * 是否必填否
	 * 取值范围及说明 :当宿端是双向时必填
	 * 数据示例:
	 */
	String zEndTprmUID="";
	/**
	 * 名称：宿端网元rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 :
	 * 数据示例:
	 */
	String zEndNermUID;
	/**
	 * 名称：宿端端口rmUID
	 * 最大长度:
	 * 是否必填否 
	 * 取值范围及说明 :当宿端端口是双向时必填
	 * 数据示例:
	 */
	String zEndPortrmUID="";
	/**
	 * 名称：宿端入标签
	 * 最大长度:20
	 * 是否必填否 
	 * 取值范围及说明 :
	 * 数据示例:32
	 */
	String zEndInLabel="";
	/**
	 * 名称：宿端出标签
	 * 最大长度:20
	 * 是否必填否 
	 * 取值范围及说明 :
	 * 数据示例:36
	 */
	String zEndRevOutLabel="";
	/**
	 * 名称：CIR
	 * 最大长度:20
	 * 是否必填否 
	 * 取值范围及说明 :有则必填，单位：kbit/s
	 * 数据示例:
	 */
	String CIR="";
	/**
	 * 名称：PIR
	 * 最大长度:20
	 * 是否必填否 
	 * 取值范围及说明 :有则必填，单位：kbit/s
	 * 数据示例:
	 */
	String PIR="";
	/**
	 * 名称：是否overlay
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 :标识隧道是否是overlay方式
		枚举值包括：
		true：overlay方式；false：非overlay方式
	 * 数据示例: true
	 */
	String overlay;
	                  
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
                                    if (StringUtils.isEmpty(aEndPortrmUID)){
                                                      aEndPortrmUID = "";
                                    }
//		if( StringUtils.isEmpty(aEndPortrmUID)  )
//			Asserter.fail(this.getClass(),"aEndPortrmUID");
		this.aEndPortrmUID = aEndPortrmUID;
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
	public String getzEndNermUID() {
		return zEndNermUID;
	}
	public void setzEndNermUID(String zEndNermUID) {
		if( StringUtils.isEmpty(zEndNermUID)  )
			Asserter.fail(this.getClass(),"zEndNermUID");
		this.zEndNermUID = zEndNermUID;
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
	public String getCIR() {
		return CIR;
	}
	public void setCIR(String cIR) {
                                    if (StringUtils.isEmpty(cIR)){
                                                      cIR = "";
                                    }
//		if( StringUtils.isEmpty(cIR) || cIR.length()>20 )
		if(cIR.length()>20 )
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
//		if( StringUtils.isEmpty(pIR) || pIR.length()>20 )
		if(pIR.length()>20 )
			Asserter.fail(this.getClass(),"pIR");
		
		PIR = pIR;
	}
	public String getOverlay() {
		return overlay;
	}
	public void setOverlay(String overlay) {
		if( StringUtils.isEmpty(overlay)  )
			Asserter.fail(this.getClass(),"overlay");
		this.overlay = overlay;
	}
	@Override
	public String getResType() {
		return "TNL";
	}

}
