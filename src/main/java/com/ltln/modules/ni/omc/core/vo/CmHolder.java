package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmHolder extends BaseVO{
	
	private static final long serialVersionUID = -7078332986922032989L;

	/**
	 * 名称：所属网元rmUID
	 * 最大长度:
	 * 是否必填:是
	 * 取值范围及说明 :
	 * 数据示例:
	 */
	String nermUID;
	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填:否
	 * 取值范围及说明 :OMC上显示的容器名称
	 * 数据示例:OMC=MAS-U2000-1-P
	 */
	String nativeName="";
	/**
	 * 名称：容器序号
	 * 最大长度:
	 * 是否必填:否
	 * 取值范围及说明 :在所属上层容器中的序号
                        容器有所属上层容器时必填，十进制
	 * 数据示例:
	 */
	String holderNumber="";
	/**
	 * 名称：容器状态
	 * 最大长度:
	 * 是否必填:是
	 * 取值范围及说明 :枚举值包括：
       EMPTY：空；
       INSTALLED_AND_EXPECTED：网管与设备上的安装单板一致；
       EXPECTED_AND_NOT_INSTALLED：网管上安装了单板但设备上没有安装； 
       INSTALLED_AND_NOT_EXPECTED：网管上没有安装单板但设备已经安装单板
       MISMATCH_OF_INSTALLED_AND_EXPECTED：网管和设备上都安装了单板，但单板类型不一致；
       UNAVAILABLE：不可用，该槽位没有安装单板，但是该槽位已经被其它单板占用不能再安装单板，当一板占多槽时会出现此状态；
       UNKNOWN：其它情况
     * 数据示例:INSTALLED_AND_EXPECTED
	 */
	String holderState;
	/**
	 * 名称：容器类型
	 * 最大长度:
	 * 是否必填:是
	 * 取值范围及说明 :枚举值包括：
       rack：机架；  
       sub_rack：子架；
       shelf：机框；
       sub_shelf：子框；
       slot：机槽；
       sub_slot：子槽。
	 * 数据示例:slot
	 */
	String holderType;
	/**
	 * 名称：所属上层容器rmUID
	 * 最大长度:
	 * 是否必填:否
	 * 取值范围及说明 :1、当容器类型是子架、机框、子框、机槽、子槽时必填。子架的上层容器只能是机架；
	 * 机框的上层容器可以是机架或子架；
	 * 子框的上层容器只能是机框；
	 * 机槽的上层容器可以是机框或子框；
	 * 子槽的上层容器只能是机槽。
	 * 数据示例:
	 */
	String parentHolderrmUID="";
	                  
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
		if( StringUtils.isEmpty(nermUID) )
			Asserter.fail(this.getClass(),"nermUID");
		this.nermUID = nermUID;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
                                    if (StringUtils.isEmpty(nativeName)){
                                                      nativeName = "";
                                    }
//		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
			Asserter.fail(this.getClass(),"nativeName");
		this.nativeName = nativeName;
	}
	public String getHolderNumber() {
		return holderNumber;
	}
	public void setHolderNumber(String holderNumber) {
                                    if (StringUtils.isEmpty(holderNumber)){
                                                      holderNumber = "";
                                    }
//		if( StringUtils.isEmpty(holderNumber)  )
//			Asserter.fail(this.getClass(),"holderNumber");
		this.holderNumber = holderNumber;
	}
	public String getHolderState() {
		return holderState;
	}
	public void setHolderState(String holderState) {
		if( StringUtils.isEmpty(holderState)  )
			Asserter.fail(this.getClass(),"holderState");
		this.holderState = holderState;
	}
	public String getHolderType() {
		return holderType;
	}
	public void setHolderType(String holderType) {
		if( StringUtils.isEmpty(holderType)  )
			Asserter.fail(this.getClass(),"holderType");
		this.holderType = holderType;
	}
	public String getParentHolderrmUID() {
		return parentHolderrmUID;
	}
	public void setParentHolderrmUID(String parentHolderrmUID) {
                                    if (StringUtils.isEmpty(parentHolderrmUID)){
                                                      parentHolderrmUID = "";
                                    }
//		if( StringUtils.isEmpty(parentHolderrmUID)  )
//		    Asserter.fail(this.getClass(),"parentHolderrmUID");
	    this.parentHolderrmUID = parentHolderrmUID;
	}
	@Override
	public String getResType() {
		return "EQH";
	}

}
