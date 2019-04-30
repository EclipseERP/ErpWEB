package com.ets.csm.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


import com.ets.csm.model.Items;


public interface ItemService {
	public List getAllItems();
	public List getAllItemsByID(int id);

}
