package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmSubNet extends BaseVO {

	private static final long serialVersionUID = 7297237792567901295L;

	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：是
	 * 取值范围及说明：OMC上显示的子网名称
		在OMC下唯一
	 * 数据示例1：Subnet-165
	 * 数据示例2：Subnet-165
	 * */
	String nativeName;

	/**
	 * 名称：所属上级子网rmUID
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：1、有则必填
	 * 数据示例：
	 * */
	String parentSubnetrmUID="";
	/**
	 * 名称：相对X坐标
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：该子网在其所属上级子网拓扑图中的X坐标
	 * 数据示例1：100
	 * 数据示例2：100
	 * */
	String xPos;
	/**
	 * 名称：相对Y坐标
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：该子网在其所属上级子网拓扑图中的Y坐标
	 * 数据示例1：200
	 * 数据示例2：200
	 * */
	String yPos;
	                  
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
	public String getParentSubnetrmUID() {
		return parentSubnetrmUID;
	}
	public void setParentSubnetrmUID(String parentSubnetrmUID) {
                                    if (parentSubnetrmUID.isEmpty()) {
                                        parentSubnetrmUID = "";
                                    }
//		if( StringUtils.isEmpty(parentSubnetrmUID)  )
//			Asserter.fail(this.getClass(),"parentSubnetrmUID");
		this.parentSubnetrmUID = parentSubnetrmUID;
	}
	public String getxPos() {
		return xPos;
	}
	public void setxPos(String xPos) {
		if( StringUtils.isEmpty(xPos)  )
			Asserter.fail(this.getClass(),"xPos");
		this.xPos = xPos;
	}
	public String getyPos() {
		return yPos;
	}
	public void setyPos(String yPos) {
		if( StringUtils.isEmpty(yPos)  )
			Asserter.fail(this.getClass(),"yPos");
		this.yPos = yPos;
	}
	@Override
	public String getResType() {
		return "SBN";
	}

}
