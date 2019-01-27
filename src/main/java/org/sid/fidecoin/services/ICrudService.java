package org.sid.fidecoin.services;



import java.util.List;

public interface ICrudService<T, ID> {

    List<T> getaLL();

    void add(T entity);

    void update(T entity);

    void delete(ID id);
}
