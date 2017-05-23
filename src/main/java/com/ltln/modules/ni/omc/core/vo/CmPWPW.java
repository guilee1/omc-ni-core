package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmPWPW extends BaseVO {

	
	private static final long serialVersionUID = -6900847558334514792L;
	

	/**
	 * 名称：伪线rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */
	String pwrmUID;

	/**
	 * 名称：承载伪线rmUID
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例：
	 * */

	String carriePwrmUID;

	/**
	 * 名称：承载伪线序号
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：承载伪线在被承载伪线路由中的序号。
	 * 	一条伪线可能会承载在其他多条伪线上。
		从1开始，十进制方式
	 * 数据示例：1
	 * */
	String number;
                  

                  @Override
                  public String getFileRmUID() {
                      //excel中无，且样例中没数据，先以pwrmUID为准
                      return this.pwrmUID;
                  }
                  
	public String getPwrmUID() {
		return pwrmUID;
	}

	public void setPwrmUID(String pwrmUID) {
		if( StringUtils.isEmpty(pwrmUID)  )
			Asserter.fail(this.getClass(),"pwrmUID");
		this.pwrmUID = pwrmUID;
	}

	public String getCarriePwrmUID() {
		return carriePwrmUID;
	}

	public void setCarriePwrmUID(String carriePwrmUID) {
		if( StringUtils.isEmpty(carriePwrmUID)  )
			Asserter.fail(this.getClass(),"carriePwrmUID");
		this.carriePwrmUID = carriePwrmUID;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		if( StringUtils.isEmpty(number)  )
			Asserter.fail(this.getClass(),"number");
		this.number = number;
	}

	@Override
	public String getResType() {
		return "PWP";
	}

}
