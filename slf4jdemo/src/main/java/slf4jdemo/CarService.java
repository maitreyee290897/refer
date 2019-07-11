package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

	private static Logger log=LoggerFactory.getLogger(CarService.class);
	public static void process(String msg) {
		if(log.isDebugEnabled())
			log.debug("Processing car "+msg);

		log.debug("process car in smart way : {}",msg);
		log.info("processingggg!!! : {}",msg);
		log.error("processingggg!!! : {}",msg);
		
		//log.debug("processingggg!!! : {}",msg);
		System.out.println("hiii done !!");
	}
}
