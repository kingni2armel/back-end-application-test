package org.sid;



import org.sid.dao.CategorieRepository;
import org.sid.dao.RoleRepository;
import org.sid.dao.ServiceRepository;
import org.sid.dao.UserRepository;
import org.sid.entitie.Categorie;
import org.sid.entitie.Role;
import org.sid.entitie.Service;
import org.sid.entitie.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication()
public class TestApplication implements CommandLineRunner {
	
	    @Autowired
		private UserRepository userRepository;
	    
	    @Autowired
	    private RoleRepository roleRepository;
	    
	    @Autowired
	    private ServiceRepository serviceRepository;
	    
	    @Autowired
	    private CategorieRepository categorieRepository;
	
	
	    @Autowired
	    private RepositoryRestConfiguration repositoryRestConfiguration;
	

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 repositoryRestConfiguration.exposeIdsFor(Service.class,Categorie.class, Role.class, User.class);
		
		Role r1= new Role("Client");
		Role r2= new Role("Administrateur");
		roleRepository.save(r1);
		roleRepository.save(r2);
		
		User u1= new User(r1,"billong Mbenda1", "695149105", "billongdanald9@gamil.com");
		User u2= new User(r1, "billong Mbenda2", "695149105", "billongdanald9@gamil.com");
		User u3= new User(r2,"billong Mbenda3", "695149105", "billongdanald9@gamil.com");
		 userRepository.save(u1);
		 userRepository.save(u2);
		 userRepository.save(u3);
		
		Categorie c1= new Categorie("informatique");
		Categorie c2= new Categorie("communication");
		Categorie c3= new Categorie("transport");
		 categorieRepository.save(c1);
		 categorieRepository.save(c2);
		 categorieRepository.save(c3);
		
		Service s1= new Service( "production de logo", null, 10000, "service1.JPG", c1);
		Service s2= new Service( "production de site", null, 300000, "service2.JPG", c1);
		Service s3= new Service( "Acheminement des collis", null, 10000, "service3.JPG", c3);
		
		serviceRepository.save(s1);
		serviceRepository.save(s2);
		serviceRepository.save(s3);
	
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

	

}
