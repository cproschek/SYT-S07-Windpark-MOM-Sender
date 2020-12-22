package windpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import javax.jms.JMSException;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class MOMApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MOMApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				new MOMSender("windengine.001");
				new MOMSender("windengine.002");
			}
		};
		Timer t = new Timer();
		t.schedule(tt, 0, 5000);
	}

}
