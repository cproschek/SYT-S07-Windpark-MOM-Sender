package windpark;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.util.Timer;
import java.util.TimerTask;

public class MOMSender {

  private static String user = ActiveMQConnection.DEFAULT_USER;
  private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
  private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	
  public MOMSender(String queue) {
		
	  System.out.println( "Sender started." );

	  // Create the connection.
	  Session session = null;
	  Connection connection = null;
	  MessageProducer producer = null;
	  Destination destination = null;
			
	  try {
	    	
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory( user, password, url );
			connection = connectionFactory.createConnection();
			connection.start();
		
			// Create the session
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			destination = session.createQueue(queue);
				  
			// Create the producer.
			producer = session.createProducer(destination);
			producer.setDeliveryMode( DeliveryMode.NON_PERSISTENT );

		  	WindengineSimulation windengineSimulation = new WindengineSimulation();

			// Create the message
				TextMessage message = session.createTextMessage(windengineSimulation.getData(queue).toString());
				producer.send(message);
				System.out.println(message.getText());

			connection.stop();
	      
	  } catch (Exception e) {
	  	
	  	System.out.println("[MessageProducer] Caught: " + e);
	  	e.printStackTrace();
	  	
	  } finally {
	  	
			try { producer.close(); } catch ( Exception e ) {}
			try { session.close(); } catch ( Exception e ) {}
			try { connection.close(); } catch ( Exception e ) {}
			
	  }
	  System.out.println( "Sender finished." );
      
  } // end main
	
}
