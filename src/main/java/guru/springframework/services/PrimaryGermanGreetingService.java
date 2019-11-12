package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    //**Added by Sajjad , if you want to do DI using setters
//    @Autowired
//    private GreetingRepository greetingRepository;
//
//    public void setGreetingRepository(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }


    //**Use Constructor based DI
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        System.out.println("German Greeting Service");
        return greetingRepository.getGermanGreeting();
    }
}
