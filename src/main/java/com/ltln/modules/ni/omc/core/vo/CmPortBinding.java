package com.ltln.modules.ni.omc.core.vo;

import org.apache.commons.lang3.StringUtils;

import com.ltln.modules.ni.omc.core.Asserter;

public class CmPortBinding extends BaseVO {

	private static final long serialVersionUID = -3250556196110779597L;
	/**
	 * 名称：逻辑端口rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 
	 * 数据示例:
	 */
	String logPortrmUID;
	/**
	 * 名称：所属网元rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 
	 * 数据示例:
	 */
	String nermUID;
	/**
	 * 名称：物理端口rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 
	 * 数据示例:
	 */
	String phyPortrmUID;
	/**
	 * 名称：物理端口所属板卡rmUID
	 * 最大长度:
	 * 是否必填是
	 * 取值范围及说明 
	 * 数据示例:
	 */
	String phyPortParentCardrmUID;
	/**
	 * 名称：逻辑端口所属板卡rmUID
	 * 最大长度:
	 * 是否必填否
	 * 取值范围及说明 ：当逻辑口归属于板卡时必填
	 * 数据示例:
	 */
	String logPortParentCardrmUID="";

                  @Override
                  public String getFileRmUID() {
                      //excel中无，但样例中与phyPortrmUID一致
                      return this.phyPortrmUID;
                  }
                  
	public String getLogPortrmUID() {
		return logPortrmUID;
	}
	public void setLogPortrmUID(String logPortrmUID) {
		if( StringUtils.isEmpty(logPortrmUID)  )
			Asserter.fail(this.getClass(),"logPortrmUID");
		this.logPortrmUID = logPortrmUID;
	}
	public String getNermUID() {
		return nermUID;
	}
	public void setNermUID(String nermUID) {
		if( StringUtils.isEmpty(nermUID)  )
			Asserter.fail(this.getClass(),"nermUID");
		this.nermUID = nermUID;
	}
	public String getPhyPortrmUID() {
		return phyPortrmUID;
	}
	public void setPhyPortrmUID(String phyPortrmUID) {
		if( StringUtils.isEmpty(phyPortrmUID)  )
			Asserter.fail(this.getClass(),"phyPortrmUID");
		this.phyPortrmUID = phyPortrmUID;
	}
	public String getPhyPortParentCardrmUID() {
		return phyPortParentCardrmUID;
	}
	public void setPhyPortParentCardrmUID(String phyPortParentCardrmUID) {
		if( StringUtils.isEmpty(phyPortParentCardrmUID)  )
			Asserter.fail(this.getClass(),"phyPortParentCardrmUID");
		this.phyPortParentCardrmUID = phyPortParentCardrmUID;
	}
	public String getLogPortParentCardrmUID() {
		return logPortParentCardrmUID;
	}
	public void setLogPortParentCardrmUID(String logPortParentCardrmUID) {
                                    if (StringUtils.isEmpty(logPortParentCardrmUID)){
                                                      logPortParentCardrmUID = "";
                                    }
		this.logPortParentCardrmUID = logPortParentCardrmUID;
	}
	@Override
	public String getResType() {
		return "PRB";
	}

}
