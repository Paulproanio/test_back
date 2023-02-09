package ec.sevolutivo.sevuelos.sevuelos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.sevolutivo.sevuelos.sevuelos.domain.Request;
import ec.sevolutivo.sevuelos.sevuelos.repository.RequestRepository;

@Service
public class RequestService {
	
	@Autowired
	RequestRepository repo;
	
	public List<Request> findByidGestionarEstPlanta(String destination) {
		List<Request> listaEstados = repo.findAllByName(destination);
		if (listaEstados.size() > 0) {
			return listaEstados;
		} else {
			return new ArrayList<Request>();
		}
	}	

	
	

}
