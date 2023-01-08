package com.example.receber.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.receber.domain.Receber;
import com.example.receber.domain.ReceberJson;
import com.example.receber.utils.Utils;

@Controller
public class TodoController {

	@GetMapping("/receberservice")
	@ResponseBody
	public String index() {
		
		System.out.println(Utils.daHoraLog() + " - Serviço disponível: Status OK");
		
		return "api";
	}
	
	@GetMapping("/receberservice/valida")
	@ResponseBody
	public Map<String, String> versao() {
		
		System.out.println(Utils.daHoraLog() + "[TodoController.versao] - API: Status OK");
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("app", "receberService");
		map.put("now", new Date().toString());
		
		return map;
		
	}
	
	@GetMapping("receberservice/recebermap")
	@ResponseBody
	public Map<String, Receber> receberMap(){
		
		System.out.println(Utils.daHoraLog() + "[TodoController.receberMap] - API: Status OK");
		
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
	
	@GetMapping("receberservice/recebermontajson")
	@ResponseBody
	public ArrayList<ReceberJson> receberJson(){
		System.out.println(Utils.daHoraLog() + "[TodoController.receberJson] - MONTA");
		
		ArrayList<ReceberJson> arrayList = new ArrayList<>();
		ReceberJson rec1 = new ReceberJson();
		ReceberJson rec2 = new ReceberJson();
		
		rec1.setCod(110);
		rec1.setDados("Dados montados local 1");
		rec1.setDataHoraAtual( Utils.daHoraLog() );
		
		rec2.setCod(120);
		rec2.setDados("Dados montados local 2");
		rec2.setDataHoraAtual( Utils.daHoraLog() );
		
		arrayList.add(rec1);
		arrayList.add(rec2);
		
		return arrayList;
	}
	
	@PostMapping("receberservice/receberenviajson")
	@ResponseBody
	public ArrayList<ReceberJson> receberJson(@RequestBody ReceberJson rec){
		
		System.out.println(Utils.daHoraLog() + "[TodoController.receberJson] - RECEBE");
		
		ArrayList<ReceberJson> recs = new ArrayList<ReceberJson>();
		rec.setDataHoraAtual( Utils.daHoraLog() );
		
		recs.add(rec);
		
		return recs;
	}
}
