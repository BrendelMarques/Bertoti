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
	Optional<Beer> getBeerById(@PathVariable String id) {
		for (Beer c: beers) {
			if (c.getId().equals(id)) {
				return Optional.of(c);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Beer postBeer(@RequestBody Beer beer) {
		beers.add(beer);
		return beer;
	}

	@PutMapping("/{id}")
	ResponseEntity<Beer> putBeer(@PathVariable String id,
									@RequestBody Beer beer) {
		int BeerIndex = -1;

		for (Beer c: beers) {
			if (c.getId().equals(id)) {
				beerIndex = beers.indexOf(c);
				beers.set(beerIndex, beer);
			}
		}

		return (beerIndex == -1) ?
				new ResponseEntity<>(postBeer(beer), HttpStatus.CREATED):
				new ResponseEntity<>(beer, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteBeer(@PathVariable String id) {
		beers.removeIf(c -> c.getId().equals(id));
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
