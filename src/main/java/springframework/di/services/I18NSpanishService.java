package springframework.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return " Hi- ES";
    }
}
