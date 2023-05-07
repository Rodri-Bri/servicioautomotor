package certant.pruebaTecnica.servicioautomotor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import certant.pruebaTecnica.servicioautomotor.entities.Cliente;
import certant.pruebaTecnica.servicioautomotor.helpers.ViewRouteHelpers;
import certant.pruebaTecnica.servicioautomotor.services.IClienteService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

//	@Autowired
//	@Qualifier("clienteService")
//	private ClienteService clienteService;
//	
//	
//	@GetMapping("/agenda")
//	public ModelAndView misPrestamos() {
//		ModelAndView mAV = new ModelAndView(ViewRouteHelpers.AGENDA_MIS_CLIENTES);
//		mAV.addObject("elIdQueSaqueDeLaRuta", 1);
//		
//		List<Cliente> clientes = clienteService.getAll();
//		
//		mAV.addObject("id", 1);
//		mAV.addObject("clientes", clientes);
//		mAV.addObject("cliente", new Cliente());
//		return mAV;
//	}
//	
//	@PostMapping("/create")
//	public RedirectView create(@ModelAttribute("cliente") Cliente cliente) {
//	clienteService.insertOrUpdate(cliente);
//	return new RedirectView(ViewRouteHelpers.REDIRECT_AGENDA_MIS_CLIENTES);	
//	}
}