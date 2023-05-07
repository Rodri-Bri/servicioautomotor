package certant.pruebaTecnica.servicioautomotor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import certant.pruebaTecnica.servicioautomotor.entities.AceiteYfiltro;
import certant.pruebaTecnica.servicioautomotor.entities.Agenda;
import certant.pruebaTecnica.servicioautomotor.entities.AlineacionYbalanceo;
import certant.pruebaTecnica.servicioautomotor.entities.Cliente;
import certant.pruebaTecnica.servicioautomotor.entities.Lavado;
import certant.pruebaTecnica.servicioautomotor.entities.ServiciosBasicos;
import certant.pruebaTecnica.servicioautomotor.helpers.ViewRouteHelpers;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AceiteYfiltroService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AgendaService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.AlineacionYbalanceoService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.ClienteService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.LavadoService;
import certant.pruebaTecnica.servicioautomotor.services.implementacion.ServicioBasicoService;


@Controller
@RequestMapping("/agendas")
public class AgendaController {
	
	@Autowired
	@Qualifier("agendaService")
	private AgendaService agendaService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private AceiteYfiltroService aceiteYfiltroService;
	
	@Autowired
	private AlineacionYbalanceoService alineacionYbalanceoService;
	
	@Autowired
	private LavadoService lavadoService;
	
	@Autowired
	private ServicioBasicoService serviciosBasicosService;


	@GetMapping("/clientes")
    public ModelAndView misPrestamos() {
        ModelAndView mAV = new ModelAndView(ViewRouteHelpers.AGENDA);
       
        List<Cliente> clienteList = clienteService.getAll();
        for(int i = 0; i < clienteList.size(); i++) {
        	if(clienteList.get(i).getCantServiciosContratados() >= 5) {
        		clienteList.get(i).setPremium(true);
        		clienteService.insertOrUpdate(clienteList.get(i));
        	}
        }
        
        mAV.addObject("agendas", agendaService.getAll());
        System.out.println(agendaService.getAll());
        
        mAV.addObject("clientes", clienteList);
        
        mAV.addObject("elIdQueSaqueDeLaRuta", 1);
        mAV.addObject("id", 1);
        mAV.addObject("aceiteYfiltro", new AceiteYfiltro());
        mAV.addObject("agenda", new Agenda());
        mAV.addObject("alineacionYbalanceo", new AlineacionYbalanceo());
        mAV.addObject("cliente", new Cliente());
        mAV.addObject("lavado", new Lavado());
        mAV.addObject("servicioContratado", new ServiciosBasicos());
        return mAV;
    }

    @PostMapping("/create")
    public RedirectView create(@ModelAttribute("agenda") Agenda agenda, @ModelAttribute("cliente") Cliente cliente,
    		 @ModelAttribute("aceiteYfiltro") AceiteYfiltro aceiteYfiltro,  @ModelAttribute("alineacionYbalanceo") AlineacionYbalanceo alineacionYbalanceo,
    		 @ModelAttribute("lavado") Lavado lavado) {
    	
    	
    	Cliente clientebd = clienteService.findByPatente(cliente.getPatente());
    	
    	
    	if(clientebd != null) {
    		cliente.setPremium(clientebd.isPremium());
    		cliente.setIdCliente(clientebd.getIdCliente());
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+clientebd.getCantServiciosContratados());
    	}
    	
    	
    	double total = calcularTotal(lavado, aceiteYfiltro, alineacionYbalanceo, cliente);

    	
    	ServiciosBasicos servicioBasico = new ServiciosBasicos();
    	
    	servicioBasico.setAceiteYfiltro(aceiteYfiltro);
    	aceiteYfiltroService.insertOrUpdate(aceiteYfiltro);
    	
    	servicioBasico.setAlineacionYbalanceo(alineacionYbalanceo);
    	alineacionYbalanceoService.insertOrUpdate(alineacionYbalanceo);
    	
    	servicioBasico.setLavado(lavado);
    	lavadoService.insertOrUpdate(lavado);

    	
    	System.out.println(cliente.isPremium());
    	if(cliente.isPremium()) {
    		agenda.setCalcularPrecioServicio(total - total * 0.20);
    		cliente.setPremium(false);
    		cliente.setCantServiciosContratados(0);
    	}else {
    		agenda.setCalcularPrecioServicio(total); 		
    	}
    	
    	serviciosBasicosService.insertOrUpdate(servicioBasico);
    	clienteService.insertOrUpdate(cliente);
    	
    	agenda.setServicioContratados(servicioBasico);
    	agenda.setCliente(cliente);

    	agendaService.insertOrUpdate(agenda);
    
    return new RedirectView(ViewRouteHelpers.REDIRECT_AGENDA);
    }
    
    public double calcularTotal(Lavado lavado, AceiteYfiltro aceiteYfiltro, AlineacionYbalanceo alineacionYbalanceo, Cliente cliente) {
    	double total = 0;
    	if(lavado.isBasico()) {
    		lavado.setPrecio(1000);
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		total += lavado.getPrecio();
    	}else if(lavado.isPremium()){
    		lavado.setPrecio(2000);
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		total += lavado.getPrecio();
    	}else if(lavado.isCompleto()) {
    		lavado.setPrecio(500);
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		total += lavado.getPrecio();
    	}
    	
    	if(aceiteYfiltro.isAceiteYfiltroBasico()) {
    		aceiteYfiltro.setPrecio(1000);
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		total += aceiteYfiltro.getPrecio();
    	}else if(aceiteYfiltro.isAltoRendimiento()){
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		aceiteYfiltro.setPrecio(2000);
    		total += aceiteYfiltro.getPrecio();
    	}
    	
    	if(alineacionYbalanceo.isCambioDeCubierta()) {
    		alineacionYbalanceo.setPrecio(400);
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		total += alineacionYbalanceo.getPrecio();
    	}else {
    		alineacionYbalanceo.setPrecio(200);
    		cliente.setCantServiciosContratados(cliente.getCantServiciosContratados()+1);
    		total += alineacionYbalanceo.getPrecio();
    	}
    	return total;
    }

}
	
	
	
//	@GetMapping("/clientes")
//    public String createVehiculo(Model model) {
//		List<Agenda> agendas = agendaService.getAll();
//        model.addAttribute("agendas",  agendas);
//        model.addAttribute("clienteList", clienteService.getAll());
//        model.addAttribute("agenda", new Agenda());
//        model.addAttribute("serviciocontratado", new ServiciosBasicos());
//        return ViewRouteHelpers.AGENDA;
//    }
//
//    @PostMapping("/create")
//    public String saveVehiculo(@Validated @ModelAttribute("agenda") Agenda agendaNuevo, Model model) {
//        System.out.println(agendaNuevo);
//    	agendaService.insertOrUpdate(agendaNuevo);
//        return ViewRouteHelpers.REDIRECT_AGENDA;
//    }
	

//}
