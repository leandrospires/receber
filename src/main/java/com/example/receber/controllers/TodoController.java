package com.example.receber.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.receber.domain.Receber;
import com.example.receber.utils.Utils;

@Controller
public class TodoController {

	@GetMapping("/testeservice")
	@ResponseBody
	public String index() {
		
		System.out.println(Utils.daHoraLog() + "Serviço disponível: Status OK");
		
		return "api";
	}
	
	@GetMapping("/testeservice/valida")
	@ResponseBody
	public Map<String, String> versao() {
		
		System.out.println(Utils.daHoraLog() + "API: Status OK");
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("app", "testeService");
		map.put("now", new Date().toString());
		
		return map;
		
	}
	
	@GetMapping("testeservice/receber")
	@ResponseBody
	public Map<String, Receber> receber(){
		
		HashMap<String, Receber> recebido = new HashMap<>();
		Receber rec = new Receber();
		
		rec.setId(1);
		rec.setDados("dados recebidos");
		
		recebido.put("Recebido", rec);
		
		return recebido;
	}
	
}
