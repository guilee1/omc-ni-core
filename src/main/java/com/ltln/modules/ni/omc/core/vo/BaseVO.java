package com.ltln.modules.ni.omc.core.vo;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.ltln.modules.ni.omc.core.util.ResFileUtil;

public abstract class BaseVO implements Serializable {

	private static final long serialVersionUID = -4140148688429592689L;

	
	@Override
	public String toString() {
		return ResFileUtil.getObjectToXml(ResFileUtil.buildFieldObject(this));
	}

	
	@JSONField(serialize = false)
	abstract public String getResType();
	
	@JSONField(serialize = false)
	abstract public String getFileRmUID();
}
