package org.superhy.service;

import org.superhy.bean.ComputorInfo;

/**
 * ��ȡϵͳ��Ϣ��ҵ���߼���ӿ�.
 * 
 * @author superhy
 */
public interface MonitorService {
	/** */
	/**
	 * ��õ�ǰ�ļ�ض���.
	 * 
	 * @return ���ع���õļ�ض���
	 * @throws Exception
	 * @author superhy
	 */
	public ComputorInfo getComputerInfo() throws Exception;

}