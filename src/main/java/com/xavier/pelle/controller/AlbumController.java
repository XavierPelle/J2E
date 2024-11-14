package com.xavier.pelle.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.pelle.dto.AlbumDto;
import com.xavier.pelle.service.AlbumService;


@RestController
@RequestMapping("album")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@GetMapping()
	public Collection<AlbumDto> getAllAlbum() {
		return albumService.getAllAlbum();
	}
	
	@GetMapping("/{id}")
	public AlbumDto getAlbum(@PathVariable("id") long id) {
		return albumService.getAlbum(id);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteAlbum(@PathVariable("id") long id) {
		return albumService.deleteAlbum(id);
	}
	
	@PostMapping()
	public AlbumDto createAlbum(@RequestBody AlbumDto albumDto) {
		return albumService.createAlbum(albumDto);
	}
	
	@PutMapping()
	public AlbumDto updateAlbum(@RequestBody AlbumDto albumDto) {
		return albumService.updateAlbum(albumDto);
	}
	
	@GetMapping("populate")
	public void populate() {
		AlbumDto albumDto = new AlbumDto();
		albumDto.setTitle("Album 1");
		albumDto.setArtist("Toto");
		albumDto.setGenre("Rap");
		albumDto.setReleaseDate("2024-03-10");
		albumDto.setStatus("Disponible");
		albumService.createAlbum(albumDto);
		
	}
}
