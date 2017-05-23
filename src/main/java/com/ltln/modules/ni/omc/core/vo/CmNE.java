package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmNE  extends BaseVO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1221150783234741416L;
	
	String rmUID;
	
	/**
	 * 名称：本地名称
	 * 最大长度:255
	 * 是否必填：是
	 * 取值范围及说明OMC上显示的网元名称
                        在所属OMC范围内唯一：
	 * 数据示例:3519-马鞍山西塘路２楼测试－PTN960
	 * */
	String nativeName;
	/**
	 * 名称：物理位置
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明：OMC上设置的网元放置位置，建议在OMC上设置到地市级
	 * 数据示例:
	 * */
	String location="";
	/**
	 * 名称：设备型号
	 * 最大长度:50
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例:OptiX PTN 960
	 * */
	String productName;
	/**
	 * 名称：设备供应商
	 * 最大长度:20
	 * 是否必填：是
	 * 取值范围及说明：见《OMC系统北向接口数据规范-公共数据分册》
	 * 数据示例:
	 * */
	String vendor;
	/**
	 * 名称：虚实性
	 * 最大长度:20
	 * 是否必填：是
	 * 取值范围及说明：描述网元是OMC上管理的实际网元还是在OMC上虚拟的相邻OMC上的网元
                         枚举值包括：real：实际网元；virtual：虚拟网元
	 * 数据示例:real
	 * */
	String reality;
	/**
	 * 名称：设备IP
	 * 最大长度:40
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例:129.9.5.106
	 * */
	String IPAddress;
	/**
	 * 名称：控制平面IP地址
	 * 最大长度:40
	 * 是否必填：否
	 * 取值范围及说明：
	 * 数据示例:129.9.5.106
	 * */
	String controlPlaneIP="";
	/**
	 * 名称：硬件版本
	 * 最大长度:255
	 * 是否必填：否
	 * 取值范围及说明：有则必填
	 * 数据示例:
	 * */
	String hardwareVersion="";
	/**
	 * 名称：软件版本
	 * 最大长度:255
	 * 是否必填：是
	 * 取值范围及说明：
	 * 数据示例:V100R003C03SPC200
	 * */
	String softwareVersion;
	/**
	 * 名称：设备支持的最大配置能力
	 * 最大长度:
	 * 是否必填：否
	 * 取值范围及说明：设备的最大交换容量
	 * 数据示例:80G
	 * */
	String maxCapacity="";
	/**
	 * 名称：状态
	 * 最大长度:
	 * 是否必填：是
	 * 取值范围及说明：枚举值包括：
       avaliable：可用；unavaliable：不可用
	 * 数据示例:avaliable
	 * */
	String state;
	
	public String getRmUID() {
		return rmUID;
	}
	public void setRmUID(String rmUID) {
		if( StringUtils.isEmpty(rmUID) )
			Asserter.fail(this.getClass(),"rmUID");
		this.rmUID = rmUID;
	}
	
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		if( StringUtils.isEmpty(nativeName) || nativeName.length()>255 )
			Asserter.fail(this.getClass(),"nativeName");
		this.nativeName = nativeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
                                    if (StringUtils.isEmpty(location)){
                                                      location = "";
                                    }
                                    else if(  location.length()>255 ){
			Asserter.fail(this.getClass(),"location");
                                    }
		this.location = location;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		if( StringUtils.isEmpty(productName) || productName.length()>50 )
			Asserter.fail(this.getClass(),"productName");
		this.productName = productName;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		if( StringUtils.isEmpty(vendor) || vendor.length()>20 )
			Asserter.fail(this.getClass(),"vendor");
		this.vendor = vendor;
	}
	public String getReality() {
		return reality;
	}
	public void setReality(String reality) {
		if( StringUtils.isEmpty(reality) )
			Asserter.fail(this.getClass(),"reality");
		this.reality = reality;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		if( StringUtils.isEmpty(iPAddress) || iPAddress.length()>40 )
			Asserter.fail(this.getClass(),"iPAddress");
		
		this.IPAddress = iPAddress;
	}
	public String getControlPlaneIP() {
		return controlPlaneIP;
	}
	public void setControlPlaneIP(String controlPlaneIP) {
            //文档上非必填项
//		if( StringUtils.isEmpty(controlPlaneIP) || controlPlaneIP.length()>40 )
                                    if (StringUtils.isEmpty(controlPlaneIP)){
                                                      controlPlaneIP = "";
                                    }
		if( controlPlaneIP.length()>40 )
			Asserter.fail(this.getClass(),"controlPlaneIP");
		this.controlPlaneIP = controlPlaneIP;
	}
	public String getHardwareVersion() {
		return hardwareVersion;
	}
	public void setHardwareVersion(String hardwareVersion) {
                                    if (StringUtils.isEmpty(hardwareVersion)){
                                                      hardwareVersion = "";
                                    }
		if( StringUtils.isEmpty(hardwareVersion) || hardwareVersion.length()>255 )
			Asserter.fail(this.getClass(),"hardwareVersion");
		this.hardwareVersion = hardwareVersion;
	}
	public String getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		if( StringUtils.isEmpty(softwareVersion) || softwareVersion.length()>255 )
			Asserter.fail(this.getClass(),"softwareVersion");
		this.softwareVersion = softwareVersion;
	}
	public String getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(String maxCapacity) {
                                    if (StringUtils.isEmpty(maxCapacity)){
                                                      maxCapacity = "";
                                    }
//		if( StringUtils.isEmpty(maxCapacity) )
//			Asserter.fail(this.getClass(),"maxCapacity");
		this.maxCapacity = maxCapacity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if( StringUtils.isEmpty(state) )
			Asserter.fail(this.getClass(),"state");
		this.state = state;
	}
	@Override
	public String getResType() {
		return "NEL";
	}
	@Override
	public String getFileRmUID() {
		return this.rmUID;
	}
	

}
