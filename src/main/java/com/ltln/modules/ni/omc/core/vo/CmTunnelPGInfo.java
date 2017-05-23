package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmTunnelPGInfo extends BaseVO {

	
	private static final long serialVersionUID = -591092002067075726L;
	

	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：是
	 * 取值范围及说明：OMC上的隧道保护组名称
	 * 数据示例：9001-WHCQ-L3-PTN6900-1-9007-WHDCY-L2L3-3-PG-00000001
	 * */
	String nativeName;
	/**
	 * 名称：保护组恢复方式
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		RM_REVERTIVE：恢复式；
		RM_NON_REVERTIVE：非恢复式；
		RM_UNKNOWN：未知。
	 * 数据示例：RM_REVERTIVE
	 * */
	String reversionMode;
	/**
	 * 名称：保护类型
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：1+1、1:1。
	 * 数据示例：1+1
	 * */
	String type;
                  
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
	public String getReversionMode() {
		return reversionMode;
	}
	public void setReversionMode(String reversionMode) {
		if( StringUtils.isEmpty(reversionMode)  )
			Asserter.fail(this.getClass(),"reversionMode");
		this.reversionMode = reversionMode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if( StringUtils.isEmpty(type)  )
			Asserter.fail(this.getClass(),"type");
		this.type = type;
	}
	@Override
	public String getResType() {
		return "TPI";
	}

}
