package hello;

import org.springframework.web.bind.annotation.*;

@RestController
class PersonRestController {

	private final PersonService personService;

	public PersonRestController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/person/{id}")
	public Person findPersonById(@PathVariable("id") Long id) {
		return personService.findPersonById(id);
	}

	@PutMapping("/person")
	public Person createPerson(@RequestParam Person person) { return personService.createPerson(person); }

}
