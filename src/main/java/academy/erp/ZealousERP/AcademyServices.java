package academy.erp.ZealousERP;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademyServices 
{
	@Autowired
	AcademyRepository repo;
	
	public Academy inserting(Academy academy)
	{
		return repo.save(academy);
	}
	
	public List<Academy> printing()
	{
		return repo.findAll();
	}
	
	public Optional<Academy> gettingOne(long id)
	{
		return repo.findById(id);
	}
	
	public String deleting(long id)
	{
		String h=repo.getById(id).getName()+" has deleted";
		repo.deleteById(id);
		return h;
	}
	
	public String deletingNode(Academy academy)
	{
		String h=academy.getName()+" has deleted";
		repo.delete(academy);
		return h;
	}
	
}
