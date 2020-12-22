package com.qing.hu.manager;

import com.qing.hu.common.Result;

public interface IEctCnSysLogManager {

	Result seeLog(String id);

	Result seeLogPage(String id, String pageNum, String pageSize);

}
