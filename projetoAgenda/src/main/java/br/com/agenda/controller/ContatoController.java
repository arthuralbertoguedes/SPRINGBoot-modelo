package br.com.agenda.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.model.Contato;
import br.com.agenda.service.ContatoService;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
	     
	  @Autowired
      private ContatoService contatoService;
	  
	  
	  
	  	@RequestMapping(value = "/save", method = RequestMethod.POST	)
		Contato save(@RequestBody Contato contato) {
			return contatoService.save(contato);
		}
	  	

		// Single item

		@RequestMapping(value = "/{id}", method = RequestMethod.GET	)
		Contato findOne(@PathVariable Long id) {
			return contatoService.findByID(id);				
		}
	  
	  
      
//
//      	@RequestMapping(value = "/{nome}", method = RequestMethod.GET	)
//      	public void index(@PathVariable("nome") String nome, HttpServletResponse response, HttpServletRequest request) {
//      		Contato novoContato;
//      		if(nome.equals("arthur")) 
//      			novoContato = new Contato(nome, "(62) 98173-4412", "Rua C-143", Calendar.getInstance().getTime());
//      		
//      		else if(nome.contentEquals("carlos"))
//      			novoContato = new Contato(nome, "(11) 89589-5454", "Rua Nova Aurora, Centro", Calendar.getInstance().getTime());
//      		
//      		else if(nome.equals("alex"))
//      			novoContato = new Contato(nome, "(24) 49241-2345", "Rua T9, Jardim Europa", Calendar.getInstance().getTime());
//      		
//      		else {
//      			novoContato = new Contato("Contato nao encontrado", "0000-0000", "Rua Desconhecida", Calendar.getInstance().getTime());
//      		}
//      		
//      		Gson gson = new Gson();
//      		String contatoJson = gson.toJson(novoContato);
//      		
//      		try {
//				response.getWriter().println(contatoJson);
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//      	}
//      	
//      	@RequestMapping("/novoContato")
//      	public String redirect() {
//      		System.out.println("Cadastrar Contato !!!");
//      		return "novoContato";
//      	}
//      	
      	@RequestMapping("/")
      	public String index() {
      		
      		return "index";
      	}
      	
      	
      	
      	
      	
      
     
	
}
