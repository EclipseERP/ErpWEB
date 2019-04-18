package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.ToppingsList;
import com.ets.csm.repository.ToppingRepository;


@Service
public class ToppingServiceImpl implements ToppingService {
	
	@Autowired
	private ToppingRepository toppingRepository;

	@Override
	public List getAllToppings() {
		return toppingRepository.getAllToppings();
	}

	@Override
	public List getAllToppingsById(Integer id) {
		return toppingRepository.getAllToppingsById(id);
	}

	@Override
	public void saveTopp(ToppingsList topp) {
		toppingRepository.save(topp);		
	}

	@Override
	public void removeTopp(ToppingsList topp) {
		toppingRepository.delete(topp);		
	}

	@Override
	public void saveOrUpdateTopp(ToppingsList topp) {
		toppingRepository.save(topp);		
	}

}
