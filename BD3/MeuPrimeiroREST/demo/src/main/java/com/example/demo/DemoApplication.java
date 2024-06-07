package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/beers")
class RestApiDemoController {
	private List<Beer> beers = new ArrayList<>();

	public RestApiDemoController() {
		beers.addAll(List.of(
				new Beer("Corona"),
				new Beer("Heineken"),
				new Beer("Budweiser"),
				new Beer("Original")
		));
	}

	@GetMapping("/{id}")
	ResponseEntity<Beer> getBeerById(@PathVariable String id) {
		Optional<Beer> beer = beers.stream()
				.filter(b -> b.getId().equals(id))
				.findFirst();
		return beer.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	ResponseEntity<Beer> postBeer(@RequestBody Beer beer) {
		beers.add(beer);
		return ResponseEntity.status(HttpStatus.CREATED).body(beer);
	}

	@PutMapping("/{id}")
	ResponseEntity<Beer> putBeer(@PathVariable String id, @RequestBody Beer beer) {
		Optional<Beer> existingBeer = beers.stream()
				.filter(b -> b.getId().equals(id))
				.findFirst();
		if (existingBeer.isPresent()) {
			int index = beers.indexOf(existingBeer.get());
			beers.set(index, beer);
			return ResponseEntity.ok(beer);
		} else {
			beers.add(beer);
			return ResponseEntity.status(HttpStatus.CREATED).body(beer);
		}
	}

	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteBeer(@PathVariable String id) {
		boolean removed = beers.removeIf(b -> b.getId().equals(id));
		return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
	}
}

class Beer {
	private final String id;
	private String name;

	public Beer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Beer(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

