package skyhook.serialization;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static skyhook.serialization.CheeseMatchers.age;
import static skyhook.serialization.CheeseMatchers.name;

/**
 * @author egga
 */
public class JsonTest {

    @Test
    public void shouldSerialize() {
        Cheese object = Cheese.canIHazCheese();
        String json = Json.serialize(object);
        assertThat(json, is(equalTo("{\"age\":37,\"name\":\"Swiss\"}")));
    }

    @Test
    public void shouldDeserialize() {
        String json = "{\"age\":37,\"name\":\"Swiss\"}";
        Cheese object = Json.deserialize(json, Cheese.class);
        assertThat(object, allOf(
                age(is(equalTo(37))),
                name(is(equalTo("Swiss")))
        ));
    }
}
