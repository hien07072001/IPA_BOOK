package com.codegym.book.repository;

import com.codegym.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
//    public interface JpaRepository<T, ID extends Serializable> extends
//  PagingAndSortingRepository<T, ID> {
//    // Lấy ra tất cả các bản ghi, trả về đối tượng List
//    List<T> findAll();
//    // Lấy tất cả các bản ghi và sort theo tham số truyền vào
//    // Trả về 1 đối tượng kiểu List
//    List<T> findAll(Sort sort);
//    // Đối tượng truyền vào có kiểu Iterable (như kiểu List, Set, Queue, Stack...)
//    // Ta có thể truyền vào nhiều đối tượng để lưu theo lôi
//    List<T> save(Iterable<? extends T> entities);
//    // Đồng bộ từ PersistenceContext đến CSDL
//    void flush();
//    // Lưu đối tượng vào PersistenContext, sau đó flush luôn
//    T saveAndFlush(T entity);
//    // Xóa các đối tượng bên trong Iterable. Ta có thể xóa nhiều đối tượng (theo lô)
//    void deleteInBatch(Iterable<T> entities);
//}
}
