package guru.springframework.sfgdiproject.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
            return "Hello World - from English Greeting Repository Impl !!";
    }
}
