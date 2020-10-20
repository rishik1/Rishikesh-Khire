package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.Room;
import com.example.demo.data.repository.RoomRepository;




@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.*"})
public class boot {

	public static void main(String[] args) {
		SpringApplication.run(boot.class, args);
	}
		
		
		@RestController
		@RequestMapping("/rooms")
		public class RoomController{
			
			@Autowired
			private RoomRepository roomRepository;
			
			@GetMapping
			public Iterable<Room> getRooms(){
				return this.roomRepository.findAll();
			}
			
			
		}

}
