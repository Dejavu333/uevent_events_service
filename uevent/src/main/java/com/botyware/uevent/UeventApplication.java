package com.botyware.uevent;

import com.botyware.uevent.domain.plugs.CapacityPlug;
import com.botyware.uevent.domain.plugs.QRReaderPlug;
import com.botyware.uevent.repository.IEventRepository;
import com.botyware.uevent.repository.Neo4jEventRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//null object, Entity-component-(system),
@SpringBootApplication
public class UEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(UEventApplication.class, args);
		var eventRepo = new Neo4jEventRepository();
		eventRepo.testQuery();
		eventRepo.createNodeForClass(QRReaderPlug.class);
	}

}
