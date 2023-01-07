package com.example.receber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.receber.utils.Utils;


@SpringBootApplication
public class ReceberApplication {

	public static void main(String[] args) {
		
		System.out.println(Utils.daHoraLog() + "INICIANDO SPRING BOOT OK");
		SpringApplication.run(ReceberApplication.class, args);
		System.out.println(Utils.daHoraLog() + "FIM SPRING BOOT");
	}

}
