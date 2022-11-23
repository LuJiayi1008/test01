package com.longIt.service;

import java.util.List;
import java.util.Map;
import com.longIt.pojo.Bill;
import com.longIt.pojo.Provider;
import com.longIt.tools.Page;

public interface BillService {
	
	Page<Bill> findBillByPage(Map<String,Object> map);

	Integer delectBill(Integer id);
	
	Integer addBill(Bill bill);
	
	Integer updateBill(Bill bill);
	
	Bill findBillByid(Integer id);
	
	List<Provider> showProviderinfo();
}
