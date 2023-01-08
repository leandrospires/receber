package com.example.receber.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.receber.domain.Receber;
import com.example.receber.domain.ReceberJson;
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
	
	@GetMapping("testeservice/recebermap")
	@ResponseBody
	public Map<String, Receber> receberMap(){
		
		HashMap<String, Receber> recs = new HashMap<>();
		Receber rec1 = new Receber();
		Receber rec2 = new Receber();
		
		rec1.setCod(1);
		rec1.setDados("dados recebidos map 1");
		
		recs.put("Recebido 1", rec1);
		
		rec2.setCod(2);
		rec2.setDados("dados recebidos map 2");
		
		recs.put("Recebido 2", rec2);
		
		return recs;
	}
	
	@GetMapping("testeservice/receberjson")
	@ResponseBody
	public ArrayList<ReceberJson> receberJson(){
		
		ArrayList<ReceberJson> recs = new ArrayList<ReceberJson>();
		ReceberJson rec1 = new ReceberJson();
		ReceberJson rec2 = new ReceberJson();
		
		rec1.setCod(1);
		rec1.setDados("dados recebidos json 1");
		
		recs.add(rec1);
		
		rec2.setCod(2);
		rec2.setDados("dados recebidos json 2");
		
		recs.add(rec2);
		
		return recs;
	}
	
}
