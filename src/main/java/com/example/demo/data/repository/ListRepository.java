package com.example.demo.data.repository;
import com.example.demo.data.entity.ListEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<ListEntitiy, Long>{

}
