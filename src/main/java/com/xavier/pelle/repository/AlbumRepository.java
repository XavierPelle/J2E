package com.xavier.pelle.repository;


import org.springframework.data.repository.CrudRepository;
import com.xavier.pelle.model.AlbumModel;

public interface AlbumRepository extends CrudRepository<AlbumModel,Long> {

}
