package test.superhy.service;

import org.superhy.bean.ComputorInfo;
import org.superhy.service.MonitorService;
import org.superhy.service.MonitorServiceImpl;

public class MonitorServiceTest {

	/**
	 * ���Է���.
	 * 
	 * @param args
	 * @throws Exception
	 * @author superhy
	 */
	public static void main(String[] args) throws Exception {

		MonitorService service = new MonitorServiceImpl();
		ComputorInfo monitorInfo = service.getComputerInfo();
		System.out.println("cpuռ����=" + monitorInfo.getCpuRatio() + "%");

		System.out.println("��ʹ���ڴ�=" + monitorInfo.getTotalMemory());
		System.out.println("ʣ���ڴ�=" + monitorInfo.getFreeMemory());
		System.out.println("����ʹ���ڴ�=" + monitorInfo.getMaxMemory());

		System.out.println("����ϵͳ=" + monitorInfo.getOsName());
		System.out.println("�ܵ������ڴ�=" + monitorInfo.getTotalMemorySize() + "kb");
		System.out.println("ʣ��������ڴ�=" + monitorInfo.getFreeMemory() + "kb");
		System.out.println("��ʹ�õ������ڴ�=" + monitorInfo.getUsedMemory() + "kb");
		System.out.println("�߳�����=" + monitorInfo.getTotalThread() + "kb");
	}
}
