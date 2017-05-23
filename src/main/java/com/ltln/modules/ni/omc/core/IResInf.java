package com.ltln.modules.ni.omc.core;

import java.util.List;

import com.ltln.modules.ni.omc.core.annotation.Facade;
import com.ltln.modules.ni.omc.core.vo.CmCard;
import com.ltln.modules.ni.omc.core.vo.CmEth;
import com.ltln.modules.ni.omc.core.vo.CmEthSPInfo;
import com.ltln.modules.ni.omc.core.vo.CmEthSerciePWInfo;
import com.ltln.modules.ni.omc.core.vo.CmHolder;
import com.ltln.modules.ni.omc.core.vo.CmLabelSwitch;
import com.ltln.modules.ni.omc.core.vo.CmNE;
import com.ltln.modules.ni.omc.core.vo.CmOMC;
import com.ltln.modules.ni.omc.core.vo.CmPW;
import com.ltln.modules.ni.omc.core.vo.CmPWPW;
import com.ltln.modules.ni.omc.core.vo.CmPWTunnel;
import com.ltln.modules.ni.omc.core.vo.CmPort;
import com.ltln.modules.ni.omc.core.vo.CmPortBinding;
import com.ltln.modules.ni.omc.core.vo.CmSubNet;
import com.ltln.modules.ni.omc.core.vo.CmSubNetNe;
import com.ltln.modules.ni.omc.core.vo.CmTDM;
import com.ltln.modules.ni.omc.core.vo.CmTopoLink;
import com.ltln.modules.ni.omc.core.vo.CmTunnel;
import com.ltln.modules.ni.omc.core.vo.CmTunnelPGBackupInfo;
import com.ltln.modules.ni.omc.core.vo.CmTunnelPGInfo;

/**
 * ��Դ�ɼ��ӿ�
 *
 */
@Facade(serviceName="IResInf",serviceBean="resInfImpl")
public interface IResInf {

	/**
	 * 获取omc
	 * @return CmOMC
	 */
	CmOMC getCmOMC();
	/**
	 * 获取网元
	 * @return CmNE
	 */
	List<CmNE> getCmNE();
	/**
	 * 获取容器
	 * @return CmHolder
	 */
	List<CmHolder> getCmHolder();
	/**
	 * 获取板卡
	 * @return CmCard
	 */
	List<CmCard> getCmCard();
	/**
	 * 获取端口
	 * @return CmPort
	 */
	List<CmPort> getCmPort();
	/**
	 * 获取端口绑定
	 * @return CmPortBinding
	 */
	List<CmPortBinding> getCmPortBinding();
	/**
	 * 获取隧道
	 * @return CmTunnel
	 */
	List<CmTunnel> getCmTunnel();
	/**
	
	 * 获取标签交换
	 * @return CmLabelSwitch
	 */
	
	List<CmLabelSwitch> getCmLabelSwitch();
	
	/**
	 * 获取隧道保护组-基本信息
	 * @return CmTunnelPGInfo
	 */
	List<CmTunnelPGInfo> getCmTunnelPGInfo();
	
	/**
	 * 获取隧道保护组-主备用隧道
	 * @return CmTunnelPGBackupInfo
	 */
	List<CmTunnelPGBackupInfo> getCmTunnelPGBackupInfo();
	
	/**
	 * 获取伪线
	 * @return CmPW
	 */
	List<CmPW> getCmPW();
	
	/**
	 * 获取伪线间承载关系
	 * @return CmPWPW
	 */
	List< CmPWPW> getCmPWPW();
	
	/**
	 * 获取伪线隧道承载关系
	 * @return CmPWTunnel
	 */
	List<CmPWTunnel> getCmPWTunnel();
	
	/**
	 * 获取以太网业务
	 * @return CmEth
	 */
	List<CmEth> getCmEth();
	
	/**
	 * 获取以太网业务接入点
	 * @return CmEthSPInfo
	 */
	List<CmEthSPInfo> getCmEthSPInfo();
	
	/**
	 * 获取以太网业务承载伪线
	 * @return CmEthSerciePWInfo
	 */
	List<CmEthSerciePWInfo> getCmEthSerciePWInfo();
	
	
	/**
	 * 获取TDM业务
	 * @return CmTDM
	 */
	List<CmTDM> getCmTDM();
	
	
	/**
	 * 获取拓扑连接
	 * @return CmTopoLink
	 */
	List<CmTopoLink> getCmTopoLink();
	
	
	/**
	 * 获取子网（包含子网与子网关系）
	 * @return CmSubNet
	 */
	List<CmSubNet> getCmSubNet();
	

	/**
	 * 获取子网与网元关系
	 * @return CmSubNetNe
	 */
	List<CmSubNetNe> getCmSubNetNe();
	
	
	
	
}
