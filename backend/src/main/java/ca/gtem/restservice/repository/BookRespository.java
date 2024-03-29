package ca.gtem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ca.gtem.restservice.entity.Book;

@RepositoryRestResource(path = "/books")
public interface BookRespository extends JpaRepository<Book,String>{

}
