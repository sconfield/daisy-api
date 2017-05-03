package com.sconfield.daisy.service;

public interface BashService<T> {

	T saveOrUpdate(T model);

	void deleteById(String id);

	T getById(String id);

}
