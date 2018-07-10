package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

//商品展示
public interface ItemService {
	EasyUIDataGridResult getItemList(int page,int rows);
}
