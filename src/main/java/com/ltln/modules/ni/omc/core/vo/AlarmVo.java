package com.ltln.modules.ni.omc.core.vo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders = { "alarmSeq", "alarmTitle", "alarmStatus", "alarmType",
		"origSeverity", "eventTime", "alarmId", "specificProblemID",
		"specificProblem", "neUID", "neName", "neType", "objectUID",
		"objectName", "objectType", "locationInfo", "addInfo", "holderType",
		"alarmCheck", "layer" })
public class AlarmVo extends BaseVO implements Comparable<AlarmVo> {

	private static final long serialVersionUID = 465215665335803578L;

	private long id;

	private int alarmSeq;

	private String alarmTitle;

	private int alarmStatus;

	private String alarmType;

	private int origSeverity;

	private String eventTime;

	private long eventTimeMills;

	private String logTime;

	private String alarmId;

	private String specificProblemID;

	private String specificProblem;

	private String neUID;

	private String neName;

	private String neType;

	private String objectUID;

	private String objectName;

	private String objectType;

	private String locationInfo;

	private String addInfo;

	private String holderType;

	private String alarmCheck;

	private int layer;
	private String ipAddress;

	@JSONField(serialize = false)
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public AlarmVo(int alarmSeq2) {
		this.alarmSeq = alarmSeq2;
	}

	public AlarmVo() {
	}

	public String getAlarmTitle() {
		return alarmTitle;
	}

	public void setAlarmTitle(String alarmTitle) {
		this.alarmTitle = alarmTitle;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	@JSONField(serialize = false)
	public long getEventTimeMills() {
		return eventTimeMills;
	}

	public void setEventTimeMills(long eventTimeMills) {
		this.eventTimeMills = eventTimeMills;
	}

	public String getSpecificProblemID() {
		return specificProblemID;
	}

	public void setSpecificProblemID(String specificProblemID) {
		this.specificProblemID = specificProblemID;
	}

	public String getNeUID() {
		return neUID;
	}

	public void setNeUID(String neUID) {
		this.neUID = neUID;
	}

	public String getNeName() {
		return neName;
	}

	public void setNeName(String neName) {
		this.neName = neName;
	}

	public String getNeType() {
		return neType;
	}

	public void setNeType(String neType) {
		this.neType = neType;
	}

	public String getObjectUID() {
		return objectUID;
	}

	public void setObjectUID(String objectUID) {
		this.objectUID = objectUID;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getLocationInfo() {
		return locationInfo;
	}

	public void setLocationInfo(String locationInfo) {
		this.locationInfo = locationInfo;
	}

	public String getAddInfo() {
		return addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	@JSONField(serialize = false)
	public String getLogTime() {
		return logTime;
	}

	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public String getSpecificProblem() {
		return specificProblem;
	}

	public void setSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
	}

	public String getHolderType() {
		return holderType;
	}

	public void setHolderType(String holderType) {
		this.holderType = holderType;
	}

	public String getAlarmCheck() {
		return alarmCheck;
	}

	public void setAlarmCheck(String alarmCheck) {
		this.alarmCheck = alarmCheck;
	}

	public int getAlarmSeq() {
		return alarmSeq;
	}

	public void setAlarmSeq(int alarmSeq) {
		this.alarmSeq = alarmSeq;
	}

	@JSONField(serialize = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int compareTo(AlarmVo o) {
		if (o.alarmSeq == this.alarmSeq)
			return 0;
		return o.alarmSeq < this.alarmSeq ? 1 : -1;
	}

	public int getOrigSeverity() {
		return origSeverity;
	}

	public void setOrigSeverity(int origSeverity) {
		this.origSeverity = origSeverity;
	}

	public void setAlarmStatus(int alarmStatus) {
		this.alarmStatus = alarmStatus;
	}

	public int getAlarmStatus() {
		return alarmStatus;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	@Override
	public String toString() {
		// StringBuilder sb = new StringBuilder();
		// sb.append("Id=").append(this.id)
		// .append(";AlarmSeq=").append(this.alarmSeq)
		// .append(";AlarmTitle=").append(this.alarmTitle)
		// .append(";AlarmStatus=").append(this.alarmStatus)
		// .append(";AlarmType=").append(this.alarmType)
		// .append(";OrigSeverity=").append(this.origSeverity)
		// .append(";EventTime=").append(this.eventTime)
		// .append(";EventTimeMills=").append(this.eventTimeMills)
		// .append(";LogTime=").append(this.logTime)
		// .append(";AlarmId=").append(this.alarmId)
		// .append(";SpecificProblemID=").append(this.specificProblemID)
		// .append(";SpecificProblem=").append(this.specificProblem)
		// .append(";NeUID=").append(this.neUID)
		// .append(";NeName=").append(this.neName)
		// .append(";NeType=").append(this.neType)
		// .append(";ObjectUID=").append(this.objectUID)
		// .append(";ObjectName=").append(this.objectName)
		// .append(";ObjectType=").append(this.objectType)
		// .append(";LocationInfo=").append(this.locationInfo)
		// .append(";AddInfo=").append(this.addInfo)
		// .append(";HolderType=").append(this.holderType)
		// .append(";AlarmCheck=").append(this.alarmCheck)
		// .append(";Layer=").append(this.layer);
		// return sb.toString();
		return this.toJson();
	}

	public String toJson() {
		return JSON.toJSONString(this);
	}

	@JSONField(serialize = false)
	public String getResType() {
		// TODO Auto-generated method stub
		return null;
	}

	@JSONField(serialize = false)
	public String getFileRmUID() {
		// TODO Auto-generated method stub
		return null;
	}
}
