package jana60.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("/saluta")
	  public String saluta() {
	    return "home";
	  }
	
	/*
	 * BONUS: 
	 * aggiungete un altro metodo al Controller, 
	 * che risponde al path "/ora" , 
	 * nel quale generate un LocalDateTime con data e ora corrente, 
	 * formattatelo e passatelo alla view come attributo del Model in modo da mostrarlo nella pagina html.
	 */
	
	@GetMapping("/ora")
	public String ora(Model model) {
		String today= LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		model.addAttribute("orario", today);
		return "time";
	}
}
