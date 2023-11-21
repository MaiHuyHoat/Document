package com.ead.app.Service;

import java.util.List;

public interface BaseService <T> {
    public List<T> GetAll();
    public T GetDetail(long id);
    public boolean save(T model);

    public boolean Delete(Long id);
}
