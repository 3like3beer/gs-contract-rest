package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController() {
    }


    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") Long id) {
        return personService.findPersonById(id);
    }

}
