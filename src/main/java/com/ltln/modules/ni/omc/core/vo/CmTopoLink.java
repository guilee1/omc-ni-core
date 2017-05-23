package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmTopoLink extends BaseVO {

	
	private static final long serialVersionUID = -6088158103852602099L;
	

	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明OMC上显示的拓扑连接名称：
	 * 数据示例：2008-武汉水墨丹青传输机房/3900-11-EX2-1(PORT-1)-2006-武汉大桥局宿舍/3900-7-EX2-1(PORT-1)
	 * */
	String nativeName="";
	/**
	 * 名称：连接起点网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String aEndNermUID;
	/**
	 * 名称：连接终点网元rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEndNermUID;
	/**
	 * 名称：连接起点端口rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String aEndPortrmUID;
	/**
	 * 名称：连接终点端口rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String zEndPortrmUID;
	/**
	 * 名称：拓扑两端端口速率
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：见字典表
	 * 数据示例：GE
	 * */
	String rate;
	/**
	 * 名称：连接方向
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
		CD_UNI：单向；
		CD_BI：双向
	 * 数据示例：CD_BI
	 * */
	String direction;
	/**
	 * 名称：虚实性
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
		描述拓扑连接是实际拓扑连接还是虚拟拓扑连接。
		在小型化PTN与城域网PTN以overlay方式对接时，
		跨接城域网PTN的2个小型化PTN端口之间的拓扑连接称为虚拟拓扑连接。
		在这种情况下，一个小型化PTN端口上可以存在多条虚拟拓扑连接。

		枚举值包括：
		real：实际拓扑连接；virtual：虚拟拓扑连接
		1、一个端口上只能存在一条实际拓扑连接
		2、一个端口上存在实际拓扑连接时不允许再有虚拟拓扑连接
	* 数据示例：real
	* */		 
	String reality;
	                  
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
                                    if (nativeName.isEmpty()) {
                                        nativeName = "";
                                    }
//		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
		if( nativeName.length()>255 )
			Asserter.fail(this.getClass(),"nativeName");
		this.nativeName = nativeName;
	}
	public String getaEndNermUID() {
		return aEndNermUID;
	}
	public void setaEndNermUID(String aEndNermUID) {
		if( StringUtils.isEmpty(aEndNermUID)  )
			Asserter.fail(this.getClass(),"aEndNermUID");
		this.aEndNermUID = aEndNermUID;
	}
	public String getzEndNermUID() {
		return zEndNermUID;
	}
	public void setzEndNermUID(String zEndNermUID) {
		if( StringUtils.isEmpty(zEndNermUID)  )
			Asserter.fail(this.getClass(),"zEndNermUID");
		this.zEndNermUID = zEndNermUID;
	}
	public String getaEndPortrmUID() {
		return aEndPortrmUID;
	}
	public void setaEndPortrmUID(String aEndPortrmUID) {
		if( StringUtils.isEmpty(aEndPortrmUID)  )
			Asserter.fail(this.getClass(),"aEndPortrmUID");
		this.aEndPortrmUID = aEndPortrmUID;
	}
	public String getzEndPortrmUID() {
		return zEndPortrmUID;
	}
	public void setzEndPortrmUID(String zEndPortrmUID) {
		if( StringUtils.isEmpty(zEndPortrmUID)  )
			Asserter.fail(this.getClass(),"zEndPortrmUID");
		this.zEndPortrmUID = zEndPortrmUID;
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
	public String getReality() {
		return reality;
	}
	public void setReality(String reality) {
		if( StringUtils.isEmpty(reality)  )
			Asserter.fail(this.getClass(),"reality");
		this.reality = reality;
	}
	@Override
	public String getResType() {
		return "TPL";
	}

}
