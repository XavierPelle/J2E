package com.xavier.pelle.service;

import java.util.ArrayList;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xavier.pelle.dto.AlbumDto;
import com.xavier.pelle.model.AlbumModel;
import com.xavier.pelle.repository.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository albumRepository;

	public Collection<AlbumDto> getAllAlbum() {
		return modelsToDtos(albumRepository.findAll());
	}

	public AlbumDto createAlbum(AlbumDto dto) {
		return modelToDto(albumRepository.save(dtoToModel(dto)));
	}

	public AlbumDto updateAlbum(AlbumDto dto) {
		return modelToDto(albumRepository.save(dtoToModel(dto)));
	}

	private Collection<AlbumDto> modelsToDtos(Iterable<AlbumModel> albumModels) {
		Collection<AlbumDto> albumDtos = new ArrayList<>();
		albumModels.forEach(albumModel -> {
			albumDtos.add(modelToDto(albumModel));
		});
		return albumDtos;
	}
	
	private AlbumDto modelToDto(AlbumModel albumModel) {
		AlbumDto albumDto = new AlbumDto();
		albumDto.setId(albumModel.getId());
		albumDto.setTitle(albumModel.getTitle());
		albumDto.setArtist(albumModel.getArtist());
		albumDto.setGenre(albumModel.getGenre());
		albumDto.setReleaseDate(albumModel.getReleaseDate());	
		albumDto.setStatus(albumModel.getStatus());
		return albumDto;
	}

	private AlbumModel dtoToModel(AlbumDto albumDto) {
		AlbumModel albumModel = new AlbumModel();
		albumModel.setId(albumDto.getId());
		albumModel.setTitle(albumDto.getTitle());
		albumModel.setArtist(albumDto.getArtist());
		albumModel.setGenre(albumDto.getGenre());
		albumModel.setReleaseDate(albumDto.getReleaseDate());
		albumModel.setStatus(albumDto.getStatus());
		return albumModel;
	}

	public AlbumDto getAlbum(long id) {
		return modelToDto(albumRepository.findById(id).get());
	}

	public boolean deleteAlbum(long id) {
		albumRepository.deleteById(id);
		return true;
	}
}
