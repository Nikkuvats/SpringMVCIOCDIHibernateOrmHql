package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Service.ServiceInterface;

@Controller
public class AbhiController {
	
	@Autowired
	ServiceInterface si;

	@RequestMapping(value="newname")
	public @ResponseBody String newname(String a, String b){
		
		si.insert(a,b);
		return "ok";
	}
}
