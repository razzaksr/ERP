package academy.erp.ZealousERP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademyRestServer 
{
	@Autowired
	AcademyServices service;
	
	@GetMapping("/")
	public List<Academy> view()
	{
		return service.printing();
	}
	
	@PostMapping("/")
	public String create(@RequestBody Academy academy)
	{
		return service.inserting(academy).getName()+" has inserted";
	}
}
