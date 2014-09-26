package skyhook.serialization;

import org.hamcrest.Matcher;
import org.hamsandwich.core.HamSandwichFactory;

import static org.hamsandwich.core.ReplayMatcher.on;
import static org.hamsandwich.core.ReplayMatcher.replayMatcher;

/**
 * @author egga
 */
public class CheeseMatchers {

    @HamSandwichFactory
    public static Matcher<Cheese> age(Matcher<Integer>... matchers) {
        return replayMatcher(on(Cheese.class).getAge(), matchers);
    }

    @HamSandwichFactory
    public static Matcher<Cheese> name(Matcher<String>... matchers) {
        return replayMatcher(on(Cheese.class).getName(), matchers);
    }

}
