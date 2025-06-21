package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.ashokit.entity.Book;

@RepositoryRestResource(path = "books") // repository + restController  : repository act as rest controller
public interface BookRepository extends JpaRepository<Book, Integer>{

}
