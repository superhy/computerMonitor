package org.superhy.service;

import org.superhy.bean.ComputorInfo;

/**
 * 获取系统信息的业务逻辑类接口.
 * 
 * @author superhy
 */
public interface MonitorService {
	/** */
	/**
	 * 获得当前的监控对象.
	 * 
	 * @return 返回构造好的监控对象
	 * @throws Exception
	 * @author superhy
	 */
	public ComputorInfo getComputerInfo() throws Exception;

}