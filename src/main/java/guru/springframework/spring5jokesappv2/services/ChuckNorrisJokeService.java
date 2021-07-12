package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements QuoteService{

    @Override
    public String getQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
